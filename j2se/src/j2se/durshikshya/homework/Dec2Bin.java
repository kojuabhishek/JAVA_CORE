package j2se.durshikshya.homework;
import java.util.Scanner;

public class Dec2Bin {
	public static void main(String[] args) {
		int dec,bin = 0,rem =0,place = 1;
		System.out.println("Enter a decimal number: ");
		Scanner sc = new Scanner(System.in);
		dec = sc.nextInt();
		int temp = dec;
		while(temp!=0)
		{
			rem = temp%2;
			temp = temp/2;
			bin = bin+(rem*place);
			place = place *10;
			
		}
		System.out.println("The decimal to binary of "+dec+" is : "+bin);
		
		
		
		
	}
}
