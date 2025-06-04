package demos;

import java.util.List;

public class dump {
	public void reversal(String word1){
		char[] word2=word1.toCharArray();
		String reversed="";
		for(int i=word1.length()-1;i>=0;i--){
		reversed=reversed+word2[i];		
		}
		System.out.println(reversed);
    }
	
	public boolean prime(int num) {
		if(num<1) {
		 return false;
		}
		if(num==2) {
		 return true;
		}
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
			 return false;
			}		
		}
		return false;
	}
	
	public void fibnocci(int count) {
		int a=0;
		int b=1;
		int c=1;
		for(int i=0;i<count;i++) {
			System.out.print(a+",");
			a=b;
			b=c;
			c=a+b;
		}			
	}
	
	public boolean listOdd(List<Integer> a) {
		for(int i=0;i<a.size()-1;i++) {
			if(a.get(i)%2==0) {
				return false;
			}
		}return true;
	}
	
	public static void main( String[] Args) {
		dump obj=new dump();
		obj.reversal("hello");
	}
}
