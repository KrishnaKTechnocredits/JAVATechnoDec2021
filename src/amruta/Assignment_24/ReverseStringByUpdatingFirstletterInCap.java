/*  Program 6 - WAP to reverse each word and convert first letter of each word into capital
Input    : "Vrushali Sagar Shital"
Output : "IlahsurV Ragas LatihS"	*/

package amruta.Assignment_24;

class ReverseStringByUpdatingFirstletterInCap{
	
	String printStringWithFirstCharCapital(String str){
		String temp = "";
		
		char ch = str.charAt(0);
		ch = Character.toUpperCase(ch);
		temp = temp + ch + str.substring(1);
		
		return temp;
	}

	String reverseString(String str){
		String temp = "";
		String str1 = ""; 
		for(int index = str.length()-1; index >= 0; index--){
			temp = temp + str.charAt(index);
			str1 = printStringWithFirstCharCapital(temp);
		}
		return str1;
	}
	
	void takeString(String str){
		
		String[] arr = str.split(" ");
		String newStr = "";
		
		for(int index = 0; index < arr.length; index++){
			newStr = newStr + " " + reverseString(arr[index]); 		
		}
		System.out.println("\nReverse String : "+newStr);
	}
	
	public static void main(String[] args){
		String str = "Vrushali Sagar Shital"; 
		new ReverseStringByUpdatingFirstletterInCap().takeString(str);
	}
}