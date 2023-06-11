package com.asm.bean;

import java.io.Serializable;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roledetails")
public class RoleDetail implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "accountid")
	private Account account;
	@ManyToOne
	@JoinColumn(name = "roleid")
	private Role role;
}
