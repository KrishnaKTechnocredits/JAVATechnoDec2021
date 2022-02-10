package jagdish;

import java.util.ArrayList;

public class Exam6_P3 {
	static int sumofAllNumber(String number) {
		int sum = 0;
		String[] output = number.split(" ");
		ArrayList<Integer> listofarr = new ArrayList<Integer>();
		for (int i = 0; i < output.length; i++) {
			listofarr.add(Integer.valueOf(output[i]));
			sum += listofarr.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		String value = "10 10 20 30";
		System.out.println("Sum of number is: " + sumofAllNumber(value));
	}
}