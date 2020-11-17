package model;

public class Student {
	private String name;
	private int age;
	private char gender;
	private int id;
	
	public Student(String name, int age, char gender, int id) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
