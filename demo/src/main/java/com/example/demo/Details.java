package com.example.demo;

public class Details {

	private int id;
	private String name;
	private double mark;
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
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public Details(int id, String name, double mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	public Details() {
		
	}
}
