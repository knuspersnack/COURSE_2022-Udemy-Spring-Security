/*
package com.easybytes.config;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;


@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //--Default
        //http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
        http.csrf().disable();
        //--Part allowed, part only with auth
        http.authorizeRequests()
                .antMatchers("/myAccount").authenticated()
                .antMatchers("/myBalance").authenticated()
                .antMatchers("/myLoans").authenticated()
                .antMatchers("/myCards").authenticated()
                .antMatchers("/notices").permitAll()
                .antMatchers("/register").permitAll()
                .antMatchers("/contact").permitAll()
                .and().formLogin().and().httpBasic();

        //--All requests are denied
        //http.authorizeRequests().anyRequest().denyAll().and().formLogin().and().httpBasic();

        //--Disable security
        //http.authorizeRequests().anyRequest().permitAll().and().formLogin().and().httpBasic();

    }
    

    //@Override
    //protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    //    auth.inMemoryAuthentication().withUser("admin").password("12345").authorities("admin")
    //        .and().withUser("user").password("12345").authorities("read")
    //        .and().passwordEncoder(NoOpPasswordEncoder.getInstance());
    //}

    //--In Memory
    //@Override
    //protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    // InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
    //    UserDetails user = User.withUsername("admin").password("12345").authorities("admin").build();
    //    UserDetails user1 = User.withUsername("user").password("12345").authorities("read").build();
    //    userDetailsManager.createUser(user);
    //    userDetailsManager.createUser(user1);
    //    auth.userDetailsService(userDetailsManager);
    //}

    //--In MySQL - Default
    //@Bean
    //public UserDetailsService userDetailsService(DataSource dataSource) {
    //    return new JdbcUserDetailsManager(dataSource);
    //}

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
*/