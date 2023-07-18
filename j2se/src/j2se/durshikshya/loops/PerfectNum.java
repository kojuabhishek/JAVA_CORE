package j2se.durshikshya.loops;
import java.util.Scanner;

public class PerfectNum {
	public static void main(String[] args) {
		int sum =0,i;
		System.out.println("Enter a anumber: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(i = 1;i<num;i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		if(num==sum) {
			System.out.println(num+" is Perfect number");
		}
		else {
			System.out.println(num+" is Not perfect number");
		}
		}

}
