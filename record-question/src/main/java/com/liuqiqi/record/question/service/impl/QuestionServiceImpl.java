package com.liuqiqi.record.question.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.common.utils.Query;
import com.liuqiqi.record.question.dao.QuestionDao;
import com.liuqiqi.record.question.entity.QuestionEntity;
import com.liuqiqi.record.question.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("questionService")
public class QuestionServiceImpl extends ServiceImpl<QuestionDao, QuestionEntity> implements QuestionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QuestionEntity> page = this.page(
                new Query<QuestionEntity>().getPage(params),
                new QueryWrapper<QuestionEntity>()
        );

        return new PageUtils(page);
    }

}