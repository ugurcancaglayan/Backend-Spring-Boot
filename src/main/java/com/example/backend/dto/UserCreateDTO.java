package com.example.backend.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.backend.validator.UniqueUserName;

import lombok.Data;

@Data
public class UserCreateDTO {

    @NotNull(message = "{backend.constraints.username.NotNull.message}")
    @Size(min = 4, max = 24, message = "User Name size must be between {min} and {max}")
    @UniqueUserName
    private String userName;

    @NotNull(message = "{backend.constraints.firstname.NotNull.message}")
    @Size(min = 2, max = 32, message = "{backend.constraints.firstname.Size.message}")
    private String firstName;

    @NotNull(message = "{backend.constraints.lastname.NotNull.message}")
    @Size(min = 3, max = 32, message = "{backend.constraints.lastname.Size.message}")
    private String lastName;

}
