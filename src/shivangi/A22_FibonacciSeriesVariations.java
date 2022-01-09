package shivangi;

public class A22_FibonacciSeriesVariations {
	
	void fibonacciOfEightNum() {
		int num1 = 0;
		int num2 = 1;
		System.out.println("Fibonacci series started from number 5 to 8 : ");
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		int n = 8;
		for(int index=1; index<=n-2; index++) {
			num2 = num1+num2;
			System.out.print(num2 + " ");
			num1 = num2-num1;
		}
	}
	
	void fibonacciNumStartfrom5() {
		int num1 = 0;
		int num2 = 1;
		int n = 8;
		System.out.println("Fibonacci series started from number 5 : ");
		for(int index=1; index<=n-2; index++) {
			num2 = num1+num2;
			num1 = num2-num1;
			if(num2>=5) {
				System.out.print(num2 + " ");
			}
		}
	}
	
	void fibonacciNumfrom5to34() {
		int num1 = 0;
		int num2 = 1;
		System.out.println("Fibonacci series from number 5 to 34: ");
		while(num2<34) {
			num2 = num1+num2;
			num1 = num2-num1;
			if(num2>=5) {
				System.out.print(num2 + " ");
			}
		}
	}
	
	void fibonacciSumGreaterOr50(int num) {
		int num1 = 0;
		int num2 = 1;
		int count = 2;
		int sum = 2;
		System.out.println("find count of Fibonacci series till sum reached greater than or equal to 50: ");
		while(sum <= num) {
			num2 = num1+num2;
			num1 = num2-num1;
			sum = sum + num2;
			count++;
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		A22_FibonacciSeriesVariations a22_FibonacciSeriesVariations = new A22_FibonacciSeriesVariations();
		a22_FibonacciSeriesVariations.fibonacciOfEightNum();
		System.out.println();
		a22_FibonacciSeriesVariations.fibonacciNumStartfrom5();
		System.out.println();
		a22_FibonacciSeriesVariations.fibonacciNumfrom5to34();
		System.out.println();
		a22_FibonacciSeriesVariations.fibonacciSumGreaterOr50(50);
	}
	
}
