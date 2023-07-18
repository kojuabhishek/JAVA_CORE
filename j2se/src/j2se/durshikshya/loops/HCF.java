package j2se.durshikshya.loops;

public class HCF {
	public static void main(String[] args) {
		int x=100,y=50,hcf=1;
		while(x%y!=0) {
			x = x%y;
			//swap
			x+=y;
			y = x-y;
			x-=y;
		}
		System.out.println("hCf : "+y );
	}

}
