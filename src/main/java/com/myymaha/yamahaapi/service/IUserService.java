package com.myymaha.yamahaapi.service;

import com.myymaha.yamahaapi.dto.UserDto;

public interface IUserService {

    public void createUser(UserDto userDto);
    public UserDto getUser(String mobileNo);
}
