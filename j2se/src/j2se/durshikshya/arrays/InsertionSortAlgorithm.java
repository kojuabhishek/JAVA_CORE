package j2se.durshikshya.arrays;

public class InsertionSortAlgorithm {
	public static void main(String[] args) {
		int x[] = {8,7,9,4,5};
		int i,j,min;
		for(i=0; i<4;i++) {
			min= i;
			for(j=i+1;j<5;j++) {
				if(x[min]>x[j]) {
					min = j;
				}
			}
			if(min!=i) {
				x[min]+=x[i];
				x[i]=x[min]-x[i];
				x[min]-=x[i];
			}
			for(j=0;j<5;j++) {
				System.out.print(x[j]+" ");
			}
			System.out.println();
		}
		for(j=0;j<5;j++) {
			System.out.print(x[j]+" ");
		}
	}
}
