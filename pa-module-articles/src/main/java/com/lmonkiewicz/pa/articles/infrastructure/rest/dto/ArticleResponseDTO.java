package com.lmonkiewicz.pa.articles.infrastructure.rest.dto;

import lombok.Builder;
import lombok.Getter;

/**
 * Created by lmonkiewicz on 2017-08-08.
 */
@Getter
@Builder
public class ArticleResponseDTO {
    private Long id;
    private String title;
    private AuthorResponseDTO author;
}
