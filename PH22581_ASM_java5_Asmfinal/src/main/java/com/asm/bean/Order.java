package com.asm.bean;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "Orders")
public class Order implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	@Column(name = "createdate")
	private Date createDate = new Date();
	private String address;
	@ManyToOne
	@JoinColumn(name = "username")
	private Account account;
	@JsonIgnore
	@OneToMany(mappedBy = "order")
	private List<OrderDetail> orderDetails;
}
