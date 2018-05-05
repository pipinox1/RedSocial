package com.eduardo.redSocial.model;


import com.eduardo.redSocial.entity.Donante;

public class UserRoleModel {
	
	

		
		private Integer userRoleID;
		
		
		private Donante user;
		
	
		private String role;

		public UserRoleModel () {}
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
