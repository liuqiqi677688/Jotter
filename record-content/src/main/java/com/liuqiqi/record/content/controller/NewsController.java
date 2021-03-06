package com.liuqiqi.record.content.controller;

import com.liuqiqi.record.common.utils.PageUtils;
import com.liuqiqi.record.common.utils.R;
import com.liuqiqi.record.content.entity.NewsEntity;
import com.liuqiqi.record.content.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 内容-资讯表
 *
 * @author liuqiqi
 * @email liu677688@163.com
 * @date 2021-03-06 10:07:57
 */
@RestController
@RequestMapping("content/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = newsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		NewsEntity news = newsService.getById(id);

        return R.ok().put("news", news);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody NewsEntity news){
		newsService.save(news);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody NewsEntity news){
		newsService.updateById(news);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		newsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
