package j2se.durshikshya.finalAndStatic;

public class FinalKeyword {
	public static void main(String[] args) {
		final int x = 234;
		//x = 432;
		DerivedClass dc = new DerivedClass();
		//dc.name = "Sunita";
		//dc.hello();
		
	}

}

final class BaseClass{
	String name;
	final public void hello() {
		System.out.println("Greetings, "+name);
	}
}

class DerivedClass {
//	
//	@Override
//	public void hello(){
//		System.out.println("Welcome, name!");
//		
//	}
	
}
