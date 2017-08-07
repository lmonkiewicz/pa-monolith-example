package com.lmonkiewicz.pa.articles.domain.service;

import com.lmonkiewicz.pa.articles.domain.dto.ArticleDTO;

import java.util.List;

/**
 * Created by lmonkiewicz on 2017-08-08.
 */
public interface ArticlesService {
    List<ArticleDTO> findAllArticles();
}
