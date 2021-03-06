package com.liuqiqi.record.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 会员-积分值变化历史记录表
 *
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:10:59
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

