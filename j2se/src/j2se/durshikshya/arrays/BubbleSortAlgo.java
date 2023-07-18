package j2se.durshikshya.arrays;

public class BubbleSortAlgo {
	public static void main(String[] args) {
		int x[]= {5,4,3,2,1};
		int i,j,k;
		for(i=0;i<4;i++) {
			for(j=0;j<x.length-1-i; j++) {
				if(x[j]>x[j+1]) {
					//swap
					x[j]+=x[j+1];
					x[j+1]=x[j]-x[j+1];
					x[j] -= x[j+1];
					
					}
				}
			
		}
		for(k=0;k<5;k++) {
			System.out.print(x[k]+" ");
		}
		
		
		
	}

}
