package j2se.durshikshya.loops;

import java.util.Scanner;

public class PerfectRange {
	public static void main(String[] args) {
		int sum =0,i;
		System.out.println("Enter a range: ");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		for(int num = 1; num<=range;num++) {
			int pv=0;
			for(i=1;i<num;i++) {
				if(num%i==0) {
					pv+=i;
					
				}
			}
			if(pv==num) {
				System.out.println(num);
			}
		}
		}

}
