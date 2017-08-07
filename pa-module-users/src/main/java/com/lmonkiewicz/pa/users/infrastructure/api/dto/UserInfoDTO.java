package com.lmonkiewicz.pa.users.infrastructure.api.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

/**
 * Created by lmonkiewicz on 2017-08-07.
 */
@Getter
@Builder
public class UserInfoDTO {
    private Long id;
    private String login;
    private String name;
    private LocalDate birthDate;
}
