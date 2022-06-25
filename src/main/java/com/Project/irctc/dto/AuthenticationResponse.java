package com.Project.irctc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationResponse {
    private Long id;
    private String email;
    private boolean isSuccess;
    private boolean isAdmin;
}

