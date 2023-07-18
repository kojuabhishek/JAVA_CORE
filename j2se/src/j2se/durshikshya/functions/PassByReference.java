package j2se.durshikshya.functions;

public class PassByReference {
	public static void main(String[] args) {
		Person p = new Person("Ishara","Kathmandu");
		
		System.out.println("main: "+p.name);
		change(p);
		System.out.println("main: "+p.name);
	}
	static void change(Person p) {
		p.name+="  Dhakal";
		System.out.println("Change : "+p.name);
		
	}
	
	//can use array instead of class
	

}
class Person{
	String name;
	String address;
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
}
