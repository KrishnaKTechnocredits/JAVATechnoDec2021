package technocredits;

public class FindCharFromStringExample {

	void findFirstIndexOfChar1(String name) {
		int lastCharIndex = 0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == 'c') {
				lastCharIndex = index;
			}
		}
		System.out.println("Out of loop" + lastCharIndex);
	}
	
	void findFirstIndexOfChar(String name) {
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == 'c') {
				System.out.println(index);
				break;
			}
		}
		System.out.println("Out of loop");
	}
	
	void findFirstIndexOfChar2(String name) {
		boolean flag = false;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == 'c') {
				System.out.println(   index);
				flag = true;
				break;
			}
		}
		if(flag == false)
			System.out.println("Char c is not present in given name "+ name);
	}
	
	void findFirstIndexOfChar3(String name) {
		int status = 0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == 'c') {
				System.out.println(index);
				status = 1;
				break;
			}
		}
		if(status == 0)
			System.out.println("Char c is not present in given name "+ name);
	}
	
	void findFirstIndexOfChar4(String name, char ch) {
		int indexOfChar = -1;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == ch) {
				indexOfChar = index;
				break;
			}
		}
		if(indexOfChar == -1)
			System.out.println("Char "+ch+" is not present in given name "+ name);
		else
			System.out.println("Index of "+ch+" is - " + indexOfChar);
	}
	
	public static void main(String[] args) {
		FindCharFromStringExample findCharFromStringExample = new FindCharFromStringExample();
		findCharFromStringExample.findFirstIndexOfChar("technocredits");
	}
}
