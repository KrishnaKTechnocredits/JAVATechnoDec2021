/*3. sum of all numbers in a given statement.
input = "10 10 20 30";
output : 70
 */
package shwetaDharmadhikari.test6;

public class SumOfGivenNumbers {
	int printSum(String input) {
		String[] arr = input.split(" ");
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum += Integer.parseInt(arr[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "10 10 20 30";
		System.out.println("Output :" + new SumOfGivenNumbers().printSum(input));
	}
}
