package com.blog.service;

import com.blog.entity.Article;

public interface ArticleService {
    Article selectByPrimaryKey(Integer id);
}
