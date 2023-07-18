package j2se.durshikshya.operators;


public class Operators {
	public static void main(String[] args) {
		int res,a,b;
		a=7;
		b=5;
		res = a+b;
		System.out.println(a+"+"+b+" = "+res);
		res = a-b;
		System.out.println(a+"-"+b+" = "+res);
		res = a*b;
		System.out.println(a+"*"+b+" = "+res);
		res = a/b;
		System.out.println(a+"/"+b+" = "+res);
		res = a%b;
		System.out.println(a+"%"+b+" = "+res);
		
		res = res+10;
		res+=10;
		System.out.println("result incremented twice by 10 = "+res);
		
		/*
		 * Combination Operators
		 
		 +=
		 -=
		 /=
		 *=
		 %/
		  
		 */
		
		/*unary increment decrement operators
		
		++
		--
		
		*/
		System.out.println("unary operators : ");
		a=4;
		a = a+1;
		a+=1;
		a++;
		++a;
		System.out.println("a = "+a);
		b = a++;  //post increment
		System.out.println("a = "+a+" , b = "+b);
		b = ++a;  //pre increment
		System.out.println("a = "+a+" , b = "+b);
		
		System.out.println("Conditional operators");
		System.out.println(a==b);
		
		System.out.println("Logical Operators");
		
		int age = 15;
		System.out.println(age>=18 && age<=35 );
		System.out.println(age<=16 || age >=60 );
		
		
		
		
		
		 
		
	}

}


/*
  	
  	logical operators:
  	AND  &&
  	OR   ||
  	NOT  !
  	
  	
  	A	 B		A||B		A&&B
  	0	 0		0			0
  	0	 1		1			0
 	1	 0		1			0
 	1	 1		1			1
 	
 	A 	!A
 *  0	1
 *  1   0
 *
 *
 */
 