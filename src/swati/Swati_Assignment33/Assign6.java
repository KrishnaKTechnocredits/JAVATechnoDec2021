package swati.Swati_Assignment33;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Assign6 {
	LinkedHashMap<String, Integer> findFreq(String [] arr){
		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		for(int i=0;i<arr.length;i++) {
			String name=arr[i];
			if(map.containsKey(name)) {
				int value=map.get(name);
				map.put(name, value+1);
			}
			else {
				map.put(name, 1);
			}
		}
		System.out.println(map);
		return map;
	}
	

	public static void main(String[] args) {
		String[] arr={"raj", "aarya", "aavruti", "shruti","raj", "aarya"};
		Assign6 a6=new Assign6();
		a6.findFreq(arr);
		

	}

}
