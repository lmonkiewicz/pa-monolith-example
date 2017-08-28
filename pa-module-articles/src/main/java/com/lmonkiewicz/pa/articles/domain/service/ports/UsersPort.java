package com.lmonkiewicz.pa.articles.domain.service.ports;

import com.lmonkiewicz.pa.articles.domain.dto.AuthorDTO;

/**
 * Created by lmonkiewicz on 2017-08-08.
 */
public interface UsersPort {
    AuthorDTO findAuthorById(Long authorId);
}
