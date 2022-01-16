package vishakha;

public class A22_FiboSeries {

	void fibonaSeries(int num1, int num2, int iteration) {
		System.out.print(" "+num1);
		System.out.print(" "+num2);
		for(int i = 1; i<=iteration-2; i++) {
			int temp = num1;
			num1 = num2;
			num2= temp + num1;
			System.out.print(" "+ num2);
			
		}
	}
	
	void inBetweeenFibo(int start, int iteration) {
		int num1 = 0;
		int num2 = 1;
		for(int i =1; i <= iteration; i++) {
			int temp = num1;
			num1 = num2;
			num2 = temp + num1;
			if(num2 >= start) {
				System.out.print(" " + num2);
			}
		}
	}
	
	void startEnd(int start, int end) {
		int num1 = 0;
		int num2 = 1;
		for(int i = 1; i <= end; i++) {
			int temp = num1;
			num1 = num2;
			num2 = temp + num1;
			if(num2 >= start && num2 <= end) {
				System.out.print(" " + num2);
			}
		}
	}
	
	void countNumber(int num) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		for(int i = 1; i <= num; i++) {
			int temp = num1;
			num1 = num2;
			num2 = temp + num1;
			if(num2 <= num) {
				count++;
				
			}
		}
	System.out.println("Number of count required for " + num + ":" + count);
	}
	
	void numAddition()	{
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		int count = 0;
		for(int i = 1; i <= 50; i++) {
			int temp = num1;
			num1 = num2;
			num2 = temp + num1;
			sum = sum + num2;
			count++;
			if(sum >= 50) {
				break;
			}
		}
	System.out.println("Fibonacci Addition :" + sum + " count : " +count);
	}
	public static void main(String[] args) {
		A22_FiboSeries a1 = new A22_FiboSeries();
		a1.fibonaSeries(0, 1, 15);
		System.out.println();
		a1.inBetweeenFibo(3, 5);
		System.out.println();
		a1.startEnd(3, 34);
		System.out.println();
		a1.countNumber(34);
		System.out.println();
		a1.numAddition();
	
	}
}
