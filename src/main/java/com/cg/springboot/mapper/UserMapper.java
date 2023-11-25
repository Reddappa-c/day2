package com.cg.springboot.mapper;

import com.cg.springboot.dto.UserDto;
import com.cg.springboot.entity.User;

public class UserMapper {
    //convert userJpa entity into userDto
    public static UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto(
        user.getId(),
        user.getFirstName(),
        user.getLastName(),
        user.getEmail()
        );
        return userDto;
    }


    public static User mapToUser(UserDto userDto){
        User user = new User(
        userDto.getId(),
        userDto.getFirstName(),
        userDto.getLastName(),
        userDto.getEmail()
        );
        return user;
    }

}
