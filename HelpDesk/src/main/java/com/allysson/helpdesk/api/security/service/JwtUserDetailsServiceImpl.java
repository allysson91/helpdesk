package com.allysson.helpdesk.api.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.allysson.helpdesk.api.entity.User;
import com.allysson.helpdesk.api.security.jwt.JwtUserFactory;
import com.allysson.helpdesk.service.UserService;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		User user = userService.findByEmail(email);
		if(user == null) {
			throw new UsernameNotFoundException(String.format("No user found with username '%s'. ", email));
		}else {
			return JwtUserFactory.create(user);
		}
	
	}

	
	
}
