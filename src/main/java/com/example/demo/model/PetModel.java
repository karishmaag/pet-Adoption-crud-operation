package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="petadoption")
public class PetModel {
    
	@Id
	private int animlaid;
    private String animalname;
    private String animalspecies;
    private String animalcolor;
    private String gender;
    private int weight;
    private int age;
    private String features;
	public PetModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PetModel(int animlaid, String animalname, String animalspecies, String animalcolor, String gender,
			int weight, int age, String features) {
		super();
		this.animlaid = animlaid;
		this.animalname = animalname;
		this.animalspecies = animalspecies;
		this.animalcolor = animalcolor;
		this.gender = gender;
		this.weight = weight;
		this.age = age;
		this.features = features;
	}
	public int getAnimlaid() {
		return animlaid;
	}
	public void setAnimlaid(int animlaid) {
		this.animlaid = animlaid;
	}
	public String getAnimalname() {
		return animalname;
	}
	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}
	public String getAnimalspecies() {
		return animalspecies;
	}
	public void setAnimalspecies(String animalspecies) {
		this.animalspecies = animalspecies;
	}
	public String getAnimalcolor() {
		return animalcolor;
	}
	public void setAnimalcolor(String animalcolor) {
		this.animalcolor = animalcolor;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	
}
