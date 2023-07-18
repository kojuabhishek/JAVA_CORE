package j2se.durshikshya.loops;
import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		
		System.out.println("Enter a binary number : ");
		Scanner sc = new Scanner(System.in);
		int bin = sc.nextInt();
		int dec=0 , pv=1,rem;
		while(bin>0) {
			rem = bin%10;
			dec+=rem*pv;
			pv*=2;
			bin/=10;
		}
		
		System.out.println("the result is : "+dec);
		
		
		
		
		
	}
}
