package demos;

import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Math math = new Math();
	   math.factorial();
       Scanner obj= new Scanner(System.in);
       System.out.println("length:");
       int l = obj.nextInt();       
       System.out.println("breadth:");
       int b = obj.nextInt();  
     
      System.out.println("Area is "+math.area(l, b));
	}

	public int area(int l, int b) {
		return b*l;}
	
	public void factorial() {
		int num= 6;
		int fact1=1;
		int fact2=1;
		for(int i=1;i<=num ;i++) {
			fact1=fact1*i;
			
		}
		System.out.println(fact1);
		int j=1;
		while(j<=num) {
			fact2=fact2*j;
			j++;
		}
		System.out.println("fact2"+fact2);
		
	}
}
