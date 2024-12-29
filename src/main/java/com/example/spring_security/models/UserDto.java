package com.example.spring_security.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class UserDto {

    private Long id;
    private String email;
    private String name;
}
