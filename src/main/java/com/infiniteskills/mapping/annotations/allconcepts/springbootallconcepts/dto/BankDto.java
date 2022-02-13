package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Address;

import lombok.Data;

@Data
public class BankDto {

	private Long bankId;

	@NotNull(message = "enter bank name")
	private String bankName;

	@NotNull(message = "enter created date")

	private Date createdDate;

	@NotNull(message = "enter createdby")
	private String createdBy;

	@NotNull(message = "enter last updatedDate")

	private Date lastUpdatedDate;

	@NotNull(message = "enter last updateBy")
	private String lastupdatedBy;

	private Address address;
	
	@NotNull(message = "enter contact person")
	@JsonIgnore
	private List<String> contact = new ArrayList<>();
}
