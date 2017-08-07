package com.lmonkiewicz.pa.articles.domain.service.impl;

import com.lmonkiewicz.pa.articles.domain.dto.ArticleDTO;
import com.lmonkiewicz.pa.articles.domain.service.ArticlesService;
import com.lmonkiewicz.pa.articles.domain.service.ports.UsersPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lmonkiewicz on 2017-08-08.
 */
@Service
public class RandomArticlesService implements ArticlesService {

    private final UsersPort usersPort;

    @Autowired
    public RandomArticlesService(UsersPort usersPort) {
        this.usersPort = usersPort;
    }

    @Override
    public List<ArticleDTO> findAllArticles() {
        return null;
    }
}
