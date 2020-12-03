package gaba.REST.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {
private int age;
private String name;
private boolean active;
private Organs organs;
public Person() {}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public boolean isActive() {
	return active;
}

public void setActive(boolean active) {
	this.active = active;
}

public Organs getOrgans() {
	return organs;
}

public void setOrgans(Organs organs) {
	this.organs = organs;
}

@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + ", active=" + active + ", organs=" + organs + "]";
}

}
