package com.domain;

import java.util.HashSet;
import java.util.Set;

public class users {
	private Integer id;
	private String login;
	private String name;
	private String pass;
	private Set<forder> forders = new HashSet<forder>(0);
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Set<forder> getForders() {
		return forders;
	}
	public void setForders(Set<forder> forders) {
		this.forders = forders;
	}
	private String sex;
	private String phone;
	private String email;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "users [id=" + id + ", login=" + login + ", name=" + name + ", pass=" + pass + ", sex=" + sex
				+ ", phone=" + phone + ", email=" + email + "]";
	}
	
}
