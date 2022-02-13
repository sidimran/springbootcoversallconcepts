package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Bank_Id")
	private Long bankId;

	@Column(name = "Bank_Name")
	private String bankName;

	@Column(name = "Created_Date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;

	@Column(name = "Created_By")
	private String createdBy;

	@Column(name = "last_Updated_Date")
	@Temporal(TemporalType.DATE)
	private Date lastUpdatedDate;

	@Column(name = "last_Updated_By")
	private String lastupdatedBy;

	@Embedded
	private Address address;

	/**
	 * Sample for @ElementCollection
	 */
	@ElementCollection
	@CollectionTable(name = "BANK_CONTACT", joinColumns = @JoinColumn(referencedColumnName = "Bank_Id"))
	@Column(name = "Name")
	private List<String> contact = new ArrayList<>();

}
