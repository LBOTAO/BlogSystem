package com.blog.controller;

import com.blog.entity.Article;
import com.blog.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/article")
@Api(value="文章管理",description="测试接口描述")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/selectByPrimaryKey/{id}")
    @ResponseBody
    @ApiOperation(value="按文章ID查询文章详细信息",httpMethod="GET",notes="在没有会话、没有签名的情况下，进入方法体")
    public Object selectByPrimaryKey(@PathVariable Integer id){
        Article article = articleService.selectByPrimaryKey(id);
        return article;
    }
}
