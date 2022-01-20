package tanu;

class Assignment22 {

	void displayFibonacciSeries(int num) {
		int position = 0;
		int num1 = 0;
		int num2 = 1;
		int count=0;
		int sum;
		System.out.println(num1);
		System.out.println(num2);
		for (int index = 1; index <= num - 2; index++) {
			position = num1 + num2;// 0+1=1 2 3 5 8
			System.out.println(position);
			num1 = num2;
			num2 = position;
			// position= num1+ num2;
		}
		System.out.println("________________");
	}
	void displayFibonacciSeriesFromFive(int num) {
		int position = 0;
		int num1 = 0;
		int num2 = 1;
		int count=0;
		int sum;
		for (int index = 0; index <= num; index++) {
			position = num1 + num2;
			if (position>= 5) {
				System.out.println(position);
			}
			num1 = num2;
			num2 = position;
		}
		System.out.println("________________");
	}
	void displayFibonacciSeriesWithStartAndEnd(int num) {
		int position = 0;
		int num1 = 0;
		int num2 = 1;
		int count=0;
		int sum;
		for (int index = 1; index <= num; index++) {
			position = num1 + num2;
			if ((position >= 5) && (position <= 34)) {
				System.out.println(position);
			}
			num1 = num2;
			num2 = position;
		}
		System.out.println("________________");
	}
	void displayFibonacciSeriesWithSum(int num) {
		int position = 0;
		int num1 = 0;
		int num2 = 1;
		int count=0;
		int sum;
		for (int index = 1; index <= num; index++) {
			position = num1 + num2;
			count++;
		     if (position >= 50) {
			    System.out.println("Total Number Count is "+count);
			    break;
		     }
				num1 = num2;
				num2 = position;
		}
		System.out.println("________________");

	}
	public static void main(String[] arg) {
		Assignment22 assignment = new Assignment22();
	    assignment.displayFibonacciSeries(8);
	    assignment.displayFibonacciSeriesFromFive(8);
	    assignment.displayFibonacciSeriesWithStartAndEnd(8);
		assignment.displayFibonacciSeriesWithSum(100);
	}

}
