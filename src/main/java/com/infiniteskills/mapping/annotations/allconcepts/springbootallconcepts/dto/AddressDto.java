package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AddressDto {

	@NotNull(message = "enter address_Line_1")
	private String addressLine1;

	@NotNull(message = "enter address_Line_1")
	private String addressLine2;

	@NotNull(message = "enter City")
	private String city;

	@NotNull(message = "enter state")
	private String state;

	@NotNull(message = "enter ZIP_Code")
	private int zipCode;

}
