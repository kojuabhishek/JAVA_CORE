package j2se.durshikshya.functions;

public class Recursive {
	public static void main(String[] args) {
		int n = 10;
		int num = 1234;
		int res = sum(n);
		int res1 = sumofDigits(num);
		System.out.println("Result : "+res);
		System.out.println("Reslut : "+res1);
	}

	private static int sumofDigits(int num) {
		// TODO Auto-generated method stub
		if(num==0) {
			return 0;
		}
		return num%10+sumofDigits(num/10);
	}

	private static int sum(int n) {
		if(n==0) {
			return 0;
		}
		
		return n+sum(n-1);
		
	}
	

}
