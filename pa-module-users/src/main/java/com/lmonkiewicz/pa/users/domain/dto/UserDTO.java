package com.lmonkiewicz.pa.users.domain.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

/**
 * Created by lmonkiewicz on 2017-08-07.
 */
@Getter
@Builder
public class UserDTO {

    private Long id;
    private String login;
    private String name;
    private LocalDate birthDate;
}
