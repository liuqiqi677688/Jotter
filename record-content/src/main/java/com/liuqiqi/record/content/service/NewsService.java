package com.liuqiqi.record.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.content.entity.NewsEntity;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:07:57
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

