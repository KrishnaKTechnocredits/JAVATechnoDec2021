package poojaRajguru;

public class A22_FibonancciSeriesAndVariation {
	void fib(int n) {
		int n1 = 0, n2 = 1;
		System.out.print("Fobonacci Series of " + n + " is : " );
		if (n <= 1) {
			System.out.print(n1 + "  " + n2 + "  "); 
		} else if (n > 1) {
			System.out.print(n1 + "  " + n2 + "  "); 
			for (int i = 1; i <= n - 2; i++) {
				n2 = n1 + n2;
				n1 = n2 - n1;
				System.out.print(n2 + "  ");
			}
		  }
	}

	void fibFromFive(int n, int s) {
		int cnt = 0;
		int n1 = 0, n2 = 1;
		System.out.print("Fobonacci Series Starting from " + s + " is : " );
		if (s == 0) {
			System.out.print(n1 + "  "); 
			cnt++;
		}
		while (cnt < n) {
			n2 = n1 + n2;
			n1 = n2 - n1;
			if (n2 >= s) {
				System.out.print(n2 + " ");
				cnt++;
			}
		} // while
	}

	void fibStartAndEnd(int s, int e) {
		int n1 = 0;
		int n2 = 1;
		System.out.print("Fobonacci Series Starting from " + s + " and  " + e +  " is : " );
		if (s == 0) {
			System.out.println(n1 + "  ");
		}
		while (n2 <= e) {
			n2 = n1 + n2;
			n1 = n2 - n1;
			if (n2 >= s) {
				System.out.print(n1 + "  ");
			}
		} // while
	}

	void fibSum(int sum) {
		int n1 = 0;
		int n2 = 1;
		int count = 0;
		int ans = 0;
		if (sum >= 0) {
			count++;
			ans = n1 + n2;
		}
		while (ans <= sum) {
			n2 = n1 + n2;
			n1 = n2 - n1;
			ans = ans + n2;
			count++;
		}
		System.out.println("To get the sum " + sum + " the count required is : " + count);
	}

	public static void main(String[] args) {
		A22_FibonancciSeriesAndVariation fibo = new A22_FibonancciSeriesAndVariation();
		fibo.fib(8);
		System.out.println();
		fibo.fibFromFive(3, 5);
		System.out.println();
		fibo.fibStartAndEnd(5, 21);
		System.out.println();
		fibo.fibSum(51);
	}
}
