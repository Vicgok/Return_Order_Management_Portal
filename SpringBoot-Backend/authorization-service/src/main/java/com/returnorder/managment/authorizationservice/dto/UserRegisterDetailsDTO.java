package com.returnorder.managment.authorizationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class UserRegisterDetailsDTO {

    private String username;
    private String password;
    private String fullName;
    private String email;
    private String phone;
}
