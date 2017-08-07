package com.lmonkiewicz.pa.articles.infrastructure.configuration;

import com.lmonkiewicz.pa.articles.domain.service.ports.UsersPort;
import com.lmonkiewicz.pa.articles.infrastructure.users.UsersPortAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lmonkiewicz on 2017-08-08.
 */
@Configuration
public class ArticlesConfiguration {

    @Bean
    UsersPort usersPort(){
        return new UsersPortAdapter();
    }
}
