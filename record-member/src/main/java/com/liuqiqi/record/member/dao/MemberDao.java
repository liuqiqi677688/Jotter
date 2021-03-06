package com.liuqiqi.record.member.dao;

import com.liuqiqi.record.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:10:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
