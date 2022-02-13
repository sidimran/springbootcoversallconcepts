package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Credentials;

import lombok.Data;

@Data
public class UserDto {

	private Long userId;

	@NotNull(message = "Enter First_Name")
	private String firstName;

	@NotNull(message = "Enter Last_Name")
	private String lastName;

	@NotNull(message = "Enter Birth_Date")
	private Date birthDate;

	@NotNull(message = "Enter Email_Address")
	private String emailAddress;

	@NotNull(message = "Enter Last_Updated_Date")
	private Date lastUpdatedDate;

	@NotNull(message = "Enter Last_Updated_By ")
	private String lastUpdatedBy;

	@NotNull(message = "Enter Create_Date")
	private Date createDate;

	@NotNull(message = "Enter Created_By")
	private String createdBy;

	/**
	 * @OneToOne Bidirectional, Its present in User Entity
	 */

	private Credentials credentials;
	
	

}
