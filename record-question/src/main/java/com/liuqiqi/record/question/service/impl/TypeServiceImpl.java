package com.liuqiqi.record.question.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.common.utils.Query;
import com.liuqiqi.record.question.dao.TypeDao;
import com.liuqiqi.record.question.entity.TypeEntity;
import com.liuqiqi.record.question.service.TypeService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("typeService")
public class TypeServiceImpl extends ServiceImpl<TypeDao, TypeEntity> implements TypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TypeEntity> page = this.page(
                new Query<TypeEntity>().getPage(params),
                new QueryWrapper<TypeEntity>()
        );

        return new PageUtils(page);
    }

}