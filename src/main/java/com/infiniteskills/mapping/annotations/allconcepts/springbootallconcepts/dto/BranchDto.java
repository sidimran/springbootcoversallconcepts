package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto;

import javax.validation.constraints.NotNull;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Branch;

import lombok.Data;

@Data
public class BranchDto {

	private Long branchId;

	@NotNull(message = "enter branch_name")
	private String branchName;

	@NotNull(message = "enter branch_Address")
	private String branchAddress;
	
	
	private Branch branch;

}
