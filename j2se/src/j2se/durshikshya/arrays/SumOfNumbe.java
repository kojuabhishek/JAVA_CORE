package j2se.durshikshya.arrays;

public class SumOfNumbe {
	public static void main(String[] args) {
		float sum =0;
		int arr[] = {10,11,12,13,14,15};
		for(int i=0;i<6;i++) {
			 sum = sum+arr[i];
		}
		System.out.println(sum);
		double mean = sum/6;
		System.out.println(mean);
		
	}

}
