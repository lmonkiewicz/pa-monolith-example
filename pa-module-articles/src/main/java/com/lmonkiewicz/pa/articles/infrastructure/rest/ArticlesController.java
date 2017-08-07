package com.lmonkiewicz.pa.articles.infrastructure.rest;

import com.lmonkiewicz.pa.articles.domain.dto.ArticleDTO;
import com.lmonkiewicz.pa.articles.domain.service.ArticlesService;
import com.lmonkiewicz.pa.articles.infrastructure.rest.dto.ArticleResponseDTO;
import com.lmonkiewicz.pa.articles.infrastructure.rest.dto.AuthorResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lmonkiewicz on 2017-08-07.
 */
@RestController
@RequestMapping("/articles")
public class ArticlesController {

    private final ArticlesService articlesService;

    @Autowired
    public ArticlesController(ArticlesService articlesService) {
        this.articlesService = articlesService;
    }

    @GetMapping
    ResponseEntity<List<ArticleResponseDTO>> getArticles(){
        return ResponseEntity.ok(articlesService.findAllArticles().stream()
                .map(this::convertToArticleResponse)
                .collect(Collectors.toList()));
    }

    private ArticleResponseDTO convertToArticleResponse(ArticleDTO dto) {
        return ArticleResponseDTO.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .author(AuthorResponseDTO.builder()
                            .id(dto.getAuthor().getId())
                            .name(dto.getAuthor().getName())
                            .build())
                .build();
    }
}
