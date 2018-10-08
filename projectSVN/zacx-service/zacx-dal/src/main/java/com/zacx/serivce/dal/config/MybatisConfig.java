package com.zacx.serivce.dal.config;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * 数据库配置
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-21 15:04
 * @copyright 上海拜米网络科技有限公司
 **/
@Configuration
@EnableTransactionManagement
@MapperScan("com.zacx.serivce.dal.mapper")
public class MybatisConfig {

    @Value("${page-helper.dialect}")
    String dialect;
    @Value("${page-helper.offsetAsPageNum}")
    String offsetAsPageNum;
    @Value("${page-helper.rowBoundsWithCount}")
    String rowBoundsWithCount;
    @Value("${page-helper.reasonable}")
    String reasonable;
    @Value("${page-helper.pageSizeZero}")
    String pageSizeZero;
    @Value("${page-helper.params}")
    String params;
    /**
     * 根据数据源创建SqlSessionFactory
     */
    @Bean
    public SqlSessionFactory getSqlSessionFactory(DataSource dataSource) throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean() ;
        sqlSessionFactoryBean.setDataSource(dataSource) ;

        sqlSessionFactoryBean.setPlugins(new Interceptor[]{ pageHelper()});

        //下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
          //  sqlSessionFactoryBean.setConfigLocation(resolver.getResource("classpath:mybatis.xml"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        //把数据库的下划线列映射到javabean的驼峰属性上  顾理想 add by 2017-5-9
        sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);


        return sqlSessionFactoryBean.getObject();


    }

    /**
     * spring操作mybatis的模板，线程安全性
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    //配置mybatis的分页插件pageHelper
    @Bean
    public PageHelper pageHelper() {
        PageHelper helper = new PageHelper();
        Properties props = new Properties();
        props.setProperty("dialect", dialect);
        props.setProperty("offsetAsPageNum", offsetAsPageNum);
        props.setProperty("rowBoundsWithCount", rowBoundsWithCount);
        props.setProperty("pageSizeZero", pageSizeZero);
        props.setProperty("reasonable", reasonable);
        props.setProperty("params", params);
        helper.setProperties(props);
        return helper;
    }
}
