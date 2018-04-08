package com.itservicesdepot.example.springbatch.jsonreader.model;

public class SoccerJsonEntry {
	private String name;
	private String nation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "SoccerJsonEntry [name=" + name + ", nation=" + nation + "]";
	}
	
	
}
