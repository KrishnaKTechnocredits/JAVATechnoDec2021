package amruta.Assignment_26;
/*  Assignment 26 : 20th Jan'2022

WAP to find out the value of id form the given input url.
String url = "https://automationbykrishna.com/name=techno/id=123";
Hint : use split()     */

class FindValuefromString{

	//1st Logic
	void findvalueofID(String str){
		
		String[] output = str.split("id=");
		
		for (int index = 0; index < output.length; index++) {
			
			String string1 = output[index];
			
			char ch = string1.charAt(index);
			
			if (Character.isDigit(ch))
				System.out.println("\nValue of Id in given String is : "+string1);
		}
	}
	
	//2nd Logic
	String returnValueOfId(String str) {
		
		String[] arr = str.split("/");
		String temp = "";
		
		for(int index = 0; index < arr.length;index++) {
			
			if(arr[index].contains("id="))	
				temp = arr[index].substring(3);
		}
		return temp;
	}
		
	public static void main(String[] args){
		
		String url = "https://automationbykrishna.com/name=techno/id=123";
		
		FindValuefromString fingvalueofid = new FindValuefromString();
		
		fingvalueofid.findvalueofID(url);	
		
		String id = fingvalueofid.returnValueOfId(url);
		
		System.out.println("\nValue of Id in given String is : "+id);
	}
}