package com.asm.bean;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Categories")
public class Category implements Serializable{
	@Id
	private String id;
	private String name;
	@JsonIgnore
	@OneToMany(mappedBy = "category")
	private List<ProductCategory> ProductCategories;
}
