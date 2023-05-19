// package com.example.springcashier;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.http.HttpMethod;
// import org.springframework.security.config.Customizer;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// public class SecurityConfig {
//     // @Bean
//     // public PasswordEncoder passwordEncoder() {
//     //     return new BCryptPasswordEncoder();
//     // }
//     /**
//      * @return
//      */
//     @Bean
//     public UserDetailsService users() {
//         final UserDetails user = User.builders()
//                 .username("user")
//                 .password("password")
//                 .roles("USER")
//                 .build();
//         return new InMemoryUserDetailsManager(user);
//     }

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

//         http.headers().frameOptions().sameOrigin();
//         SecurityFilterChain ret = http
//                 .formLogin(withDefaults())
//                 .authorizeRequests()
//                 .antMatchers("/casheier").hasRole("USER")
//                 .and()
//                 .build();
//         return ret;
//     }


// }

