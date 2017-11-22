package de.michlb.demo.gateway.config.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfigure extends WebSecurityConfigurerAdapter  {

    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
  	  
    	super.configure(http);
//        http
//            .authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//            .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//            .logout()
//                .permitAll();
//    	
    	  http.authorizeRequests().anyRequest().authenticated()
//    	  .and().formLogin()
//    	  .loginPage("/login").permitAll()
    	  .and().logout().permitAll();
    	  http.csrf().disable();
//
//    	  http.addFilterBefore(
//    			  new SNSAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class
//    			  );
    }
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");
    }
    
}