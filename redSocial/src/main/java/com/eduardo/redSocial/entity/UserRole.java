package com.eduardo.redSocial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name=" user_roles" , uniqueConstraints = @UniqueConstraint(
		columnNames= {"role","username"}))
public class UserRole {

	@Id
	@GeneratedValue
	@Column(name="userRoleID", unique = true, nullable = false)
	private Integer userRoleID;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "username", nullable = false)
	private Donante user;
	
	@Column(name = "role", nullable=false, length = 45)
	private String role;

	public UserRole() {}
	
	public UserRole(Donante user, String role) {
		super();
		this.user = user;
		this.role = role;
	}

	public Integer getUserRoleID() {
		return userRoleID;
	}

	public void setUserRoleID(Integer userRoleID) {
		this.userRoleID = userRoleID;
	}

	public Donante getUser() {
		return user;
	}

	public void setUser(Donante user) {
		this.user = user;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
}
