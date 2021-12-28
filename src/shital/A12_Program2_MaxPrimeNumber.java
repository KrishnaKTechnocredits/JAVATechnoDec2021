package shital;

import java.util.Scanner;

class MaxPrimeNumber{

	boolean isPrime(int number){
		
		boolean flag=true;
		for(int index=2;index<number/2;index++){
			if(number%index==0){
				flag=false;
				break;
			}
		}
		if(flag==true){
			//System.out.println("Prime No is : "+number);
		}	
		return flag;
	}
	
	void findRangeofPrimeNumber(int firstNumber, int lastnumber){
		
		int number=firstNumber;
		int maxPrimeNumber=0;
		//System.out.println("Prime Number between "+firstNumber+" to "+lastnumber+" :");
		while(number<=lastnumber){
			if(isPrime(number)==true){
				maxPrimeNumber=number;
			}
			number++;
		}		
		System.out.println("\nMaximum Prime Numbers is: "+maxPrimeNumber);
	}
	
	public static void main(String[] args){
		MaxPrimeNumber maxPrimeNumber=new MaxPrimeNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Find Maximum Prime Number between range");
		System.out.println("Enter First Number: ");
		int firstNumber=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int lastnumber=sc.nextInt();
		maxPrimeNumber.findRangeofPrimeNumber(firstNumber, lastnumber);
		sc.close();
	}
}