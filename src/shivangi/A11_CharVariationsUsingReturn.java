/*Assignment - 11 : 24rd Dec'2021

Write a program with following methods.

1. create a method to return first occurrence of given character from given string.
2. create a method to return last occurrence of given character from given string.
3. create a method to return true if given character is found from given string else return false.
4. create a method to return total occurrence of given character from given string. */

package shivangi;

public class A11_CharVariationsUsingReturn {
	
	int get1stOcuurenceOfChar(String input, char ch) {
		int charIndex = -1;
		for(int index=0; index<input.length(); index++) {
			if(ch == input.charAt(index)) {
				charIndex = index;
				System.out.println("Requested char '"+ch+"' exsit in index : "+charIndex+"");
				return charIndex;
			}
		}
		return charIndex;
	}
	
	int getLastOcuurenceOfChar(String input, char ch) {
		int charIndex = -1;
		for(int index=0; index<input.length(); index++) {
			if(ch == input.charAt(index)) {
				charIndex = index;
			}
		}
		System.out.println("Last occurence char '"+ch+"' exsit in index : "+charIndex+"");
		return charIndex;
	}
	
	boolean isCharPresent(String input, char ch) {
		boolean flag = false;
		for(int index=0; index<input.length(); index++) {
			if(ch == input.charAt(index)) {
				flag = true;
			}
		}
		return flag;
	}
	
	int getTotalCountOfChar(String input, char ch) {
		int count = 0;
		for(int index=0; index<input.length(); index++) {
			if(ch == input.charAt(index)) {
				count++;
			}
		}
		System.out.println(ch + " exists " + count + " time in given string");
		return count;
	}
	
	public static void main(String[] args) {
		A11_CharVariationsUsingReturn charOccurenceIndex = new A11_CharVariationsUsingReturn();
		int FisrtOccIndex = charOccurenceIndex.get1stOcuurenceOfChar("technocredits", 't');
		if(FisrtOccIndex == -1) {
			System.out.println("Character 'b' does not exist in the 'technocredits' string");
		}
		
		int lastOccIndex = charOccurenceIndex.getLastOcuurenceOfChar("technocredits", 't');
		if(lastOccIndex == -1) {
			System.out.println("Invalid char requested");
		}
		
		boolean checkPresense = charOccurenceIndex.isCharPresent("technocredits", 'i');
		System.out.println(checkPresense);
		
		int cnt = charOccurenceIndex.getTotalCountOfChar("technocredits", 'e');
		if(cnt==0) {
			System.out.print("character is not present");
		}
	}
	
}
