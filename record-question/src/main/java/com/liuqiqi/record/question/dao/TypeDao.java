package com.liuqiqi.record.question.dao;

import com.liuqiqi.record.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 00:12:35
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
