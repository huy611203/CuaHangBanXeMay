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
public class ReportProduct implements Serializable{
	@Id
	public Long id;
	public String name;
	public Long count;
}
