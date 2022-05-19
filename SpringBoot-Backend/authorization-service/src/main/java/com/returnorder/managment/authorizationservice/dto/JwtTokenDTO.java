package com.returnorder.managment.authorizationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Setter
@Getter
public class JwtTokenDTO {
    private String jwtToken;
}
