package j2se.durshikshya.arrays;
import java.util.Scanner;

public class CustomMatrixMultiplication {
	public static void main(String[] args) {
		
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of first matrix:");
		int r1 = sc.nextInt();
		int c1= sc.nextInt();
		
		System.out.println("Enter the order of second matrix");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		
		if(c1!=r2) {
			System.out.println("The matrices cannot be multiplied");
		}
			else {
				int x[][] = new int[r1][c1];
				int y[][] = new int[r2][c2];
				int p[][] = new int[r1][c2];
				
				System.out.println("Enter the elements in first matrix");
				for( i =0;i<r1;i++) {
					for( j=0;j<c1;j++) {
						x[i][j] = sc.nextInt();
					
				}
					System.out.println();
				
			}
				
				System.out.println("Enter the elements in second matrix");
			
				for( i =0;i<r2;i++) {
					for(j=0;j<c2;j++) {
						y[i][j] = sc.nextInt();
					
				}
					System.out.println();
				
			}
				System.out.println("The output of the Multiplication is : ");
				for(i =0;i<r1;i++) {
					for(j=0;j<c2;j++) {
						p[i][j] = 0;
						for(k=0;k<c1;k++) {
							p[i][j] += x[i][k]*y[k][j];
						}
					
				}
					System.out.println();
				
			}
				for(i=0;i<r1;i++) {
					for(j=0;j<c1;j++) {
						System.out.print(x[i][j]+"\t");
					}
					System.out.println();
				}
				System.out.println("\t*");
				for(i=0;i<r2;i++) {
					for(j=0;j<c2;j++) {
						System.out.print(y[i][j]+"\t");
					}
					System.out.println();
				}
				System.out.println("\t=");
				for(i=0;i<r1;i++) {
					for(j=0;j<c2;j++) {
						System.out.print(p[i][j]+"\t");
					}
					System.out.println();
				}
			}
		
		
	}

}
