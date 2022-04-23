package vaibhav.Practice.Collection;

import java.util.HashMap;

public class Map_1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> studentMap = new HashMap<Integer,String>();
		
		studentMap.put(1, "Neha");
		studentMap.put(2, "Madhavi");
		studentMap.put(3, "Vaibhav");
		studentMap.put(2, "Simmi");
		String temp = studentMap.put(4, "Simmi");
		
		System.out.println(studentMap);
		System.out.println(temp + temp.length());
		
		
	}

}
