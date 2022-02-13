package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
public class Credentials {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Credential_Id")
	private Long credentialId;

	@Column(name = "User_name")
	private String userName;

	@Column(name = "Password")
	private String password;

	/**
	 * @OneToOne Unidirectional, Hybernate automatically created a column ie user_id
	 *           else if you want your own column only, then I can give @JoinColumn(name="User_Id")
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	@JoinColumn(name = "USER_ID")
	private User user;

}
