package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Address {

	/**
	 * This is example for Embedded class
	 */
	@Column(name = "Address_Line_1")
	private String addressLine1;

	@Column(name = "Address_Line_2")
	private String addressLine2;

	@Column(name = "City")
	private String city;

	@Column(name = "State")
	private String state;

	@Column(name = "ZIP_CODE")
	private int zipCode;

}
