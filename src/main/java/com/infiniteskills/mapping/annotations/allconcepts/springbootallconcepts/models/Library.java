package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Library_Books")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "library_Id")
	private Long libraryId;

	@Column(name = "Library_name")
	private String libraryname;

	@Column(name = "Library_Address")
	private String libraryAddress;

	/**
	 * @OneToMany uniDirectional, (But this is example for BiDirectional) hear I
	 *            cannot see Book_Id In Library Table, if I don't use
	 *            JoinColumn(name ="Book_Id"), you see mapping error
	 */

	@OneToMany
	// @JoinColumn(name = "Book_Id")
	private List<Books> booksList;

}
