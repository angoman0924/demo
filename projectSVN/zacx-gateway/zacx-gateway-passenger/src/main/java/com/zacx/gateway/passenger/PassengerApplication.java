package com.zacx.gateway.passenger;

import com.zacx.core.enums.PlatformEnum;
import com.zacx.gateway.base.base.ClientInfo;
import com.zacx.gateway.base.aop.LoginAspect;
import com.zacx.serivce.cache.EnableCache;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootApplication
@EnableCache
@EnableSwagger2
@EnableAsync
@ComponentScan(basePackages = {"com.zacx"})
public class PassengerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassengerApplication.class, args);
    }

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // 1允许任何域名使用
        corsConfiguration.addAllowedHeader("*"); // 2允许任何头
        corsConfiguration.addAllowedMethod("*"); // 3允许任何方法（post、get等）
        return corsConfiguration;
    }

    //跨域配置
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 4
        return new CorsFilter(source);
    }

    protected ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("RESTFUL API Document")
                .description("朕爱租车")
                .license("")
                .licenseUrl("")
                .termsOfServiceUrl("")
                .version("1.0")
                .contact(new Contact("", "", ""))
                .build();
    }

    @Bean
    public LoginAspect loginAspect() {
        return new LoginAspect(PlatformEnum.PASSENGER);
    }

    @Bean
    public Docket swaggerSpringMvcPlugin() {
//        if(StringUtils.isBlank(swaggerProfilesForbid)){
//            swaggerProfilesForbid = "prod";
//        }
//        if(swaggerProfilesForbid.contains(env)){
//            return new Docket(DocumentationType.SWAGGER_2)
//                    .apiInfo(apiInfoOnline())
//                    .select()
//                    .paths(PathSelectors.none())//如果是线上环境，添加路径过滤，设置为全部都不符合
//                    .build();
//        }else{
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        Parameter token = ticketPar.name(ClientInfo.TOKEN).description("用户令牌（跳过验证的方法可以随便输入）").defaultValue("").modelRef(new ModelRef("string")).parameterType("header")
                .required(true).build(); //header中的ticket参数非必填，传空也可以    	pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数

        Parameter lng = ticketPar.name(ClientInfo.LNG).description("手机经度").defaultValue("121.29186").modelRef(new ModelRef("double")).parameterType("header")
                .required(true).build();
        Parameter lat = ticketPar.name(ClientInfo.LAT).description("手机纬度").defaultValue("31.20759").modelRef(new ModelRef("double")).parameterType("header")
                .required(true).build();
        Parameter source = ticketPar.name(ClientInfo.SOURCE).description("来源枚举(IOS,ANDROID,WX_XCX,PC,H5)").defaultValue("PC").modelRef(new ModelRef("string")).parameterType("header")
                .required(true).build();
        Parameter version = ticketPar.name(ClientInfo.VERSION).description("APP的版本").defaultValue("1.0").modelRef(new ModelRef("string")).parameterType("header")
                .required(true).build();

        pars.add(token);
        pars.add(lng);
        pars.add(lat);
        pars.add(source);
        pars.add(version);
        return new Docket(DocumentationType.SWAGGER_2)

                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zacx"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .globalOperationParameters(pars)
                ;
        // }
    }

}
