package j2se.durshikshya.homework;
import java.util.Scanner;

public class FibonacciSeries {
		public static void main(String[] args) {
			int num,i,j,n1=0,n2=1,n3,temp,n11,n22;
			char opt;
			System.out.println("Enter the value of n:");
			Scanner sc1 = new Scanner(System.in);
			num = sc1.nextInt();
			System.out.println("Choose the option : ");
			System.out.println("1. print fibonacci upto nth term : ");
			System.out.println("2. print fibonacci for 1 to nth term : ");
			Scanner sc = new Scanner(System.in);
			opt = sc.next().charAt(0);
			switch(opt) {
			case '1':
				for( i = 0;i<num; i++) {
					if(i==0) {
						System.out.print(n1 +"\t");
					}
					else if (i==1) {
						System.out.print(n2 +"\t");
					}
					else {
						n3 = n1+n2;
						System.out.print(n3+"\t");
						temp = n2;
						n1 = temp;
						n2 = n3;
					}
					
				}
				break;
			case '2':
				n11 = n1;
				n22 = n2;
				for(i =0;i<num;i++) {
					for(j=0;j<=i;j++)
					{
						if(j==0) {
							System.out.print(n1 +"\t");
						}
						else if (j==1) {
							System.out.print(n2 +"\t");
						}
						else {
							n3 = n1+n2;
							System.out.print(n3+"\t");
							temp = n2;
							n1 = temp;
							n2 = n3;
						}
					}
					n1 = n11;
					n2 = n22;
					System.out.println("\n");
				}
				break;
			default:
				System.out.println("Only enter 1 or 2");
			
			}
		}

}
