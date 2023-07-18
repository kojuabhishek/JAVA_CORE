package j2se.durshikshya.conditionals;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		System.out.println("-----MENU-----");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccino");
		System.out.println("c. Cappuccino");
		System.out.println("Make a choice: ");
		
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0); //take input and choose first character as valid input
		String treat = switch(ch) {
		case 'a','d': // 2ta case ek thau check grna milxa in java version morethan 13
			
			System.out.println("Americano is served!");
			yield  "Choco chips cookie";
			//break;
		case 'b':
			System.out.println("Mochaccino is served!");
			yield "Whole grain cookie";
			//break;
		case 'c':
			System.out.println("Cappucino is served!");
			yield "Little hearts";
			//break;
		default:
			System.out.println("Invalid Choice!");
			yield "Nothing....";
		};
		System.out.println(treat);
		
	}

}
