package rushikesh;
//Assignment - 22 : 9th Jan'2022

//Print fibonacci series for different variations as bellow
//
//1 . Print first n no of fibonacci series ( 8 numbers )
//output : 0 1 1 2 3 5 8 13 
//2 . Print first n no of fibonacci series but start no from 5
//output : 5 8 13
//3 . Print first n no of fibonacci series but start no from 5 and End no is 34
//output : 5 8 13 21 34
//4 . find how many no required from fibonacci series to generate sum >=50 . 
//output number count : 8
public class Assignment22 {
	int num1;
	int num2;
	int temp;
	void getFiboSeriesFromStart(int n) {
		System.out.println("Fibonacci Series From 0 to "+n+"th index is: ");
		System.out.println(0);
		System.out.println(1);
		num1=0;
		num2=1;
		for(int index=1;index<=n-2;index++) {
			temp=num2;
			num2=num1+num2;
			num1=temp;
			System.out.println(num2);	
		}	
		System.out.println("====================================================");
	}
	void getFiboSeriesFromGivenNotoNIndex(int startNum,int n) {
		int num1 = 0;
		int num2 = 1;
		int cnt = 1;
		System.out.println("First " + n + " numbers of Fobonacci series starting from " + startNum + " :");

		while (cnt <= n) {
			num2 = num2 + num1;
			num1 = num2 - num1;
			if (num2 >= 5) {
				System.out.println(num2 + " ");
				cnt++;
			}
		}
		System.out.println("====================================================");
	}
	void getFiboSeriesFromGivenNotoGivenNo(int startNum,int endNum) {
		int num1 = 0;
		int num2 = 1;
		System.out.println("Fibonacci series elements in given range " + startNum + " & " + endNum + " are : ");
		while (num2 <= endNum) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= startNum & num2 <= endNum)
				System.out.println(num2 + "  ");
		}
		System.out.println("====================================================");
	}
	void countHowManyNumToGenSum(int num) {
		int sum = 0;
		int count=2;
		num1=0;
		num2=1;
		System.out.println("Count How Many Nos are required to generate sum >=50");
		while(sum<=num) {
			num2=num1+num2;
			num1=num2-num1;
			sum+=num2;
			//System.out.println(sum);
			count++;
		}
		System.out.println(count);
		
		
		System.out.println("==================================");
	}
	public static void main(String[] args) {
		Assignment22 assignment22=new Assignment22();
		assignment22.getFiboSeriesFromStart(8);
		assignment22.getFiboSeriesFromGivenNotoNIndex(5,4);
		assignment22.getFiboSeriesFromGivenNotoGivenNo(5,34);
		assignment22.countHowManyNumToGenSum(50);
	}
}
