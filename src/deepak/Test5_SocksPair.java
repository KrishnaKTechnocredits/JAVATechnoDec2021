/*Programming Test - 5 : 9th Feb'2022 

Given an array of integers representing the color of each sock, 
determine how many pairs of socks with matching colors there are. 
Return the total number of matching pairs of socks that a person can have
Example:

Input :  9 10 20 20 10 10 30 50 10 20

Output : 3

Input : 100 200 300 100 400 400 500 600

Output : 2

Hint : Use HashMap*/

package deepak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test5_SocksPair {

	void getPair(int[] input) {
		int finalcount = 0;
		HashMap<Integer, Integer> socks = new HashMap<>();
		for (int index = 0; index < input.length; index++) {
			int num = input[index];
			if (socks.containsKey(num)) {
				int count = socks.get(num);
				socks.put(num, count + 1);
			} else
				socks.put(num, 1);
		}
		System.out.println(socks);
		for (int value : socks.values()) {
			finalcount += value / 2;
		}
		System.out.println("Number of pairs in the integer array is: " + finalcount);
	}

	public static void main(String[] args) {
		Test5_SocksPair socks = new Test5_SocksPair();
		int input[] = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		socks.getPair(input);
		System.out.println();

		int input1[] = { 100, 200, 300, 100, 400, 400, 500, 600 };
		socks.getPair(input1);

	}

}
