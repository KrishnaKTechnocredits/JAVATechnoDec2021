package amruta.Assignment_24;
/* Program 3 - WAP to return array of words containing only digits.
Input    : "Te1c2h C94re3"
Output : "12" "943"   */

import java.util.Arrays;

class ReturnArrayOfWords{

	String findDigit(String str){
		String temp = "";
		
		for(int index = 0; index < str.length();index++){
			char ch = str.charAt(index);
			
			if(Character.isDigit(str.charAt(index)))
				temp = temp + ch;
		}
		return temp;	
	}
	
	String[] arrayOfDigit(String str){
		
		String[] arr = str.split(" ");
		int count = 0;
		
		for(int index = 0; index < arr.length; index++){
			
			arr[count] = findDigit(arr[index]);
			count++;
		}
		
		return arr;
	}

	
	public static void main(String[] args){
		
		String str = "Te1c2h C94re3";
		
		String[] output = new ReturnArrayOfWords().arrayOfDigit(str);
		
		System.out.println("Array of Digits : "+Arrays.toString(output));
	}

}