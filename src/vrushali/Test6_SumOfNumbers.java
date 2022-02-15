/*sum of all numbers in a given statement.
input = "10 10 20 30";
output : 70*/

package vrushali;

public class Test6_SumOfNumbers {
	
	void sunOfNum(String input) {
		String[] num = input.split(" ");
		int sum = 0;
		
		for (int index =0; index < num.length; index++) {
			
			sum = sum+ Integer.parseInt(num[index]);
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Test6_SumOfNumbers sumOfNumbers = new Test6_SumOfNumbers();
		sumOfNumbers.sunOfNum("10 10 20 30");
	}
}
