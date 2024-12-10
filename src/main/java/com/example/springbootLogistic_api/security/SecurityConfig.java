// package com.example.springbootLogistic_api.security;

// import
// com.example.springbootLogistic_api.security.jwt.JwtAuthenticationEntryPoint;
// import
// com.example.springbootLogistic_api.security.jwt.JwtAuthenticationFilter;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
// import
// org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import
// org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import
// org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import
// org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import
// org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import
// org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

// import javax.servlet.FilterChain;
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import java.io.IOException;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig extends WebSecurityConfigurerAdapter {

// private final UserDetailsService userDetailsService;
// private final JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

// @Value("${jwt.secret}")
// private String jwtSecret;

// @Value("${jwt.expiration.ms}")
// private long jwtExpirationMs;

// public SecurityConfig(UserDetailsService userDetailsService,
// JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint) {
// this.userDetailsService = userDetailsService;
// this.jwtAuthenticationEntryPoint = jwtAuthenticationEntryPoint;
// }

// @Bean
// public PasswordEncoder passwordEncoder() {
// return new BCryptPasswordEncoder();
// }

// @Bean
// @Override
// public AuthenticationManager authenticationManagerBean() throws Exception {
// return super.authenticationManagerBean();
// }

// @Override
// protected void configure(AuthenticationManagerBuilder auth) throws Exception
// {
// auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
// }

// @Override
// protected void configure(HttpSecurity http) throws Exception {
// http.cors().and().csrf().disable()
// .exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint)
// .and()
// .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
// .and()
// .authorizeRequests()
// .antMatchers("/api/users/login", "/api/users/refresh-token").permitAll()
// .anyRequest().authenticated();

// http.addFilterBefore(new JwtAuthenticationFilter(jwtSecret,
// userDetailsService),
// UsernamePasswordAuthenticationFilter.class);
// }
// }
