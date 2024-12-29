package com.example.spring_security.controller;


import com.example.spring_security.entities.User;
import com.example.spring_security.models.SignUpDto;
import com.example.spring_security.models.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @PostMapping("/signup")
    public ResponseEntity<UserDto> signUp(@RequestBody SignUpDto signUpDto  ) {
//        UserDto userDto = userService.signUp(signUpDto);
          UserDto userDto = new UserDto();
//          userDto.setId(1l);
//          userDto.setName("demo name");
//          userDto.setEmail("demo email");
        return ResponseEntity.ok(userDto);
    }
}
