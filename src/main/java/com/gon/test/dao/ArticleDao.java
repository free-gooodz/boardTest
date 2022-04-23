package com.gon.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gon.test.dto.Article;

@Mapper
public interface ArticleDao {

	List<Article> getArticles();

	Article getArticleById(@Param("id") int id);

	void deleteArticleById(@Param("id") int id);

}
