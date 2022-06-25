package com.Project.irctc.service;

import com.Project.irctc.dto.AuthenticationResponse;
import com.Project.irctc.dto.LoginRequest;
import com.Project.irctc.dto.RegisterRequest;
import com.Project.irctc.model.User;
import com.Project.irctc.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private AuthRepository authRepository;
    private boolean isSuccess = false;
    private String message = "Invalid Login";

    public void register(RegisterRequest registerRequest) {
        User user = new User();
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        authRepository.save(user);
    }

    public AuthenticationResponse login(LoginRequest loginRequest) {
        User user = authRepository.findByEmail(loginRequest.getEmail()).get();
        if (user != null && loginRequest.getPassword().equals(user.getPassword())) {
            isSuccess = true;
        }
        return new AuthenticationResponse(user.getId(), user.getEmail(), isSuccess, user.isAdmin());
    }
}
