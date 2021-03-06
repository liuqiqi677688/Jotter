package com.liuqiqi.record.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.channel.entity.AccessTokenEntity;

import java.util.Map;

/**
 * 渠道-认证表
 *
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:05:09
 */
public interface AccessTokenService extends IService<AccessTokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

