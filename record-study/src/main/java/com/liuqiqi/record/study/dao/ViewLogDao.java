package com.liuqiqi.record.study.dao;

import com.liuqiqi.record.study.entity.ViewLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习浏览记录表
 * 
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:09:24
 */
@Mapper
public interface ViewLogDao extends BaseMapper<ViewLogEntity> {
	
}
