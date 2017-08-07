package com.lmonkiewicz.pa.users.domain.service;

import com.lmonkiewicz.pa.users.domain.dto.UserDTO;

import java.util.List;

/**
 * Created by lmonkiewicz on 2017-08-07.
 */
public interface UsersService {
    List<UserDTO> findUsersConnectedToUser(Long userId);
}
