package com.lmonkiewicz.pa.users.domain.service.impl;

import com.lmonkiewicz.pa.users.domain.dto.UserDTO;
import com.lmonkiewicz.pa.users.domain.service.UsersService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by lmonkiewicz on 2017-08-07.
 */
@Service
public class RandomUsersService implements UsersService {

    @Override
    public List<UserDTO> findUsersConnectedToUser(Long userId) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return Arrays.asList(
                UserDTO.builder()
                        .id(random.nextLong())
                        .login(generateLogin(random))
                        .name(generateName(random))
                        .birthDate(generateDate(random))
                        .build()
        );
    }

    private LocalDate generateDate(ThreadLocalRandom random) {
        return LocalDate.of(
                random.nextInt(1900, 2015),
                random.nextInt(1, 13),
                random.nextInt(1, 31)
        );
    }

    private String generateName(ThreadLocalRandom random) {
        switch (random.nextInt(0, 5)){
            case 0: return "Jon";
            case 1: return "Arya";
            case 2: return "Sansa";
            case 3: return "Bran";
            case 4: return "Rob";
        }
        return "Theon";
    }


    private String generateLogin(ThreadLocalRandom random) {
        switch (random.nextInt(0, 5)){
            case 0: return "blue";
            case 1: return "pink";
            case 2: return "red";
            case 3: return "black";
            case 4: return "white";
        }
        return "green";
    }
}
