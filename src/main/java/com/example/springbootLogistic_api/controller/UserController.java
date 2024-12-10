// package com.example.springbootLogistic_api.controller;

// import com.example.springbootLogistic_api.entity.User;
// import com.example.springbootLogistic_api.service.UserService;
// import com.example.springbootLogistic_api.payload.LoginRequest;
// import com.example.springbootLogistic_api.payload.TokenRefreshRequest;
// import com.example.springbootLogistic_api.payload.AuthResponse;
// import com.example.springbootLogistic_api.payload.AccessTokenResponse;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api/users")
// public class UserController {

// private final UserService userService;
// private final PasswordEncoder passwordEncoder;

// @Autowired
// public UserController(UserService userService, PasswordEncoder
// passwordEncoder) {
// this.userService = userService;
// this.passwordEncoder = passwordEncoder;
// }

// @PostMapping("/login")
// public AuthResponse login(@RequestBody LoginRequest loginRequest) {
// // Authenticate user
// Optional<User> userOpt =
// userService.findByUsername(loginRequest.getUsername());
// if (userOpt.isEmpty() || !passwordEncoder.matches(loginRequest.getPassword(),
// userOpt.get().getPassword())) {
// throw new RuntimeException("Invalid username or password");
// }

// User user = userOpt.get();
// String accessToken = userService.generateAccessToken(user.getUsername(),
// user.getRole());
// String refreshToken = userService.generateRefreshToken(user.getUsername());

// userService.saveRefreshToken(user.getId(), refreshToken);

// return new AuthResponse(accessToken, refreshToken);
// }

// @PostMapping("/refresh-token")
// public AccessTokenResponse refreshToken(@RequestBody TokenRefreshRequest
// refreshRequest) {
// String newAccessToken =
// userService.refreshToken(refreshRequest.getRefreshToken());
// if (newAccessToken == null) {
// throw new RuntimeException("Invalid refresh token");
// }
// return new AccessTokenResponse(newAccessToken);
// }
// }
