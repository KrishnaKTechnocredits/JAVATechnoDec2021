package krishna_Inheritance_Exp;

public class Assignment_22_Fibbnoci_Series {
	int temp = 0;

	void fibbnociSeries_8Nos() {
		temp = 8;
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.print(num1 + " " + num2);
		for (int i = 1; i <= temp - 2; i++) {
			sum = num1 + num2;
			System.out.print(" ");
			System.out.print(sum);
			num1 = num2;
			num2 = sum;
		}
	}

	void fibbnociSeries_Middle() {
		int temp1 = 3;
		int pNum = 5;
		int nNum = 8;
		System.out.println(" ");
		System.out.print("First n num of fibonacci series Start no from 5 : " + pNum + " " + nNum);
		for (int i = 1; i <= temp1 - 2; i++) {
			int sum1 = pNum + nNum;
			System.out.print(" ");
			System.out.print(sum1);
			pNum = nNum;
			nNum = sum1;
		}
	}

	void fibbnociSeries_range() {
		int num1 = 0;
		int num2 = 1;
		System.out.println(" ");
		for (int i = 0; num2 <= 34; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= 5)
				System.out.print(num1 + " ");
		}
	}

	void fibbnociSeries_sum() {
		int sum1 = 0;
		int pNum = 1;
		int nNum = 1;
		int count = 0;
		System.out.println(" ");
		for (int i = 1; i <= temp; i++) {
			sum1 = pNum + nNum;
			pNum = nNum;
			nNum = sum1;
			count++;
		}
		
		if (sum1 >= 50) {
			System.out.println("Number Count = " + count);
		}
	}

	public static void main(String[] args) {
		Assignment_22_Fibbnoci_Series ass22 = new Assignment_22_Fibbnoci_Series();
		ass22.fibbnociSeries_8Nos();
		ass22.fibbnociSeries_Middle();
		ass22.fibbnociSeries_range();
		ass22.fibbnociSeries_sum();
	}
}
