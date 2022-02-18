package nehaPandey;

//Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are. Return the total number of matching pairs of socks that a person can have

//
//Example:
//
//Input :  9 10 20 20 10 10 30 50 10 20
//
//Output : 3
//
//Input : 100 200 300 100 400 400 500 600
//
//Output : 2
//
//Hint : Use HashMap

import java.util.HashMap;
import java.util.Map;

public class Exam_5 {
	int findPairOfMatchingColorSocks(int[] arr) {
		Map<Integer, Integer> freqOfNum = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (freqOfNum.containsKey(num))
				freqOfNum.put(num, freqOfNum.get(num) + 1);
			else
				freqOfNum.put(num, 1);
		}

		int count = 0;
		for (int value : freqOfNum.values()) {
			count = count + (value / 2);
		}
		System.out.println(freqOfNum);
		return count;
	}

	public static void main(String[] args) {
		Exam_5 exam5 = new Exam_5();
		int[] input1 = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println("Total pair of matching color socks " + exam5.findPairOfMatchingColorSocks(input1));
		System.out.println();
		int[] input2 = { 100, 200, 300, 100, 400, 400, 500, 600 };
		System.out.println("Total pair of matching color socks " + exam5.findPairOfMatchingColorSocks(input2));
	}

}
