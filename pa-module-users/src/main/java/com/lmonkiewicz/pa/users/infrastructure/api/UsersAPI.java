package com.lmonkiewicz.pa.users.infrastructure.api;

import com.lmonkiewicz.pa.users.infrastructure.api.dto.UserInfoDTO;

import java.util.Optional;

/**
 * Created by lmonkiewicz on 2017-08-07.
 */
public interface UsersAPI {
    Optional<UserInfoDTO> findUser(Long userId);
}
