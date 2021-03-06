package com.liuqiqi.record.question;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liuqiqi.record.question.entity.TypeEntity;
import com.liuqiqi.record.question.service.TypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class QuestionApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    TypeService typeService;


    // 创建题目类型
    @Test
    void testCreateType() {
        TypeEntity typeEntity = new TypeEntity();
        typeEntity.setType("javaBasic");
        typeService.save(typeEntity);
        System.out.println("创建成功");
    }


    // 查询题目类型
    @Test
    void testSelectType() {
        List<TypeEntity> typeEntityList = typeService.list(new QueryWrapper<TypeEntity>().eq("id",1L));
        typeEntityList.forEach((item)-> {
            System.out.println(item);
        });
        System.out.println("查询成功");
    }

    // 删除题目类型记录
    @Test
    void testRemoveType() {
        typeService.removeById(1L);
        System.out.println("删除成功");
    }







}
