package com.liang.blog.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.liang.blog.model.Result;
import com.liang.blog.po.BlogUserRelate;
import com.liang.blog.service.IBlogUserRelateService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 关注用户关联表 前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2023-08-27
 */
@Controller
@RequestMapping("/blogUserRelate")
public class BlogUserRelateController {

    @Resource
    private IBlogUserRelateService iBlogUserRelateService;

    /**
     * 查询指定id用户的粉丝用户列表
     *
     * @param id 用户id
     * @return list 关注用户id的用户列表
     */
    @GetMapping("getFollowers/{id}")
    public Result getFollowers(@PathVariable Long id) {

        QueryWrapper<BlogUserRelate> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("be_followed_user_id", id);
        List<BlogUserRelate> list = iBlogUserRelateService.list(queryWrapper);
        return Result.sucess(list);
    }

    /**
     * 关注列表
     *
     * @param id 用户id
     */
    @GetMapping("/getFollowing/{id}")
    public Result getFollowing(@PathVariable Long id) {
        QueryWrapper<BlogUserRelate> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("follower_user_id", id);
        List<BlogUserRelate> list = iBlogUserRelateService.list(queryWrapper);
        return Result.sucess(list);
    }


    /**
     * 新增关注用户
     *
     * @param userId        用户id
     * @param addUserIdList 新添加关注用户id列表
     */
    @PostMapping("/addFollow/{userId}")
    public Result addFollow(@PathVariable Long userId, @RequestBody List<Long> addUserIdList) {

        List<BlogUserRelate> followList = addUserIdList.stream().map(beFollowedUserId -> new BlogUserRelate(
                null, userId, beFollowedUserId, LocalDate.now(), null, (byte) 1
        )).collect(Collectors.toCollection(() -> new ArrayList<>(addUserIdList.size())));

        boolean b = iBlogUserRelateService.saveBatch(followList);
        return Result.sucess(b);
    }

    /**
     * 取消关注
     *
     * @param userId              用户id
     * @param disFollowUserIdList 被取消关注用户列表
     */
    @DeleteMapping("/delFollow/{userId}")
    public Result delFollow(@PathVariable Long userId, @RequestBody List<Long> disFollowUserIdList) {
        UpdateWrapper<BlogUserRelate> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("follower_user_id", userId).in("be_followed_user_id", disFollowUserIdList).set("disfollow_time", LocalDate.now()).set("state", 0);
        boolean update = iBlogUserRelateService.update(updateWrapper);
        return Result.sucess(update);
    }

}
