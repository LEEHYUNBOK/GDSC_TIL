package com.example.security2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // csrf : 인터넷 사용자(희생자)가 자신의 의지와는 무관하게
        // 공격자가 의도한 행위(수정, 삭제, 등록 등)를 특정 웹사이트에 요청하게 만드는 공격
        // 왠만하면 끄지말자 대신 csrf 토큰이랑 같이 보내야함
        http.csrf().disable();

        return http.authorizeRequests() // Request에 인증, 인가를 부여하겠다.
                .antMatchers("/user/**").hasRole("USER") // /user 로 시작하는 uri는 USER 롤이 있어야 접속가능
                .antMatchers("/admin/**").hasRole("ADMIN") // /admin으로 작하는 uri는 ADMIN 롤이 있어야 접속가능.
                .antMatchers().permitAll() // 그 외 요청들은 인증, 인가가 필요없다.
                .antMatchers("/test").authenticated()
                .and()
                .formLogin() // 폼 로그인을 사용하겠다.
                .loginProcessingUrl("/login") // 로그인 uri
                .defaultSuccessUrl("/") // 로그인 성공시 리다이렉트 uri
                .and()
                .build();
    }
}
