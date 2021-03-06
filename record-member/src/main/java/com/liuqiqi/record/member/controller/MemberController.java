package com.liuqiqi.record.member.controller;

import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.common.utils.R;
import com.liuqiqi.record.member.entity.MemberEntity;
import com.liuqiqi.record.member.feign.StudyTimeFeignService;
import com.liuqiqi.record.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员-会员表
 *
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:10:59
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private StudyTimeFeignService studyTimeFeignService;


    /**
     * 返回某个用户学习题目的总时长
     */
    @RequestMapping("/studytime/list/test")
    public R getMemberStudyTimeListTest() {
        return studyTimeFeignService.getMemberStudyTimeListTest();
    }


    @RequestMapping("/studytime/list/test/{id}")
    public R getMemberStudyTimeListTest(@PathVariable("id") Long id) {
        //mock数据库查到的会员信息
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(id); // 学习时长：100分钟
        memberEntity.setNickname("悟空聊架构");

        //远程调用拿到该用户的学习时长（学习时长是mock数据）
        R memberStudyTimeList = studyTimeFeignService.getMemberStudyTimeListTest(id);
        return R.ok().put("member", memberEntity).put("studytime", memberStudyTimeList.get("studytime"));
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member) {
        memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member) {
        memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
