package com.asm.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Brands")
public class Brand implements Serializable{
	@Id
	private String id;
	private String name;
	private String image;
	@JsonIgnore
	@OneToMany(mappedBy = "brand")
	private List<Product> products;
}
