package com.eduardo.redSocial.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eduardo.redSocial.entity.Donante;
import com.eduardo.redSocial.entity.UserRole;
import com.eduardo.redSocial.repository.DonanteRepository;

@Service("donanteLogService")
public class DonanteLogService implements UserDetailsService {
	

	@Autowired
	@Qualifier("donanteRepository")
	private DonanteRepository donanteRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Donante donante= donanteRepository.findByUserdonante(username);
		List<GrantedAuthority> auth = buildAuthorities(donante.getUserRole());
		
		return buildUser(donante, auth);
	}
	
	private User buildUser(Donante user, List<GrantedAuthority> authorities) {
		
		return new User(user.getUserdonante(),user.getPassdonante(), true,true, true, true,authorities);
	}
	
	private List<GrantedAuthority> buildAuthorities(Set<UserRole> userRole){
		
		Set<GrantedAuthority> auths = new HashSet<>();
		
		for(UserRole Role : userRole) {
			auths.add(new SimpleGrantedAuthority(Role.getRole()));
		}
		return new ArrayList<GrantedAuthority>(auths);
	}
	

}
