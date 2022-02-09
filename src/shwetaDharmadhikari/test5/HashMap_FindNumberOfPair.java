/*Programming Test - 5 : 9th Feb'2022 

Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are. 
Return the total number of matching pairs of socks that a person can have

Example:

Input :  9 10 20 20 10 10 30 50 10 20

Output : 3

Input : 100 200 300 100 400 400 500 600

Output : 2
 */
package shwetaDharmadhikari.test5;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap_FindNumberOfPair {

	int findPairCount(int[] input) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int number : input) {
			if (hm.containsKey(number))
				hm.put(number, hm.get(number) + 1);
			else
				hm.put(number, 1);
		}
		int count = 0;
		for (int num : hm.values()) {
			count += (num / 2);
		}
		return count;
	}

	public static void main(String[] args) {
		int[] input = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println("Input : " + Arrays.toString(input));
		System.out.println("Output : " + new HashMap_FindNumberOfPair().findPairCount(input));
		int[] input1 = { 100, 200, 300, 100, 400, 400, 500, 600 };
		System.out.println("Input : " + Arrays.toString(input1));
		System.out.println("Output : " + new HashMap_FindNumberOfPair().findPairCount(input1));
	}
}
