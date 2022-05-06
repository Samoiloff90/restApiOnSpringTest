package com.samoiloff.rest.controller;

import com.samoiloff.rest.domain.LoginInfo;
import com.samoiloff.rest.domain.UserInfo;
import com.samoiloff.rest.exception.InvalidUserNameException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BankController {

    @PostMapping("user/login")
    public UserInfo doLogin(@RequestBody LoginInfo loginInfo) {
        if(loginInfo.getUserName().equals("Dima")) {
            return UserInfo.builder()
                    .loginDate(new Date())
                    .userName(loginInfo.getUserName())
                    .build();
        } else {
            throw new InvalidUserNameException();
        }
    }
}
