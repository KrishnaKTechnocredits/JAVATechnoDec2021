package yogeshNimbalkar;
//Assignment - 11 : 24 Dec 2021 

public class A11_ReturnTypeExample {

	int getFirstOccuranceOfChar(String str, char ch) {
		int charindex = -1;
		for(int index=0; index<str.length(); index++)
			if(str.charAt(index)==ch) {
				charindex = index;
				break;				
			}
		return charindex;
	}
	
	int getLastOccuranceOfChar(String str, char ch) {
		int charindex = -1;
		for(int index=0; index<str.length(); index++)
			if(str.charAt(index)==ch)
				charindex = index;
		return charindex;
	}
	
	boolean isCharPresentInString(String str, char ch) {
		boolean flag = false;
		for(int index=0; index<str.length(); index++)
			if(str.charAt(index)==ch) {
				flag = true;
				return flag;
			}
		return flag;
	}
	
	int getTotalOccuranceOfChar(String str, char ch) {
		int charcount = 0;
		for(int index=0; index<str.length(); index++)
			if(str.charAt(index)==ch)
				charcount++;
		return charcount;
	}
	
	public static void main(String[] args) {
		int count;
		boolean charPresent;
		A11_ReturnTypeExample returntypeexample = new A11_ReturnTypeExample();
		count = returntypeexample.getFirstOccuranceOfChar("technocredits",'c');
		System.out.println("First occurance of character at : " + count);
		count = returntypeexample.getLastOccuranceOfChar("technocredits", 'c');
		System.out.println("Last occurance of character at : " + count);
		charPresent = returntypeexample.isCharPresentInString("technocredits", 'n');
		System.out.println("Is character present in string : " + charPresent);
		count = returntypeexample.getTotalOccuranceOfChar("technocredits",'c');
		System.out.println("Total occurance of char in given string : " + count);
	}
}
