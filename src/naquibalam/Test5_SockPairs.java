package naquibalam;

import java.util.Arrays;
import java.util.HashMap;

public class Test5_SockPairs {

	int getPairs(int[] input) {
		int totalPairs = 0;
		HashMap<Integer, Integer> socksPair = new HashMap<Integer, Integer>();
		for(int sockColour : input) {
			if (socksPair.containsKey(sockColour)) {
				socksPair.put(sockColour, (socksPair.get(sockColour))+1);
			} else {
				socksPair.put(sockColour, 1);
			}
		}
		for (int eachSock : socksPair.values()) {
			totalPairs = totalPairs + eachSock/2;
		}
		return totalPairs;
	}

	public static void main(String[] args) {
		int[] input1 = {9, 10, 20, 20, 10, 10, 30, 50, 10, 20};
		int[] input2 = {100, 200, 300, 100, 400, 400, 500, 600};
		Test5_SockPairs test5_SockPairs = new Test5_SockPairs();
		System.out.println("-------------------------------------------");
		System.out.println("Input - " + Arrays.toString(input1));
		System.out.println("Total pairs - " + test5_SockPairs.getPairs(input1));
		System.out.println("-------------------------------------------");
		System.out.println("Input - " + Arrays.toString(input2));
		System.out.println("Total pairs - " + test5_SockPairs.getPairs(input2));
		System.out.println("-------------------------------------------");
	}
}
