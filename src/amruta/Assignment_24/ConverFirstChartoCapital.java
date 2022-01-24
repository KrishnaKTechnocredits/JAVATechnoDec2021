/* Program 5 - WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"
*/

package amruta.Assignment_24;

class ConverFirstChartoCapital{

	String printStringWithFirstCharCapital(String str){
		String temp = "";
		char ch = str.charAt(0);
		ch = Character.toUpperCase(ch);
		temp = temp + ch + str.substring(1);
		
		return temp;
	}
	
	void takeString(String str){
		
		String[] arr = str.split(" ");
		String updatedstr = "";
		
		for(int index = 0; index < arr.length; index++){
			updatedstr = updatedstr + " " + printStringWithFirstCharCapital(arr[index]); 			
		}
		System.out.println("\nUpdated String by converting first letter in Capital : "+updatedstr);
	}
	
	public static void main(String[] args){
		String str = "anvit harsh dipali"; 
		new ConverFirstChartoCapital().takeString(str);
	}
}

