package com.liuqiqi.record.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.study.entity.ViewLogEntity;

import java.util.Map;

/**
 * 学习-用户学习浏览记录表
 *
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:09:24
 */
public interface ViewLogService extends IService<ViewLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

