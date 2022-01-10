/*Assignment - 22 : 9th Jan'2022

Print fibonacci series for different variations as bellow

1 . Print first n no of fibonacci series ( 8 numbers )
output : 0 1 1 2 3 5 8 13 
2 . Print first n no of fibonacci series but start no from 5
output : 5 8 13
3 . Print first n no of fibonacci series but start no from 5 and End no is 34
output : 5 8 13 21 34
4 . find how many no required from fibonacci series to generate sum >=50 . 
output number count : 8
 */
package anjali;

public class Anjali_Assignment22 {
	
	static void printFibonacciSeries(int n){
		int num1=0;
		int num2=1;
		int Result=0;
		System.out.println(num1);
		for(int i=0;i<=n-2;i++){
			Result=num1+num2;
			num1=num2;
			num2=Result;
			System.out.println(num1);
		}
	}
	
	static void printFibonacciSeriesStartFrom5(int n){
		int num1=0;
		int num2=1;
		int Result=0;
		while(num1<=n){
			Result=num1+num2;
			num1=num2;
			num2=Result;
			if(num1>=5)
			System.out.println(num1);
		}	
	}
	
	static void printFibonacciSeriesfromGivenRange(int startnum, int endnum){
		int num1=0;
		int num2=1;
		int Result=0;
		while(num1<=5 || num1<=endnum) {
			Result=num1+num2;
			num1=num2;
			num2=Result;
			if(num1>=5 && num1<=endnum)
			System.out.println(num1);
		}
	}
	
	static  void sumofFibonacciSeries(){
		int num1=0;
		int num2=1;
		int Result=0;
		int sum=0;
		int count=0;
		sum=sum+num1;
		while(num1<=50 && sum<=50){
			Result=num1+num2;
			num1=num2;
			num2=Result;
			count++;
			sum=sum+num1;
			//System.out.println(sum);
		}
	     System.out.println(count+" numbers are required to genereate Fibonacci Series sum >=50 ");
	}
	
	public static void main(String[] args){
		printFibonacciSeries(8);
		System.out.println("*****************************");
		printFibonacciSeriesStartFrom5(8);
		System.out.println("*****************************");
		printFibonacciSeriesfromGivenRange(5,35);
		System.out.println("*****************************");
		sumofFibonacciSeries();

	}

}
