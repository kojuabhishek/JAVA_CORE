package j2se.durshikshya.loops;

import java.util.Scanner;

public class DigitCounter {
	public static void main(String[] args) {
		int n, sum =0,temp;
		System.out.println("Enter a  number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		
		
		while(n!=0) {
			temp = n/10;
			n = temp;
			sum = sum+1;
			
		}
		System.out.println("The number of digits : ");
		System.out.println(sum);
		
}

}
