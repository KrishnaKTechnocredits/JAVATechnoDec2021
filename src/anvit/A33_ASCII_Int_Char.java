package anvit;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class A33_ASCII_Int_Char {
	
	 int getAsciiOfChar(char ch) {
		int x = ch;
		 return x; 
	 }
	 
	 char getCharOfAscii(int asciiValue) {
		 char ch =(char)asciiValue;
		 return ch;
	 }
	 
	 void asciiOfChar(char start, char end) {
		 for(int i =start ; i<=end;i++) {
			 System.out.print(i+" ");
		 }
	 }
	 
	 void charToAscii(int start, int end) {
		 for(int i = start; i<=end;i++) {
			 char ch = (char)i;
			 System.out.print(ch+ " ");
		 }
	 }
	 
	 void findCharFreq(String input) {
		 LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();
		 for(int i= 0; i<input.length(); i++) {
			 char ch = input.charAt(i);
			 if(map.containsKey(ch))
				 map.put(ch, map.get(ch)+1);
			 else
				 map.put(ch , 1);
		 }
		 System.out.println(map);
	 }
	 
	 void findCharFreqFromName(String[] input) {
		 LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		 for(int i= 0; i<input.length; i++) {
			 String str = input[i];
			 if(map.containsKey(str))
				 map.put(str, map.get(str)+1);
			 else
				 map.put(str , 1);
		 }
		 System.out.println(map);
	 }
	 
	 void findFreqOfNum(int[] input) {
		 LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
		 for(int i= 0; i<input.length; i++) {
			 int num = input[i];
			 if(map.containsKey(num))
				 map.put(num, map.get(num)+1);
			 else
				 map.put(num , 1);
		 }
		 System.out.println(map);
	 }
	 
	 public static void main(String[] args) {
		A33_ASCII_Int_Char a33 = new A33_ASCII_Int_Char();
		a33.asciiOfChar('A', 'Z');
		System.out.println();
		
		a33.charToAscii(97, 122);
		System.out.println();
		
		a33.findCharFreq("aakanksha");
		
		String[] arr =  {"raj", "aarya", "aavruti", "shruti","raj", "aarya"};
		a33.findCharFreqFromName(arr);
		
		int[] arrNum = {1,8,6,3,4,5,2,3,6,9,8,4};
		a33.findFreqOfNum(arrNum);
	}
}
