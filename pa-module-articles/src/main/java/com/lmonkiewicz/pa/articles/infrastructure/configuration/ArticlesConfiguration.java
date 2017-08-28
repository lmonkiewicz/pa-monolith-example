package com.lmonkiewicz.pa.articles.infrastructure.configuration;

import com.lmonkiewicz.pa.articles.domain.service.ports.UsersPort;
import com.lmonkiewicz.pa.articles.infrastructure.users.UsersPortAdapter;
import com.lmonkiewicz.pa.users.domain.service.UsersService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lmonkiewicz on 2017-08-08.
 */
@Configuration
public class ArticlesConfiguration {

    @Bean
    UsersPort usersPort(UsersService usersService){
        return new UsersPortAdapter(usersService);
    }
}
