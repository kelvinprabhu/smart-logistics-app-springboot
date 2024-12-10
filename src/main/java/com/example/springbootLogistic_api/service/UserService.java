// package com.example.springbootLogistic_api.service;

// import com.example.springbootLogistic_api.entity.User;
// import com.example.springbootLogistic_api.repository.UserRepository;
// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.SignatureAlgorithm;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.stereotype.Service;

// import java.util.Date;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Optional;

// @Service
// public class UserService {

// @Value("${jwt.secret}")
// private String jwtSecret;

// @Value("${jwt.expiration.ms}")
// private long jwtExpirationMs;

// private final UserRepository userRepository;
// private final PasswordEncoder passwordEncoder;

// public UserService(UserRepository userRepository, PasswordEncoder
// passwordEncoder) {
// this.userRepository = userRepository;
// this.passwordEncoder = passwordEncoder;
// }

// public Optional<User> findByUsername(String username) {
// return userRepository.findByUsername(username);
// }

// public User save(User user) {
// user.setPassword(passwordEncoder.encode(user.getPassword()));
// return userRepository.save(user);
// }

// public String generateAccessToken(String username, String role) {
// Map<String, Object> claims = new HashMap<>();
// claims.put("username", username);
// claims.put("role", role);

// return Jwts.builder()
// .setClaims(claims)
// .setIssuedAt(new Date(System.currentTimeMillis()))
// .setExpiration(new Date(System.currentTimeMillis() + jwtExpirationMs))
// .signWith(SignatureAlgorithm.HS256, jwtSecret)
// .compact();
// }

// public String generateRefreshToken(String username) {
// // Generate a new refresh token, potentially using a UUID or some secure
// method.
// // This is a placeholder implementation.
// return "refreshTokenFor" + username;
// }

// public void saveRefreshToken(Long userId, String refreshToken) {
// Optional<User> userOpt = userRepository.findById(userId);
// userOpt.ifPresent(user -> {
// user.setRefreshToken(refreshToken);
// userRepository.save(user);
// });
// }

// public String refreshToken(String refreshToken) {
// // Refresh token logic: validate the refresh token, and if valid, issue a new
// // access token.
// Optional<User> userOpt = userRepository.findByRefreshToken(refreshToken);
// if (userOpt.isPresent()) {
// User user = userOpt.get();
// String newAccessToken = generateAccessToken(user.getUsername(),
// user.getRole());
// saveRefreshToken(user.getId(), newAccessToken); // Optional: update refresh
// token too
// return newAccessToken;
// }
// return null;
// }
// }
