package j2se.durshikshya.loops;
import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		int i;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Do while Loop");
			System.out.println("Enter a value less than 5: ");
			i = sc.nextInt();
			
		
	}while(i<5);

}
}


/* syntax
	init;
do {
		statement block;
}

while(increment);
*/