package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.BranchDto;
import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models.Branch;

@Component
public class BranchConverter {

	public Branch dtoToEntity(BranchDto branchDto) {

		Branch branch = new Branch();
		branch.setBranchId(branchDto.getBranchId());
		branch.setBranchName(branchDto.getBranchName());
		branch.setBranchAddress(branchDto.getBranchAddress());
		

		return branch;
	}

	public List<Branch> dtoToEntity(List<BranchDto> branchDto) {
		return branchDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}

	public BranchDto entityToDto(Branch branch) {

		BranchDto branchDto = new BranchDto();

		return branchDto;
	}

	public List<BranchDto> entityToDto(List<Branch> branch) {

		return branch.stream().map(this::entityToDto).collect(Collectors.toList());
	}

}
