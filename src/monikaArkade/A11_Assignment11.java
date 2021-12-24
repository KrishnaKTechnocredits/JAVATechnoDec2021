package monikaArkade;

public class A11_Assignment11 {

	int getFirstOccuranceOfSring(String name,char ch) {
		int charIndex= -1;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)==ch) {
				charIndex=index;
				System.out.println("First Occurance of "+ch+" is at "+charIndex+" index");
				break;
			}
		}
		return charIndex;
	}
	
	int getLastOccuranceOfString(String name,char ch) {
		int charIndex = 0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)==ch) {
				charIndex=index;
			}
		}
		System.out.println("Last Occurance of "+ch+" is at "+charIndex+" index");
		return charIndex;
	}
	
	boolean charIsFoundOrNot(String input, char ch) {
		boolean flag = true;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				System.out.println(true);
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(false);
		}
		return false;
	}
	
	int getTotalOccuranceOfChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
	
	public static void main(String[] args) {
		A11_Assignment11 a11_Assignment11=new A11_Assignment11();
		a11_Assignment11.getFirstOccuranceOfSring("technocredits", 'd');
		a11_Assignment11.getLastOccuranceOfString("technocredits", 'e');
		a11_Assignment11.charIsFoundOrNot("technocredits", 'k');
		a11_Assignment11.getTotalOccuranceOfChar("technocredits", 'c');
		
	}

}
