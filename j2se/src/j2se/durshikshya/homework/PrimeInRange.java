package j2se.durshikshya.homework;
import java.util.Scanner;

public class PrimeInRange {
	public static void main(String[] args) {
		int i,j,range ,sum=0;
		System.out.println("Enter a range: ");
		Scanner sc = new Scanner(System.in);
		range = sc.nextInt();
		System.out.println("The prime numbers in this range are:");
		for(i=1;i<range;i++) {
			for(j=1;j<i;j++) {
				if(i%j==0) {
					sum++;
				}
			}
			if(sum<=1 && i!=1) {
				System.out.print(i+" ");
			}
			sum =0;
			
		}
		
		
	}

}
