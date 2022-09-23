package com.example.SHHHH_Quiz_Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/h2/**","/h2","/save","/signup", "/style.css", "/photos/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/userpage", true)
                .permitAll().and().csrf().disable();
        http.headers().frameOptions().disable();
    }
    private static InMemoryUserDetailsManager manager;
    @Bean
    public UserDetailsService userDetailsService() {
        manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withDefaultPasswordEncoder().username("user").password("123").roles("USER").build());


        return manager;
    }

    public static void addUser(String username, String password) {
        manager.createUser(org.springframework.security.core.userdetails.User.withDefaultPasswordEncoder().username(username).password(password).roles("USER").build());
    }

}
