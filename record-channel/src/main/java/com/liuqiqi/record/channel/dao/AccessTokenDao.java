package com.liuqiqi.record.channel.dao;

import com.liuqiqi.record.channel.entity.AccessTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-认证表
 * 
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:05:09
 */
@Mapper
public interface AccessTokenDao extends BaseMapper<AccessTokenEntity> {
	
}
