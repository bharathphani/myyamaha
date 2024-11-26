package com.myymaha.yamahaapi.controller;


import com.myymaha.yamahaapi.constants.Constants;
import com.myymaha.yamahaapi.dto.ResponseDto;
import com.myymaha.yamahaapi.dto.UserDto;
import com.myymaha.yamahaapi.service.IUserService;
import com.myymaha.yamahaapi.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class UserController extends BaseController {

    private IUserService iUserService;

    @GetMapping(path = "sayHello")
    public String sayHello() {
      return "Hello to My yamaha";
    }

    @PostMapping(path = "create")
    public ResponseEntity<ResponseDto> createUser(@RequestBody UserDto userDto) {
        iUserService.createUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(Constants.HTTP_CODE_201, Constants.USER_SUCCESS_MSG_201));
    }

    @GetMapping(path= "fetch")
    public ResponseEntity<UserDto> getUserByMobileNo(@RequestParam String mobileNo) {
        UserDto userDto = iUserService.getUser(mobileNo);
        return ResponseEntity.status(HttpStatus.OK).body(userDto);
    }
}
