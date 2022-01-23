package technocredits.stringdemo;

import java.util.Arrays;

public class Example2 {

	private String filterUpperCase(String str) {
		String output = "";
		
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch))
				output += ch;
		}
		return output;
	}
	
	String[] processStringArr(String[] arr) {
		String[] output = new String[arr.length];
		for(int index=0;index<arr.length;index++) {
			output[index] = filterUpperCase(arr[index]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] arr = {"AnJAli", "sAWatI", "ARchnA", "ABHisheK"};
		//"AJA", "AWI", "ARA", "ABHK" 
		String[] output = new Example2().processStringArr(arr);
		System.out.println(Arrays.toString(output)); 
	}
}
