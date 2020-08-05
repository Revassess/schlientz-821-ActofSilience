package com.revature.model; 

public class User {
int user_id;
String username;
String password;
String first_name;
String last_name;
int role_id; 


public User() {
	super();
	}


public User(String first_name, String last_name, int role_id, String password, int user_id, String username) {
	super();
	this.first_name = first_name;
	this.last_name = last_name;
	this.role_id = role_id;
	this.password = password;
	this.user_id = user_id;
	this.username = username;
}


public int getUser_id() {
	return user_id;
}


public void setUser_id(int user_id) {
	this.user_id = user_id;
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


public String getFirst_name() {
	return first_name;
}


public void setFirst_name(String first_name) {
	this.first_name = first_name;
}


public String getLast_name() {
	return last_name;
}


public void setLast_name(String last_name) {
	this.last_name = last_name;
}


public int getRole_id() {
	return role_id;
}


public void setRole_id(int role_id) {
	this.role_id = role_id;
}

}