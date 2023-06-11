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
@Table(name = "Roles")
public class Role implements Serializable{
	@Id
	private String role;
	private String description;
	@JsonIgnore
	@OneToMany(mappedBy = "role")
	private List<RoleDetail> roleDetails;
}
