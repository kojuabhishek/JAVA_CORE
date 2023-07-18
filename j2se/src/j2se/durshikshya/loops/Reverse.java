package j2se.durshikshya.loops;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		int n, sum =0,temp,n1,rev = 0;
		System.out.println("Enter a  number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		n1 =n;
		
		
		while(n>0) {
			temp = n%10;
			rev = rev*10+temp;
			n=n/10;
			
			
		}
		System.out.println("The reverse of  entered digits : ");
		System.out.println(rev);
		
		if(n1==rev){
			System.out.println("Entered number is Palindrome number");
			
		}
		else {
			System.out.println("Entered number is Not palindrome");
		}
		
		for(int j =1;j<n1;j++)
		{
			if(n1%j==0)
				sum++;
		}
		if(sum>1)
		{
			System.out.println("Entered number is Composite Number");
		}
		else {
			System.out.println("Enter number is Prime Number");
		}
}

}
