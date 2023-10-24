package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Options {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	private int optIndex;
	public String opt;
	
	@ManyToOne
	@JoinColumn(name = "ques_id",referencedColumnName = "questionId")
	@JsonBackReference
	private Questions questions;
	
	public String getOpt() {
		return opt;
	}
	public void setOpt(String opt) {
		this.opt = opt;
	}
	public Options(int id, String opt) {
		super();
		this.id = id;
		this.opt = opt;
	}
	public Options() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOptIndex() {
		return optIndex;
	}
	public void setOptIndex(int optIndex) {
		this.optIndex = optIndex;
	}
}
