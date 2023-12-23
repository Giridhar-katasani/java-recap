package com.java.misc;

import java.util.Objects;

public class Animal implements Cloneable {
	
	public Animal(int eyes, boolean mammel) {
		super();
		this.eyes = eyes;
		this.mammel = mammel;
	}

	@Override
	public String toString() {
		return "Animal [eyes=" + eyes + ", mammel=" + mammel + "]";
	}
	
	private int eyes;
	private boolean mammel;
	
	public int getEyes() {
		return eyes;
	}
	
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	
	public boolean isMammel() {
		return mammel;
	}
	
	public void setMammel(boolean mammel) {
		this.mammel = mammel;
	}
	
	public Object clone() {
		return eyes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eyes, mammel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		System.out.println(getClass()+" "+obj.getClass());
		System.out.println(getClass() != obj.getClass());
		System.out.println(this.getClass().getName() + " " + obj.getClass().getName());
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return eyes == other.eyes && mammel == other.mammel;
	}
	
	
}
