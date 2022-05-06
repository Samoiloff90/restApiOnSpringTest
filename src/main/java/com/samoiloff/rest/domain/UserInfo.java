package com.samoiloff.rest.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class UserInfo {
    private Date loginDate;
    private String userName;

}
