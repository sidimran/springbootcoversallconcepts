package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Branch_Company")
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Branch_Id")
	private Long branchId;

	@Column(name = "Branch_name")
	private String branchName;

	@Column(name = "Branch_Address")
	private String branchAddress;

}
