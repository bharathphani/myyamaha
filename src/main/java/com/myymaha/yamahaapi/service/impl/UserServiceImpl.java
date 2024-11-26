package com.myymaha.yamahaapi.service.impl;

import com.myymaha.yamahaapi.dto.UserDto;
import com.myymaha.yamahaapi.entity.User;
import com.myymaha.yamahaapi.exception.ResourceNotFoundException;
import com.myymaha.yamahaapi.exception.UserAlreadyExistsException;
import com.myymaha.yamahaapi.mapper.UserMapper;
import com.myymaha.yamahaapi.repository.UserRepository;
import com.myymaha.yamahaapi.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService {
    private UserRepository userRepo;

    @Override
    public void createUser(UserDto userDto) {
        User user = UserMapper.maptToUser(userDto);
        Optional<User> userOpt = userRepo.findByMobileNoAndEmail(user.getMobileNo(), user.getEmail());
        if(userOpt.isPresent()) {
            throw new UserAlreadyExistsException("User already exists");
        }
        user.setCreatedOn(LocalDateTime.now());
        user.setCreatedBy("Bharath");
        user.setModifiedOn(LocalDateTime.now());
        user.setModifiedBy("Bharath");
        User savedUser = userRepo.save(user);
    }

    @Override
    public UserDto getUser(String mobileNo) {
        User user = userRepo.findByMobileNo(mobileNo).orElseThrow(
                () -> new ResourceNotFoundException("User", "mobileNo", mobileNo)
        );
        return UserMapper.mapToUserDto(user);
    }
}
