package debasmita;

import java.util.Scanner;

public class A12_FrequencyOfCharacter {
	int frequency(String str,char ch) {
		int count=0;
		for(int index=0; index<str.length();index++) {
			if(str.charAt(index)==ch) {
				count++;
			}
		}
		    return count;
	}
	
    void frequencyCharacter(String name) {
    	for(int i=0;i<name.length();i++) {
    		char c1= name.charAt(i);
    		int cnt=frequency(name,c1);
    		System.out.println("frequency of each character for ch :"+cnt);
    	}
    	
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the name:");	
    	String input =sc.next();
    	A12_FrequencyOfCharacter character= new A12_FrequencyOfCharacter();
    	character.frequencyCharacter(input);
    }
}
