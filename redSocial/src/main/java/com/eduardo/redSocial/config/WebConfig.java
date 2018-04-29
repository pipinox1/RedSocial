package com.eduardo.redSocial.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
public class WebConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	@Qualifier("donanteLogService")
	private UserDetailsService userService;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
		.antMatchers("/css/*","/imgs/*","/registrar/*").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/login").loginProcessingUrl("/checkLogin")
		.usernameParameter("username")
		.passwordParameter("password")
		.defaultSuccessUrl("/loginsucces").permitAll()
		.and()
		.logout().logoutUrl("/logout").logoutSuccessUrl("/login?logout").permitAll();
		
		super.configure(http);
	}
	
	

}
