package com.liuqiqi.record.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.content.entity.BannerEntity;

import java.util.Map;

/**
 * 内容-横幅广告表
 *
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:07:57
 */
public interface BannerService extends IService<BannerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

