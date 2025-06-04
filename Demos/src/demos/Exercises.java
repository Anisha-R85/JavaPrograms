package demos;

import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exercises obj = new Exercises();
		obj.minMax();
	}
	
	
	public void arraySum() {
		int[] nums = {45, 67, 98, 345, 768};
		int sum = 0;
		for (int i : nums) {
			System.out.println(":"+i);	
			sum= sum+ i;
		}		
		System.out.println(sum);
	}
	
	
	public void reverseString() {
	String input = "anisha";
	char[] revString= input.toCharArray();
	
	   for(int i= input.length()-1; i>=0; i--) {
		System.out.print(revString[i]);
	   }
	}
	
	public void minMax() {
		int[] nums= {34, 56, 87, 23, 11, 35, 87};
		int max;
		int min=  max =nums[0];
	//	int max= nums[0];
		for(int i:nums) {
			if(i<min){
				 min= i;
			}
		}System.out.println(min+" "+max);
		for(int num:nums) {
			if(num>max){
				 max= num;
			}
		}
		System.out.println(min+" "+max);
	}

}
