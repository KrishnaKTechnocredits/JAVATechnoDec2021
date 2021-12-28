package shital;

import java.util.Scanner;

class ReverseNumber{

	void findReverseMethod(int number){
		int value=0;
		//for(int index=number-1;index>=0;index--)
		
		while(number>0){
			int r=number%10;
			value=value*10+r;
			number=number/10;
		}
		System.out.println("Reverse Number is: "+value);
	}
	
	public static void main(String[] args){
		ReverseNumber reverseNumber=new ReverseNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("***Reverse a Number***");
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		reverseNumber.findReverseMethod(number);
		sc.close();
	}
}