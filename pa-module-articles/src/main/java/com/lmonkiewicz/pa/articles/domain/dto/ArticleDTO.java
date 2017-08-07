package com.lmonkiewicz.pa.articles.domain.dto;

import lombok.Builder;
import lombok.Getter;

/**
 * Created by lmonkiewicz on 2017-08-08.
 */
@Getter
@Builder
public class ArticleDTO {
    private Long id;
    private String title;
    private AuthorDTO author;
}
