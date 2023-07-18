package j2se.durshikshya.classandObject;

public class App {
	public static void main(String[] args) {
		//Dog dog = new Dog();
		
//		dog.age = 3;
//		dog.breed = "Golden Retriever";
//		dog.color = "Golden";
		Dog dog = new Dog(2,"German Shepherd","brown and black");
		System.out.println(dog.breed+"\t"+dog.color+"\t"+dog.age);
		dog.feed();
		dog.kick();
		
	}

}
