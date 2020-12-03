package gaba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class user {

@Id
@Column(name="id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@NotNull(message = "is required")
@Size(min = 4, message = "is required")
@Column(name="username")
private String username;
@NotNull(message = "is required")
@Size(min = 4, message = "is required")
@Column(name="password")
private String password;
@NotNull(message = "is required")
@Size(min = 4, message = "is required")
@Column(name="email")
private String email;
public user() {
}
public String getUsername() {
System.out.println(getClass()+" Getter username");
return username;
}

public void setUsername(String username) {
	System.out.println(getClass()+" Setter username");
this.username = username;
}
public String getPassword() {
	System.out.println(getClass()+" Getter password");
return password;
}
public void setPassword(String password) {
	System.out.println(getClass()+" Setter password");
this.password = password;
}

@Override
public String toString() {
	return "user [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
}
public int getId() {
	System.out.println(getClass()+" Getter ID");
	return id;
}
public void setId(int id) {
	System.out.println(getClass()+" Setter ID");
	this.id = id;
}
public String getEmail() {
	System.out.println(getClass()+" Getter email");
	return email;
}
public void setEmail(String email) {
	System.out.println(getClass()+" Setter email");
	this.email = email;
}



}
