package com.liuqiqi.record.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.common.utils.Query;

import com.liuqiqi.record.content.dao.NewsDao;
import com.liuqiqi.record.content.entity.NewsEntity;
import com.liuqiqi.record.content.service.NewsService;


@Service("newsService")
public class NewsServiceImpl extends ServiceImpl<NewsDao, NewsEntity> implements NewsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<NewsEntity> page = this.page(
                new Query<NewsEntity>().getPage(params),
                new QueryWrapper<NewsEntity>()
        );

        return new PageUtils(page);
    }

}