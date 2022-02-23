/*Program 5:  Find all character frequency from given name. 
  Input: name - aakanksha Output : a -> 4 k -> 2 n -> 1 s -> 1 h -> 1  
  
  Program 6:  Find all character frequency from each name given in String array. 
  Input : Array -> {"raj", "aarya", "aavruti", "shruti","raj", "aarya"}  
 
  Program 7:  Return the frequency of each numbers from given array. 
  input: [1,8,6,3,4,5,2,3,6,9,8,4]
*/

package deepak;

import java.util.HashMap;

public class A33_P5toP7_MapImportantPrograms {

	void getCharFrequency(String input) {
		HashMap<Character, Integer> mapOutput = new HashMap<>();

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (mapOutput.containsKey(ch)) {
				int count = mapOutput.get(ch);
				mapOutput.put(ch, count + 1);
			} else {
				mapOutput.put(ch, 1);
			}
		}
		System.out.println(input + "----" + mapOutput);
	}

	void getCharFrequencyFromArray(String[] input) {
		for (int index = 0; index < input.length; index++) {
			getCharFrequency(input[index]);
			// System.out.println();
		}
	}

	void getIntFrequencyFromArray(int[] input) {
		HashMap<Integer, Integer> mapOutput = new HashMap<>();
		for (int index = 0; index < input.length; index++) {
			int temp = input[index];
			if (mapOutput.containsKey(temp)) {
				int cnt = mapOutput.get(temp);
				mapOutput.put(temp, cnt + 1);
			} else {
				mapOutput.put(temp, 1);
			}
		}
		System.out.println(mapOutput);
	}

	public static void main(String[] args) {
		A33_P5toP7_MapImportantPrograms mapProgram = new A33_P5toP7_MapImportantPrograms();
		System.out.println("Below is the character frequency using HashMap: ");
		mapProgram.getCharFrequency("aakanksha");
		System.out.println();

		System.out.println("Below is the character frequency using HashMap for the array: ");
		String[] input2 = { "raj", "aarya", "aavruti", "shruti", "raj", "aarya" };
		mapProgram.getCharFrequencyFromArray(input2);
		System.out.println();

		System.out.println("Below is the integer frequency using HashMap for the array: ");
		int[] input3 = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		mapProgram.getIntFrequencyFromArray(input3);

	}

}
