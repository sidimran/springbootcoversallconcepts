package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
@Table(name = "FINANCES_USER")

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	// @GeneratedValue(strategy = GenerationType.TABLE, generator =
	// "user_table_generator")
	// @TableGenerator(name = "user_table_generator", table = "IFINANCES_KEYS",
	// pkColumnName = "PK_NAME", valueColumnName = "PK_VALUE")
	@Column(name = "USER_ID")
	private Long userId;

	@Column(name = "First_Name")
	private String firstName;

	@Column(name = "Last_Name")
	private String lastName;

	@Column(name = "Birth_Date")
	@Temporal(TemporalType.DATE)
	private Date birthDate;

	@Column(name = "Email_Address")
	private String emailAddress;

	@Column(name = "Last_Updated_Date")
	@Temporal(TemporalType.DATE)
	private Date lastUpdatedDate;

	@Column(name = "Last_Updated_By", updatable = true)
	private String lastUpdatedBy;

	@Column(name = "Created_Date")
	@Temporal(TemporalType.TIME)
	private Date createDate;

	@Column(name = "Created_By")
	private String createdBy;

	/**
	 * @OneToOne Unidirectional, hear I am calling Credentials_Id, as my
	 *           foreign-key, if you given @JoinColumn(name="USER_ID"), this does
	 *           not make sense, because we are bother about only One entity i.e.
	 *           User Entity,
	 */
	@OneToOne
	private Credentials credentials;

}
