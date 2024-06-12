package com.liang.blog.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liang.blog.model.Result;
import com.liang.blog.po.BlogUser;
import com.liang.blog.service.IBlogUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户信息管理
 * 前端控制器
 * </p>
 *
 * @author Liang
 * @since 2023-08-27
 */
@Controller
@RequestMapping("/blogUser")
public class BlogUserController {

    @Resource
    private IBlogUserService iBlogUserService;


    /**
     * 根据用户id查询用户信息
     *
     * @param id 用户id
     */
    @GetMapping("/get/{id}")
    public Result get(@PathVariable Long id) {
        QueryWrapper<BlogUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        BlogUser one = iBlogUserService.getOne(queryWrapper);
        return Result.sucess(one);
    }

    /**
     * 分页查询用户
     *
     * @param current 当前页
     * @param size    页大小
     */
    @GetMapping("/getPage/{current}/{size}")
    public Result getPage(@PathVariable Long current, @PathVariable Long size) {

        Page<BlogUser> page = new Page<>(current, size);
        Page<BlogUser> pageData = iBlogUserService.page(page);
        return Result.sucess(pageData);
    }

    /**
     * 根据ID列表获取用户列表
     *
     * @param list 用户id列表
     */
    @GetMapping("/get/list")
    public Result list(@RequestParam List<Long> list) {
        QueryWrapper<BlogUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", list);
        List<BlogUser> blogUserList = iBlogUserService.list();
        return Result.sucess(blogUserList);
    }

    /**
     * 修改某个用户信息
     *
     * @param id       用户id
     * @param blogUser 用户信息
     */
    @PutMapping("/update/{id}")
    public Result update(@PathVariable Long id, @RequestBody BlogUser blogUser) {

        UpdateWrapper<BlogUser> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", id).setEntity(blogUser);
        boolean update = iBlogUserService.update(updateWrapper);
        return Result.sucess(update);
    }

    /**
     * 批量删除
     *
     * @param list 用户id列表
     */
    @DeleteMapping("/del")
    public Result del(@RequestBody List<Long> list) {

        QueryWrapper<BlogUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", list);
        boolean remove = iBlogUserService.remove(queryWrapper);
        return Result.sucess(remove);
    }

    @PostMapping("/add")
    public Result add(@RequestBody BlogUser blogUser) {

        boolean save = iBlogUserService.save(blogUser);
        return Result.sucess(save);
    }

}
