package com.lmonkiewicz.pa.users.domain.service;

import com.lmonkiewicz.pa.users.domain.dto.UserDTO;

import java.util.Optional;

/**
 * Created by lmonkiewicz on 2017-08-07.
 */
public interface UsersService {
    Optional<UserDTO> findUser(Long userId);
}
