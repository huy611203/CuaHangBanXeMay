package com.asm.report;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ReportCost implements Serializable{
	@Id
	public Date date;
	public Long sumOrder;
	public Double cost;
}
