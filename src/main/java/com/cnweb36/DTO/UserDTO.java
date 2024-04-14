package com.cnweb36.DTO;

import java.util.Date;

import com.cnweb36.Entity.UserEntity;



public class UserDTO {
	
	private Long id;
	private String createBy;
	private Date createDate;
	private Date modifiedDate;
	private String username;	
	private String password;
	private String name;
	private String email;
	private String address;
	private String phone;
	private String role;
	
	public UserEntity toEntity(UserDTO userDTO) {
		UserEntity userEntity=new UserEntity();
		
		userEntity.setAddress(userDTO.getAddress());
		userEntity.setEmail(userDTO.getEmail());
		userEntity.setName(userDTO.getName());
		userEntity.setPassword(userDTO.getPassword());
		userEntity.setPhone(userDTO.getPhone());
		userEntity.setUsername(userDTO.getUsername());
		userEntity.setRole("USER");
		
		return userEntity;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
