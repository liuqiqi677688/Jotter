package com.liuqiqi.record.channel.controller;

import com.liuqiqi.record.channel.entity.ChannelEntity;
import com.liuqiqi.record.channel.service.ChannelService;
import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 渠道-渠道表
 *
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:05:09
 */
@RestController
@RequestMapping("channel/channel")
public class ChannelController {
    @Autowired
    private ChannelService channelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = channelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ChannelEntity channel = channelService.getById(id);

        return R.ok().put("channel", channel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChannelEntity channel){
		channelService.save(channel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ChannelEntity channel){
		channelService.updateById(channel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		channelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
