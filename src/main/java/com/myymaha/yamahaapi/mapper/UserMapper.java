package com.myymaha.yamahaapi.mapper;

import com.myymaha.yamahaapi.dto.UserDto;
import com.myymaha.yamahaapi.entity.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getMobileNo(),
                user.getAddressLine1(),
                user.getAddressLine2(),
                user.getPincode(),
                user.getCity(),
                user.getState());
    }

    public static User maptToUser(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getEmail(),
                userDto.getMobileNo(),
                userDto.getAddressLine1(),
                userDto.getAddressLine2(),
                userDto.getPincode(),
                userDto.getCity(),
                userDto.getState());
    }
}
