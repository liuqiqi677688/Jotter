package com.liuqiqi.record.content.dao;

import com.liuqiqi.record.content.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:07:57
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
