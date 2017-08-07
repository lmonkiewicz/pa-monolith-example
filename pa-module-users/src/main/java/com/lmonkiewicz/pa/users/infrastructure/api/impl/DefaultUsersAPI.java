package com.lmonkiewicz.pa.users.infrastructure.api.impl;

import com.lmonkiewicz.pa.users.domain.dto.UserDTO;
import com.lmonkiewicz.pa.users.domain.service.UsersService;
import com.lmonkiewicz.pa.users.infrastructure.api.UsersAPI;
import com.lmonkiewicz.pa.users.infrastructure.api.dto.UserInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lmonkiewicz on 2017-08-07.
 */
@Service
public class DefaultUsersAPI implements UsersAPI {

    private final UsersService usersService;

    @Autowired
    public DefaultUsersAPI(UsersService usersService) {
        this.usersService = usersService;
    }

    List<UserInfoDTO> findUsersConnectedToUser(Long userId) {
        return usersService.findUsersConnectedToUser(userId).stream()
                .map(this::convertToUserInfoDTO)
                .collect(Collectors.toList());
    }

    private UserInfoDTO convertToUserInfoDTO(UserDTO dto) {
        return UserInfoDTO.builder()
                .id(dto.getId())
                .login(dto.getLogin())
                .name(dto.getName())
                .birthDate(dto.getBirthDate())
                .build();
    }
}
