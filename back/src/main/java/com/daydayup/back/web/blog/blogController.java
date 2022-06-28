package com.daydayup.back.web.blog;

import com.daydayup.back.base.bloginfo.blogPo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhouxm
 */
@RestController
@RequestMapping("/api/Manager")
public class blogController {

    @RequestMapping("/getBlogInfo")
    public String getBlogInfo(String userID){
        return "";
    }

    @RequestMapping("/getBlogList")
    public String getBlogList(){
        return "";
    }

    @RequestMapping("/insertBlog")
    public String insertBlog(@Param("blogPo") blogPo blogPo){
        return "";
    }

    @RequestMapping("/upDateBlog")
    public String upDateBlog(@Param("blogPo") blogPo blogPo){
        return "";
    }
    @RequestMapping("/delBlog")
    public String delBlog(List<String> blogIdList){
        return "";
    }
}
