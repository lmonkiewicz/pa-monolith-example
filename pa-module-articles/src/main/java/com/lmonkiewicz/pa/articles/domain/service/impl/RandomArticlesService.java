package com.lmonkiewicz.pa.articles.domain.service.impl;

import com.lmonkiewicz.pa.articles.domain.dto.ArticleDTO;
import com.lmonkiewicz.pa.articles.domain.dto.AuthorDTO;
import com.lmonkiewicz.pa.articles.domain.service.ArticlesService;
import com.lmonkiewicz.pa.articles.domain.service.ports.UsersPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by lmonkiewicz on 2017-08-08.
 */
@Service
public class RandomArticlesService implements ArticlesService {

    private final UsersPort usersPort;

    private final String[] titles = ("" +
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus sollicitudin vitae neque vitae venenatis. Phasellus ligula urna, pellentesque eu vulputate sed, dapibus ac arcu. Vivamus tortor diam, pellentesque in augue eget, tincidunt iaculis libero. Nunc dignissim metus in dui eleifend mattis. Nulla facilisi. Pellentesque faucibus euismod maximus. Pellentesque rutrum eu nulla ac tristique. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Curabitur finibus finibus erat, quis rhoncus massa scelerisque vitae. Fusce facilisis malesuada sapien, ut maximus nulla convallis eget. In vel nisl turpis. Mauris dictum velit tristique massa finibus ullamcorper.\n" +
            "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur aliquet, elit non lobortis condimentum, augue libero ornare erat, eu auctor nibh sem ac lacus. Mauris nulla enim, molestie non erat a, malesuada pharetra velit. Suspendisse viverra elementum ipsum, vel tristique tortor pellentesque ut. Praesent leo massa, placerat vel scelerisque at, aliquet vel mi. Maecenas laoreet odio rhoncus felis suscipit faucibus in sit amet nibh. Quisque sit amet ex nunc. Vestibulum sit amet velit vel nunc vulputate iaculis. In aliquam pulvinar ipsum, et scelerisque nisi rhoncus sit amet. Nulla faucibus imperdiet ligula eget maximus. Donec eget tincidunt magna.")
            .split("\\.");

    @Autowired
    public RandomArticlesService(UsersPort usersPort) {
        this.usersPort = usersPort;
    }

    @Override
    public List<ArticleDTO> findAllArticles() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        List<ArticleDTO> result = new ArrayList<>();
        for (int i = 0; i < random.nextInt(1,5); i++) {
             result.add(ArticleDTO.builder()
                     .title(generateRandomTitle(random))
                     .id(random.nextLong())
                     .author(generateRandomAuthor(random))
                     .build());
        }
        return result;
    }

    private AuthorDTO generateRandomAuthor(ThreadLocalRandom random) {
        return usersPort.findAuthorById(random.nextLong());
    }

    private String generateRandomTitle(ThreadLocalRandom random) {
        return titles[random.nextInt(0, titles.length)].trim();
    }

}
