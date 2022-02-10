package shital;

import java.util.ArrayList;

public class Test6 {

	void getFirstNonRepeatCapitalChar(String name) {
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
				if(Character.isUpperCase(ch)) {
					if(name.indexOf(ch)==name.lastIndexOf(ch)) {
						System.out.println("First NonRepeating Char from given String is: "+ch);
					}
				}
		}
	
	}
	
	void maxlengthOfWord(String arr) {
		System.out.println("\nInput is :"+arr);
		int wordLength=0;
		String input="";
		String[] name=arr.split(" " );
		for(int index=1;index<name.length;index++) {
			input=name[index];
			int maxLength=name[1].length();
			wordLength=name[index].length();	
			if(wordLength>maxLength) {
				maxLength=wordLength;	
				System.out.println("Max length word is :" + name[index] + " -- " + wordLength);
			}
		}	
	}
	
	void sum(int[] num) {
		int ans=0;
		for(int index=0;index<num.length;index++) {
			int add=num[index];
			 ans=add+ans; 
		}
		System.out.println("Sum is :"+ans);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 test6 = new Test6();
		String name="tEChNoCrEdits";
		test6.getFirstNonRepeatCapitalChar(name);
		
		String arr="good morning technocredits hi hello";
				test6.maxlengthOfWord(arr);
				
		int[] numList = {10,10,20,30};
		ArrayList<Integer> input = new ArrayList<>();
			for (int num1: numList) {
				input.add(num1);
			}
		System.out.println("\nInput is : "+input);
		test6.sum(numList);
	}

}
