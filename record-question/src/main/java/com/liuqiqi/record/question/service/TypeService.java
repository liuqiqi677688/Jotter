package com.liuqiqi.record.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.question.entity.TypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 00:12:35
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

