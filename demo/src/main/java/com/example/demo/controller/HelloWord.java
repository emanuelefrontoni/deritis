package com.example.demo.controller;

public class HelloWord {
	private String nome;
	private String cognome;
	
	public HelloWord(String nome, String cognome) {
		this.setNome(nome);
		this.setCognome(cognome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
}