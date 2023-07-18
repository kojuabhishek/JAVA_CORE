package j2se.durshikshya.loops;
import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		int n1 = 4,n2 =5,pro=1;
		System.out.println("Enter n1^n2:");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		n2 = sc.nextInt();
		
		
		for(int i=0;i<n2;i++) {
			pro = pro*n1;
			
		}
		System.out.println(n1 +" to the power of "+n2 +" is: ");
		System.out.println(pro);
		
	}

}
