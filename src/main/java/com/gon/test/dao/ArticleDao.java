package com.gon.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gon.test.dto.Article;

@Mapper
public interface ArticleDao {

	List<Article> getArticles();

}
