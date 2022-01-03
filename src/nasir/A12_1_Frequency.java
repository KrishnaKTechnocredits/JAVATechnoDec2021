package nasir;

import java.util.Scanner;

public class A12_1_Frequency {
	void eachCharacter(String input ){
		int count1=0;
		int count2=0;
		String temp="";
		for(int index=0; index<input.length();index++){			
			for(int i=index; i<input.length();i++){
				char ch = input.charAt(index);
				String s= ch+"";
				if(temp.contains(s)==false) {
					if(input.indexOf(ch)!= input.lastIndexOf(ch)) {
						System.out.println("Duplicate Character "+ch);
						count1++;
					}
					else {
						System.out.println("Unique Character "+ch);
						count2++;
					}
				}
				temp=temp+ch;
			}
			//System.out.println("Frequency of " +input.charAt(index)+" is "+count);
		}		
	}
	
	public static void main(String[] args){
		A12_1_Frequency frequency = new A12_1_Frequency();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please enter the input");
		String input=scanner.next();
		frequency.eachCharacter(input);
	}
}


