package com.example.demo.controller;

public class scriviQuelloCheVuoi {

	private final long id;
	private final String content;

	public scriviQuelloCheVuoi(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
