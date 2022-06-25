package com.Project.irctc.controller;

import com.Project.irctc.dto.LoginRequest;
import com.Project.irctc.dto.RegisterRequest;
import com.Project.irctc.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(
        origins = {"http://localhost:4200/"},
//        allowCredentials = "false",
//        originPatterns = {"*"},
//        allowedHeaders = {"*"},
//        exposedHeaders = {"*"},
        methods = {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST,RequestMethod.DELETE}
)
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody RegisterRequest registerRequest) {
        authService.register(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) throws Exception {
        authService.login(loginRequest);
        return ResponseEntity.ok(authService.login(loginRequest));
    }
}