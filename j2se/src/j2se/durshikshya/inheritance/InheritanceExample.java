package j2se.durshikshya.inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		Employee emp = new Employee();
		//Person emp = new Employee();
		
		emp.empId = 12345;
		emp.nationalId = 4213131;
		emp.name = "Sandeep Khanal";
		emp.address = "Bhaktapur";
		emp.position = "Manager";
		emp.salary = 6500f;
		
		//emp.show();
		emp.display();
		
		
		
	}
	

}
class Person{
	String name;
	String address;
	int nationalId;
	public Person() {
		System.out.println("Public ocnstructor called ...");
	}
	public void display() {
		System.out.println("National Id: "+nationalId+"Name: "+name+"\tAddress"+address);
	}
}

class Employee extends Person{
	int empId;
	String position;
	float salary;
	
	public Employee() {
		System.out.println("Employee Constructor called....");
		
	}
	
	@Override
//	public void display() {
//		
//		super.display();
//		System.out.println("Employee Id: "+empId+
//				"\tposition: "+position+
//				"\t Salary: "+salary);
//	}
//	
//	//or
	
	 public void display(){
	 System.out.println(nationalId+"\t"+name+"\t"+empId+"\t"+position+"\t"+salary);
	 }
	
	public void hello() {
		System.out.println("Child class....");
	}
	  
	  
}
