package com.returnorder.managment.authorizationservice.service;

import com.returnorder.managment.authorizationservice.dto.JwtTokenDTO;
import com.returnorder.managment.authorizationservice.dto.StringToObjectDTO;
import com.returnorder.managment.authorizationservice.dto.UserRegisterDetailsDTO;
import com.returnorder.managment.authorizationservice.entity.User;

public interface UserAuthService {
     void authenticateUser(String username,String password);
     StringToObjectDTO jwtTokenResponse(String username);
     void registerUser(UserRegisterDetailsDTO userRegisterDetailsDTO);

}
