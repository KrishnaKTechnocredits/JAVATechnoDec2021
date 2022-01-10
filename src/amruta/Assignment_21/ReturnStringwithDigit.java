package amruta.Assignment_21;
/* 		Assignment 21 - Create a method which will Return the string with all the digits from the given string 
Input : "Tec1hn2o3C9r6e8d1i9ts"
Output : 12396819  	 */


class ReturnStringwithDigit{
	
	void printStringwithDigit(String str){
		String output = "";
			for(int index = 0; index < str.length(); index++){
				char ch = str.charAt(index);
				
				if(Character.isDigit(ch)){
					output = output + ch;
				}				
			}
			System.out.println("\n String with all the digits from the given string : " +output);
	}
	
	public static void main(String[] args){
		
		new ReturnStringwithDigit().printStringwithDigit("Tec1hn2o3C9r6e8d1i9ts");
	}
}