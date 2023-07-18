package j2se.durshikshya.classandObject;

public class Dog {
	int age;
	String breed;
	String color;
	
	public Dog(int age, String breed, String color) {
		this.age = age;
		this.breed = breed;
		this.color = color;
	}
	
	public Dog() {
		
	}
	
	public void feed() {
		System.out.println("Wag tail ....");
	}
	public void kick() {
		System.out.println("Bark and attack .....");
	}
	
}
