package com.inheritance.exercise1_2;

import com.inheritance.exercise1.Animal;

public class Reptile extends Animal {
	
//	public String showInfo() {
//		return "Reptile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + "]";
//	}

	protected String skin,egg;
	protected boolean backbone;
	
	public Reptile() {
		super();
		this.skin = "dry skin";
		this.backbone = true;
		this.egg = "softShelled";
	}
	
	
}
