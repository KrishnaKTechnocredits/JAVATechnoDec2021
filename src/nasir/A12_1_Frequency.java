package nasir;

import java.util.Scanner;

public class A12_1_Frequency {
	void eachCharacter(String input ){
		for(int index=0; index<input.length();index++){
			int count=0;
			for(int i=index; i<input.length();i++){
				if(input.charAt(i)== input.charAt(index))
				count++;
			}
			System.out.println("Frequency of " +input.charAt(index)+" is "+count);
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


