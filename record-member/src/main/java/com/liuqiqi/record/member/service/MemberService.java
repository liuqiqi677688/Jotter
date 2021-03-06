package com.liuqiqi.record.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:10:59
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

