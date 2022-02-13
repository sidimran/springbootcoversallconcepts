package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.dto.BranchDto;

import lombok.Data;

@Entity
@Data
@Table(name = "Company_Branch")

/**
 * 
 * This is Sample of @OneToMany Unidirectional
 *
 */
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Company_Id")
	private Long companyId;

	@Column(name = "Company_Name")
	private String companyName;

	@Column(name = "Started_date")
	@Temporal(TemporalType.DATE)
	private Date startedDate;

	/**
	 * 
	 * This is Sample of @OneToMany Unidirectional, You should give Id from parent
	 * entity, In my example Company is my Parent if you give @JoinColumn(name =
	 * "Branch_Id"), you will not see error, nor will see column (Company_Id) in
	 * Branch table, but in Postgresql, you can see company Company_Id as foreign in
	 * in Branch Table
	 * 
	 *
	 */

	/**
	 * 
	 * I noticed, that in @OneToMany I should pass Parent Entity Id, In my
	 * example @JoinColumn(name = "Company_Id"), else I observed in Postgresql,
	 * there was no foreign-key in Branch table
	 */

	/**
	 * 
	 * @OneToMany unidirectional
	 */
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Branch_Id")
	private List<Branch> branchList;

}
