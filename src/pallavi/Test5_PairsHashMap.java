/*Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are. Return the total number of matching pairs of socks that a person can have

Example:

Input :  9 10 20 20 10 10 30 50 10 20

Output : 3

Input : 100 200 300 100 400 400 500 600

Output : 2

Hint : Use HashMap
*/

package pallavi;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Test5_PairsHashMap {

	int getPairCount(int[] colorcode1) {
		LinkedHashMap<Integer, Integer> pairs = new LinkedHashMap<>();

		for (int i = 0; i < colorcode1.length; i++) {
			int count = 1;
			if (pairs.containsKey(colorcode1[i])) {
				count = pairs.get(colorcode1[i]);
				pairs.put(colorcode1[i], count + 1);
			} else
				pairs.put(colorcode1[i], count);
		}
		return getPairCount(pairs);

	}

	int getPairCount(LinkedHashMap<Integer, Integer> pairs) {
		int noOfPairs = 0;
		for (int i : pairs.values())
			noOfPairs += i / 2;

		return noOfPairs;
	}

	public static void main(String[] args) {
		Test5_PairsHashMap test5 = new Test5_PairsHashMap();

		int[] colorcode1 = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println("Input1:- " + Arrays.toString(colorcode1));
		System.out.println("Output1:- " + test5.getPairCount(colorcode1));
		System.out.println("----------------------------------------------");
		int[] colorcode2 = { 100, 200, 300, 100, 400, 400, 500, 600 };
		System.out.println("Input2:- " + Arrays.toString(colorcode2));
		System.out.println("Output2:- " + test5.getPairCount(colorcode2));

	}

}
