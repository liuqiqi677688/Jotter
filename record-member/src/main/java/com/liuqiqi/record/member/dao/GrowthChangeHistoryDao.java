package com.liuqiqi.record.member.dao;

import com.liuqiqi.record.member.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-积分值变化历史记录表
 * 
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:10:59
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
