package kalyani;

public class A22_FibonacciSeries4 {

	void getFiboCountToGenParticularSum() {
		int num1 = 0; 
		int num2 = 1;
		int count = 0;
		int sum =0;
		if(50 >= 0) {
			count++;
			sum = num1 + num2;
		}
		
		while(sum <= 50) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;
		}
		
		System.out.println ("Count of no in series : " +count);
		System.out.println ("Sum of number in series : "+sum);
	}

	public static void main(String[] args) {
		A22_FibonacciSeries4 fibonacci = new A22_FibonacciSeries4();
		fibonacci.getFiboCountToGenParticularSum();
	}
}