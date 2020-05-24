package com.javacodegeeks.jpaexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON_DETAILS")
public class PersonDetails {
	
	@Column(name = "id")
	@Id
	private Long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private Integer age;

	
	
	
	public PersonDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonDetails(Long id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
    public String toString() {
        return String.format("PersonDetails{id=%d, name='%s', age=%d}", id, name, age);
    }

}
