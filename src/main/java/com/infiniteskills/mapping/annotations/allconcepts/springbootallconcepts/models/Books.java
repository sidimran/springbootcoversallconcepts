package com.infiniteskills.mapping.annotations.allconcepts.springbootallconcepts.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Books_Library")
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Book_Id")
	private Long bookId;

	@Column(name = "Book_Name")
	private String bookName;

	@Column(name = "Book_Author")
	private String bookAuthor;

	@Column(name = "Book_Volume")
	private int bookVolume;

	@Column(name = "Published_Date")
	private Date publishedDate;

	/**
	 * @ManyToOne BiDirectional, hear I am calling Book Id as Foreign-ke, In Books
	 *            Table I can see Library_Id
	 */

	@ManyToOne
	@JoinColumn(name = "library_Id")
	private Library library;

}
