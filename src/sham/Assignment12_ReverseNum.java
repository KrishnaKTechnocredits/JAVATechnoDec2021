package sham;

import java.util.Scanner;

public class Assignment12_ReverseNum {

	int reverseNumberFunction(int num)
	{
		//int num=123;
		int	rev = 0;
		while(num>0) {
			int rem= num%10 ;		
			rev= rev*10+rem;
			num=num/10;		
		}
		return rev;		
	}
	public static void main(String[] args) {
		
		Assignment12_ReverseNum rev= new Assignment12_ReverseNum();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to Reverse: ");
		int num=sc.nextInt();
		int revNum=rev.reverseNumberFunction(num);	
		System.out.println("Reverse Number is: "+revNum);
		sc.close();
	}

}
