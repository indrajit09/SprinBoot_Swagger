package com.Indra.spring.swagger.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book implements Serializable {

	private static final long serialVersionUID = -1670893016517855654L;
	@Id
	@GeneratedValue
	@ApiModelProperty(value = "autogenerated id")
	private int bookId;
	@ApiModelProperty(value = "this is the book name")
	private String bookName;
	@ApiModelProperty(value = "this is book price")
	private double price;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
