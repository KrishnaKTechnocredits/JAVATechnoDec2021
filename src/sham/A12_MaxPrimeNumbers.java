package sham;

import java.util.Scanner;

public class A12_MaxPrimeNumbers {

	int count=0;
	int countofNonPrime=0;
	void findPrimeNumbers(int number)
	{
		//System.out.println("******prime numbers*****");
		boolean flag= true;
		for(int i=2;i<number;i++)
		{
			if(number%i==0) {
				//System.out.println(number+" number is not prime");
				flag=false;
				//count++;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println(number+" is Prime");
			count++;
		
		}
	}
	void maxPrimeNumbers(int startRange, int endRange )
	{
		for(int startNum=startRange;startNum<=endRange;startNum++) {
			findPrimeNumbers(startNum);
			
			}
		System.out.println("Maximum prime number frome "+startRange+" To "+ endRange+" is: "+ count  );
	}
	public static void main(String[] args) {
		
		A12_MaxPrimeNumbers maxPrime= new A12_MaxPrimeNumbers();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Range by you Choice: ");
		System.out.println("Enter the First Number: ");
		int startNum= 	sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int endNum= sc.nextInt();
		maxPrime.maxPrimeNumbers(startNum, endNum);
	}

}
