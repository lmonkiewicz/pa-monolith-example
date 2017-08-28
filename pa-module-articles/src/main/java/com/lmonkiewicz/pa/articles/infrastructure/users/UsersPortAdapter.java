package com.lmonkiewicz.pa.articles.infrastructure.users;

import com.lmonkiewicz.pa.articles.domain.dto.AuthorDTO;
import com.lmonkiewicz.pa.articles.domain.service.ports.UsersPort;
import com.lmonkiewicz.pa.users.domain.dto.UserDTO;
import com.lmonkiewicz.pa.users.domain.service.UsersService;

/**
 * Created by lmonkiewicz on 2017-08-08.
 */
public class UsersPortAdapter implements UsersPort {

    private final UsersService usersService;

    public UsersPortAdapter(UsersService usersService) {
        this.usersService = usersService;
    }

    @Override
    public AuthorDTO findAuthorById(Long authorId){
        return usersService.findUser(authorId)
                .map(this::convertToAuthorDTO)
                .orElse(AuthorDTO.builder()
                        .name("Anonymous")
                        .login("anonymous")
                        .id(-1L)
                        .build());
    }

    private AuthorDTO convertToAuthorDTO(UserDTO userDTO) {
        return AuthorDTO.builder()
                .id(userDTO.getId())
                .name(userDTO.getName())
                .login(userDTO.getLogin())
                .build();
    }
}
