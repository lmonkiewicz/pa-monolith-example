package com.lmonkiewicz.pa.articles.domain.dto;

/**
 * Created by lmonkiewicz on 2017-08-08.
 */

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AuthorDTO {
    private Long id;
    private String login;
    private String name;
}
