package com.example.demo;

public class Book {

	private int id;
	private String name;
	private String description;
	private String author;

	public Book(int id, String name, String description, String author) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", description=" + description + ", author=" + author + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
