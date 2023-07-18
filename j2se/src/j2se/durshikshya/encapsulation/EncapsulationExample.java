package j2se.durshikshya.encapsulation;
//import lombok.AllArgsConstructor;
//
//@AllArgsConstructor
public class EncapsulationExample {
	public static void main(String[] args) {
		Person p = new Person();
		p.setId(123); 
		p.setName("Ratan Tata");
		p.setAddress("Mumbai");
//		p.setId = 123;
//		p.name = "Ratan Tata";
//		p.address = "Mumbai";
		System.out.println(p.getId()+". "+p.getName()+"\t"+p.getAddress());
	}
}
