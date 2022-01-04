/*	Assignment - 11 : 24rd Dec'2021 
Write a program with following methods. 
1. create a method to return first occurrence of given character from given string.
2. create a method to return last occurrence of given character from given string.
3. create a method to return true if given character is found from given string else return false.
4. create a method to return total occurrence of given character from given string.  

*/

package amruta.Assignment_10to14;
class CharOperations{
	
	// 1. create a method to return first occurrence of given character from given string.
	
	int findFirstOccurrenceOfChar(String name, char ch){
		int index = 0;
		for( ; index < name.length(); index++){
			if(name.charAt(index) == ch)
			break;
		}
		return index;
	}
	
	// 2. create a method to return last occurrence of given character from given string.
	
	int lastFirstOccurrenceOfChar(String name, char ch){
		int index = name.length()-1;
		for( ; index >= 0; index--){
			if(name.charAt(index) == ch)
			break;
		}
		return index;
	}
	
	// 3. create a method to return true if given character is found from given string else return false.
	
	boolean charFoundOrNot(String name, char ch){
		boolean status = false;
		for(int index = 0; index < name.length(); index++){
			if(name.charAt(index) == ch)
				status = true;
		}
		return status;
	}
	
	// 4. create a method to return total occurrence of given character from given string.
	
	int totalOccurrenceOfChar(String name, char ch){
		int count = 0;
		for( int index = 0; index < name.length(); index++){
			if(name.charAt(index) == ch)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args){
		CharOperations charoperations = new CharOperations();
		int charFirstPosition = charoperations.findFirstOccurrenceOfChar("technocredits",'e');
		System.out.println("First occurence of character e is "+charFirstPosition);
		
		int charLastPosition = charoperations.lastFirstOccurrenceOfChar("technocredits",'e');
		System.out.println("Last occurence of character e is "+charLastPosition);
		
		boolean status = charoperations.charFoundOrNot("Amruta",'r');
		System.out.println("Is given character found : "+status);
		
		int count = charoperations.totalOccurrenceOfChar("technocredits",'c');
		System.out.println("Total occurences of character c is "+count);
	}
}