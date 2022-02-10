// Test 6 Program 3 - Time Taken- 3 mins
package deepak;

public class Test6_P3_SumOfNumInStatement {

	int sumOfNumbers(String input) {
		String tempArr[] = input.split(" ");
		int tempNum = 0;
		int sum = 0;
		for (int index = 0; index < tempArr.length; index++) {
			tempNum = Integer.parseInt(tempArr[index]);
			sum += tempNum;
		}
		return sum;
	}

	public static void main(String[] args) {
		Test6_P3_SumOfNumInStatement sumOfNums = new Test6_P3_SumOfNumInStatement();
		System.out.print("Sum of all numbers in given statement: ");
		System.out.println(sumOfNums.sumOfNumbers("10 10 20 30"));

	}

}
