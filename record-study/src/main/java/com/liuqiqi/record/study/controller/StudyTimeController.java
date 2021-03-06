package com.liuqiqi.record.study.controller;

import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.common.utils.R;
import com.liuqiqi.record.study.entity.StudyTimeEntity;
import com.liuqiqi.record.study.service.StudyTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;


/**
 * 学习-用户学习时常表
 *
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:09:24
 */
@RestController
@RequestMapping("study/studytime")
public class StudyTimeController {
    @Autowired
    private StudyTimeService studyTimeService;


    @RequestMapping("/member/list/test/{id}")
    public R memberStudyTimeTest(@PathVariable("id") Long id) {
        StudyTimeEntity studyTimeEntity = new StudyTimeEntity();
        studyTimeEntity.setTotalTime(100); // 学习时长：100分钟
        studyTimeEntity.setQuesType(1L); // 题目类型：1 （javaBasic）

        return R.ok().put("studytime", Collections.singletonList(studyTimeEntity));
    }

    /**
     * 返回某个用户学习题目的总时长
     *
     * @return
     */
    @RequestMapping("/member/list/test")
    public R memberStudyTimeTest() {
        StudyTimeEntity studyTimeEntity = new StudyTimeEntity();
        studyTimeEntity.setTotalTime(100); // 学习时长：100分钟
        studyTimeEntity.setQuesType(1L); // 题目类型：1 （javaBasic）

        return R.ok().put("studyTime", Collections.singletonList(studyTimeEntity));
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = studyTimeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        StudyTimeEntity studyTime = studyTimeService.getById(id);

        return R.ok().put("studyTime", studyTime);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody StudyTimeEntity studyTime) {
        studyTimeService.save(studyTime);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody StudyTimeEntity studyTime) {
        studyTimeService.updateById(studyTime);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        studyTimeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
