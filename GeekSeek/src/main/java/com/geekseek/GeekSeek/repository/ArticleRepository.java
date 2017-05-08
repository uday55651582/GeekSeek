package com.geekseek.GeekSeek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geekseek.GeekSeek.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{

}
