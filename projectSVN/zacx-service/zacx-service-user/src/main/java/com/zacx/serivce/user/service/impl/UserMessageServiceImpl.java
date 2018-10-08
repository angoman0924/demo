package com.zacx.serivce.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.zacx.core.enums.BooleanEnum;
import com.zacx.core.enums.Code;
import com.zacx.serivce.dal.entity.UMessage;
import com.zacx.serivce.dal.entity.UMessageExample;
import com.zacx.serivce.dal.mapper.UMessageMapper;
import com.zacx.serivce.user.api.dto.UserMessageDTO;
import com.zacx.serivce.user.api.exceptions.UserMessageException;
import com.zacx.serivce.user.service.UserMessageService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.xml.transform.Transformer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 用户站内消息
 * @author lwg
 * @version 1.0
 * @create 2018-10-07 12:01
 */
@Service
public class UserMessageServiceImpl implements UserMessageService {

    @Resource
    private UMessageMapper uMessageMapper;

    /**
     * 新增
     * */
    @Override
    public Integer insertSelective(UserMessageDTO dto) {
        if(dto.getUserId() <= 0){
            throw new UserMessageException(Code.ERROR_ARGUMENT,"用户id错误");
        }
        if(dto.getType() <= 0){
            throw new UserMessageException(Code.ERROR_ARGUMENT,"消息类型设置错误");
        }
        if(StringUtils.isEmpty(dto.getTitle())){
            throw new UserMessageException(Code.ERROR_ARGUMENT,"消息标题不可为空");
        }

        UMessage entity = new UMessage();
        BeanUtils.copyProperties(dto, entity);
        entity.setCreateAt(new Date());
        entity.setModifyAt(entity.getCreateAt());
        entity.setIsDelete(false);
        entity.setIsRead(false);
        Integer result =  uMessageMapper.insert(entity);
        if(result == 0){
            throw new UserMessageException(Code.ERROR_DB_OPERATE,"新增失败");
        }
        return entity.getId();
    }

    /**
     * 修改
     * */
    @Override
    public Integer updateByPrimaryKeySelective(UserMessageDTO dto) {
        UMessage entity = new UMessage();
        BeanUtils.copyProperties(dto, entity);
        entity.setModifyAt(new Date());
        return uMessageMapper.updateByPrimaryKeySelective(entity);
    }

    /**
     * 删除
     * */
    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        UMessage entity = new UMessage();
        entity.setId(id);
        entity.setIsDelete(true);
        Integer result = uMessageMapper.updateByPrimaryKeySelective(entity);
        if(result == 0){
            throw new UserMessageException(Code.ERROR_DB_OPERATE,"软删除失败");
        }
        return result;
    }

    /**
     * 根据id批量删除
     * */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer deleteByIds(List<Integer> ids) {
        UMessageExample example=new UMessageExample();
        example.createCriteria().andIdIn(ids);
        List<UMessage> list = uMessageMapper.selectByExample(example);
        for (int i = 0; i < list.size(); i++) {
            UMessage uMessage = list.get(i);
            uMessage.setIsDelete(true);
            uMessageMapper.updateByPrimaryKey(uMessage );
        }
        return list.size();
    }

    @Override
    public UMessage selectByKey(int id) {
        return uMessageMapper.selectByPrimaryKey(id);
    }

    /**
     * 站内信息查询
     * */
    @Override
    public List<UMessage> getUserMessageList(UserMessageDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto. getPageSize());
        List<UMessage> list = uMessageMapper.selectByExample(this.params2example(dto));
        return list;
    }

    private UMessageExample params2example(UserMessageDTO dto){
        UMessageExample example = new UMessageExample();
        UMessageExample.Criteria criteria = example.createCriteria();

        if (null != dto.getId())
            criteria.andIdEqualTo(dto.getId());
        if (dto.getUserId() != null)
            criteria.andUserIdEqualTo(dto.getUserId());
        if (!StringUtils.isEmpty(dto.getUserIds())){
            List<Integer> iList = com.zacx.core.util.ObjectUtils.string2IntegerList(dto.getUserIds());
            if (iList != null && iList.size() > 0)
                criteria.andUserIdIn(iList);
        }
        if (dto.getType() != null)
            criteria.andTypeEqualTo(dto.getType());
        if (!StringUtils.isEmpty(dto.getTypes())){
            List<Integer> iList = com.zacx.core.util.ObjectUtils.string2IntegerList(dto.getTypes());
            if (iList != null && iList.size() > 0)
                criteria.andTypeIn(iList);
        }
        if (!StringUtils.isEmpty(dto.getTitle()))
            criteria.andTitleLike("%" + dto.getTitle() + "%");
        if (!StringUtils.isEmpty(dto.getContent()))
            criteria.andContentLike("%" + dto.getContent() + "%");
        if (dto.getIsDelete() != null)
            criteria.andIsDeleteEqualTo(dto.getIsDelete());
        if (dto.getIsRead() != null)
            criteria.andIsReadEqualTo(dto.getIsRead());
        if (dto.getCreateAtStart() != null)
            criteria.andCreateAtGreaterThanOrEqualTo(dto.getCreateAtStart());
        if (dto.getCreateAtEnd() != null)
            criteria.andCreateAtLessThanOrEqualTo(dto.getCreateAtEnd());
        if (dto.getModifyAtStart() != null)
            criteria.andModifyAtGreaterThanOrEqualTo(dto.getModifyAtStart());
        if (dto.getModifyAtEnd()!= null)
            criteria.andModifyAtGreaterThanOrEqualTo(dto.getModifyAtEnd());

        criteria.andIsDeleteEqualTo(false);
        if (StringUtils.hasText(dto.getSortCase())) {
            example.setOrderByClause(dto.getSortCase());
        }
        return example;
    }
}
