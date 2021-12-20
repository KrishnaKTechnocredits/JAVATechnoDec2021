package priya;

public class A7_String {

	/* 1.Print all characters at even position from given string.
	input : technocredits
	output : ehordt */
	
	void evenCh(String input) {
		 String temp = "";
		 for(int index =0;index<input.length();index++) {
			 if ((index+1)%2==0)
				 temp =temp + input.charAt(index);
		 }
		 System.out.println(temp); 
	 }
	 
	 /* Print only vowels from given string.
	input : technocredits
	output : eoei*/
	
	 void volwelChecker(String input) {
		 String temp = "";
		 for(int index =0; index<input.length();index++){
				if(input.charAt(index)=='a' || input.charAt(index)=='e' || input.charAt(index)=='i' || input.charAt(index)=='o' || input.charAt(index)=='u')
					temp =temp + input.charAt(index);
		  }	
		  System.out.println(temp);
	 }
	 
	 public static void main(String[] args) {
		 A7_String A7=new A7_String();
		 A7.evenCh("technocredits");
		 A7.volwelChecker("technocredits");
		 }
	 }
