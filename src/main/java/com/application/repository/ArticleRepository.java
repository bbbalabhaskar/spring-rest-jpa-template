package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {}
