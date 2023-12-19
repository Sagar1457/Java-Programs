package com.example6.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="products")
public class Products {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String price;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private User user;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Category category;
}
