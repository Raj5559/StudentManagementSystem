package com.demo.in.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	@Column
	@NotEmpty(message = "student Name is required")
	private String sname;
	@Column
	@NotEmpty(message = "student city is required")
	private String scity;
	@Column
	@NotEmpty(message = "student gender is required")
	private String gender;
	@Column
	@Pattern(regexp = "[789][0-9]{9}",message = "Please enter valid mobile number")
	private String smobile;
	@Column
	@Email(regexp = "[a-z0-9.]+@[a-z]+\\.[a-z]{2,3}",message = "Please enter valid email")
	private String semail;
	
}