package com.example6.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends User
{
	@Column(length = 50)
	private String name;
	@Column(length = 100)
	private String address;
	@Column(unique = true)
	private String phNo;
	private boolean status=Boolean.TRUE;

	//many students -one teacher
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "tId")
	@JsonIgnoreProperties("students")
	private Teacher teacher;
}
