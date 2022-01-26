package debasmita;

import java.util.Arrays;

public class A24_StringArrayPrograms {
	void totalWordsInString(String input) {
		 String[] arr=input.split(" ");
		 System.out.println("Total words in the given String :" +arr.length);
		 for(int index=0;index<arr.length;index++) {
			 int lengthofword=arr[index].length();
			 System.out.println("Word length of: "+arr[index]+" is :"+lengthofword);
		 }
	}
    void totalVowelsInString(String input) {
    	 String[] a=input.split(" ");
    	 for(int index=0;index<a.length;index++) {
    		String word=a[index];
    		int countvowel=0;
    		for(int i=0;i<word.length();i++) {
    			char ch= word.charAt(i);
    			if(ch == 'a' || ch == 'A'|| ch ==  'e'|| ch == 'E'|| ch == 'i'|| ch == 'I'|| ch == 'o'|| ch == 'O'||ch == 'u'|| ch == 'U') {
    				countvowel++;
    			}
    		}
    		System.out.println("No of vowels in "+a[index]  +" are: "+countvowel);
    	 }
    }
    String[] arrayOfWordsContainingOnlyDigits(String input){
    	String[] arr=input.split(" ");
    	for(int index=0;index<arr.length;index++) {
    		int length=arr[index].length();
    		String word=arr[index];
    		String temp="";
    		for(int j=0;j<word.length();j++) {
    			char ch=word.charAt(j);
    			if(Character.isDigit(ch)) {
    				temp=temp+ch;
    			}
    			arr[index]=temp;
    		}
    	}
    	return arr;
    }
    String[] reverseEachWord(String input){
    	String[] arr=input.split(" ");
    	for(int index=0;index<arr.length;index++) {
    		int length=arr[index].length();
    		String word=arr[index];
    		String temp="";
    		for(int j=length-1;j>=0;j--) {
    			char ch=word.charAt(j);
    			temp=temp+ch;
    		}
    		arr[index]=temp;
    	}
    	    return arr;
    }
    String[] convertFirstCharacterOfWordWithCapitalLetter(String input) {
    	String[] arr=input.split(" ");
    	for(int index=0;index<arr.length;index++) {
    		int length=arr[index].length();
    		String word=arr[index];
    		String temp="";
    		temp=temp+Character.toUpperCase(word.charAt(0));
    		for(int j=1;j<length;j++) {
    			temp=temp+word.charAt(j);
    		}
    		arr[index]=temp;
    	}
    	    return arr;
    }
    String[] reverseEachWordAndConvertFirstLetterOfEachWordIntoCapital(String input) {
    	String[] arr=input.split(" ");
    	for(int index=0;index<arr.length;index++) {
    		int length=arr[index].length();
    		String word=arr[index];
    		String temp="";
    		temp=temp+Character.toUpperCase(word.charAt(0));
    		for(int j=length-2;j>=0;j--) {
    			temp=temp+word.charAt(j);
    		}
    		arr[index]=temp;
    	}
    	   return arr;
    }
    void reverseTheCaseOfEachCharInAGivenWord(String input){
    	String temp="";
    	for(int index=0;index<input.length();index++) {
    		char ch=input.charAt(index);
    		if(Character.isLetter(ch)) {
    			if(Character.isUpperCase(ch))
    				temp=temp+Character.toLowerCase(ch);
    			else
    				temp=temp+Character.toUpperCase(ch);
    		}
    	}
    	        System.out.println("After reversing the case of each letter,the result: "+temp);
    }
	public static void main(String[] args) {
		A24_StringArrayPrograms stringarrayprograms=new A24_StringArrayPrograms();
		stringarrayprograms.totalWordsInString("Hello Hi");
		stringarrayprograms.totalVowelsInString("aashvi technocredits");
		String[] s=stringarrayprograms.arrayOfWordsContainingOnlyDigits("Te1c2h C94re3");
		System.out.println(Arrays.toString(s));
		String[] a=stringarrayprograms.reverseEachWord("Hi techno hello");
		System.out.println(Arrays.toString(a));
		String[] b=stringarrayprograms.convertFirstCharacterOfWordWithCapitalLetter("anvit harsh dipali");
		System.out.println(Arrays.toString(b));
		String[] c=stringarrayprograms.reverseEachWordAndConvertFirstLetterOfEachWordIntoCapital("Vrushali Sagar Shital");
		System.out.println(Arrays.toString(c));
		stringarrayprograms.reverseTheCaseOfEachCharInAGivenWord("TeCHnoC");
	}
}
