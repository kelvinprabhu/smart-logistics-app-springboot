// package com.example.springbootLogistic_api.security.jwt;

// import com.example.springbootLogistic_api.service.UserService;
// import io.jsonwebtoken.Claims;
// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.SignatureException;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.security.core.userdetails.UserDetails;
// import
// org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import
// org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
// import org.springframework.stereotype.Component;

// import javax.servlet.FilterChain;
// import javax.servlet.FilterConfig;
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import java.io.IOException;

// @Component
// public class JwtAuthenticationFilter extends
// UsernamePasswordAuthenticationFilter {

// private final UserDetailsService userDetailsService;
// private final String jwtSecret;

// public JwtAuthenticationFilter(@Value("${jwt.secret}") String jwtSecret,
// UserDetailsService userDetailsService) {
// this.jwtSecret = jwtSecret;
// this.userDetailsService = userDetailsService;
// }

// @Override
// protected void doFilterInternal(HttpServletRequest request,
// HttpServletResponse response, FilterChain chain)
// throws IOException, ServletException {
// final String header = request.getHeader("Authorization");

// if (header == null || !header.startsWith("Bearer ")) {
// chain.doFilter(request, response);
// return;
// }

// String token = header.substring(7);

// try {
// Claims claims =
// Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
// String username = claims.getSubject();

// UserDetails userDetails = userDetailsService.loadUserByUsername(username);
// UsernamePasswordAuthenticationToken authentication = new
// UsernamePasswordAuthenticationToken(userDetails,
// null, userDetails.getAuthorities());

// // After setting authentication, set it in the security context.
// SecurityContextHolder.getContext().setAuthentication(authentication);
// } catch (SignatureException | IllegalArgumentException |
// UsernameNotFoundException e) {
// logger.error("Token validation failed: " + e.getMessage());
// }

// chain.doFilter(request, response);
// }
// }
