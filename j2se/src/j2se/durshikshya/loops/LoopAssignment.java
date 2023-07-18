package j2se.durshikshya.loops;
import java.util.Scanner;

public class LoopAssignment {
	public static void main(String[] args) {
		int n,sum=0,pro =1;
		System.out.println("Enter a natural number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("The sum of "+n+"natural number is : ");
		
		for(int i= 1;i<=n;i++) {
			sum= sum+i;
			
			
		}
		System.out.println(sum);
		System.out.println("The product of "+n+"natural number is : ");
		for(int i= 1;i<=n;i++) {
			pro= pro*i;
			
			
		}
		System.out.println(pro);
	}

}
