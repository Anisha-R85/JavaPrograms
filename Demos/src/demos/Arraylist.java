package demos;

import java.util.ArrayList;
import java.util.HashMap;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Arraylist obj = new Arraylist();
    obj.hashMap();
  	}
	public void arrayList() {
		ArrayList <String> Fruits = new ArrayList<String>();
	    Fruits.add("Apple");
	    Fruits.add(1, "Mango");
	    Fruits.add("Orange");
	    
	    for(String fruit:Fruits) {
	    	System.out.println(fruit);
	    }
	}
	public void hashMap() {
		HashMap <String, String> keyValues = new HashMap<>();
		keyValues.put("shape", "square");
		keyValues.put("color", "orange");
		keyValues.put("value", "good");
		for(String key:keyValues.values()) {
			System.out.println(" :"+key);
		}
		for(String keyvalue:keyValues.keySet()) {
			System.out.println(keyvalue);
		}
	}
}
