package sagarAcharya;

public class A22_Fibonacci {
	
	public static void main(String[] args) {
		A22_Fibonacci a22 =new A22_Fibonacci();
		System.out.println("first n no of fibonacci series ( 8 numbers ) : ");
		a22.program1(8);
		System.out.println("first n no of fibonacci series but start no from 5 : ");
		a22.program2(3);
		System.out.println("first n no of fibonacci series but start no from 5 and End no is 34 : ");
		a22.program3(34);
		System.out.println("no. required from fibonacci series to generate sum >=50 : ");
		a22.program4(50);
	}
	
	void program1(int input) {
		int num1 = 0;
		int num2 = 1;
		//int n = 1;
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i = 1;i<=input-2;i++) {
			num2=num1 + num2;
			num1=num2 - num1;
			System.out.println(num2);
		}
		
		/*while (n<=input-2) {
			num2=num1 + num2;
			num1=num2 - num1;
			System.out.println(num2);
			n++;
		}*/
	}
	
	void program2(int input) {
		int num1 = 0;
		int num2 = 1;
		int count = 1;
		int startNum = 5;
		
		//System.out.println(num1);
		//System.out.println(num2);
		while (count<=input) {
			num2=num1 + num2;
			num1=num2 - num1;
			if(num2 >= startNum) {
				count++;
				System.out.println(num2);
			}
		}
	}
	
	void program3(int input) {
		int num1 = 0;
		int num2 = 1;
		//int count = 1;
		int startNum = 5;
		
		//System.out.println(num1);
		//System.out.println(num2);
		while (num2<input) {
			num2=num1 + num2;
			num1=num2 - num1;
			if(num2 >= startNum) {
				//count++;
				System.out.println(num2);
			}
		}
	}
	
	void program4(int input) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		int count = 1;
		//int startNum = 5;
		
		//System.out.println(num1);
		//System.out.println(num2);
		while (sum<input) {
			num2=num1 + num2;
			num1=num2 - num1;
			//if(num2 >= startNum) {
			count++;
			sum +=num2;
				
			}
		System.out.println(count);
		}
}

/*
Assignment - 22 : 9th Jan'2022

Print fibonacci series for different variations as bellow

1 . Print first n no of fibonacci series ( 8 numbers )
output : 0 1 1 2 3 5 8 13 
2 . Print first n no of fibonacci series but start no from 5
output : 5 8 13
3 . Print first n no of fibonacci series but start no from 5 and End no is 34
output : 5 8 13 21 34
4 . find how many no. required from fibonacci series to generate sum >=50 . 
output number count : 8
*/