package com.infosys.model;

import org.springframework.stereotype.Component;

@Component
public class Person {

	public String age;
	public String name;
	public String location;
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", location=" + location + "]";
	}
	public Person(String age, String name, String location) {
		super();
		this.age = age;
		this.name = name;
		this.location = location;
	}

	public Person() {
		super();
	}
	


}
