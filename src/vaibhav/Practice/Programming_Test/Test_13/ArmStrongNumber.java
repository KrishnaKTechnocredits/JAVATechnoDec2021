/*Programming Test - 13 : 25th May'2021

1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int numbser[]){
	//write your logic
}*/

package vaibhav.Practice.Programming_Test.Test_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArmStrongNumber {

	boolean isArmStrong(int num) {
		int temp = num;
		int sum = 0;
		int mod = 0;

		while (temp != 0) {
			mod = temp % 10;
			sum = sum + mod * mod * mod;
			temp = temp / 10;
		}

		if (sum == num)
			return true;
		else
			return false;
	}

	ArrayList<Integer> getArmStrongNumber(int numbers[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int num : numbers) {
			if (isArmStrong(num)) {
				output.add(num);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] numberArr = { 153, 279, 371, 303, 407 };
		ArmStrongNumber armStrongNumber = new ArmStrongNumber();
		ArrayList<Integer> output = armStrongNumber.getArmStrongNumber(numberArr);
		System.out.println("Input Array		: " + Arrays.toString(numberArr));
		System.out.println("Expected Output		: " + output);
	}
}
