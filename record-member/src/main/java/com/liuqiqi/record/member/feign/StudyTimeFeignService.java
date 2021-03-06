package com.liuqiqi.record.member.feign;

import com.liuqiqi.record.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("record-study")
public interface StudyTimeFeignService {

    @RequestMapping("study/studytime/member/list/test")
    public R getMemberStudyTimeListTest();

    @RequestMapping("study/studytime/member/list/test/{id}")
    public R getMemberStudyTimeListTest(@PathVariable("id") Long id);


//    public R memberStudyTime();

}
