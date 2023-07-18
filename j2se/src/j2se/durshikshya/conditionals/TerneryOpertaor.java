package j2se.durshikshya.conditionals;

public class TerneryOpertaor {
	public static void main(String[] args) {
		int age = 33;
		String msg= age<18?"minor":"adult";
		System.out.println(msg);
		
		int age1 = 79;
		String msg1 = age1<18?"minor":age1<60?"adult":"Senior";
		System.out.println(msg1);
		
	}

}
