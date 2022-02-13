package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto;

import java.util.Date;
import java.util.List;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Branch;

import lombok.Data;

@Data
public class CompanyDto {

	private Long companyId;

	@NotNull(message = "enter company_name")
	private String companyName;

	@NotNull(message = "enter started_date")
	@Temporal(TemporalType.DATE)
	private Date startedDate;

	private List<Branch> branchList;
	
	private Branch branch;

}
