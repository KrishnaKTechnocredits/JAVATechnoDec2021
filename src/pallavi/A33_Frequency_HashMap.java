/*Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1

Program 6: 
Find all character frequency from each name given in String array.
Input : Array -> {"raj", "aarya", "aavruti", "shruti","raj", "aarya"}

Program 7: 
Return the frequency of each numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
*/

package pallavi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class A33_Frequency_HashMap {

	void getCharFrequency(String name) {
		Map<Character, Integer> output = new LinkedHashMap<Character, Integer>();

		for (int index = 0; index < name.length(); index++) {
			int count = 1;
			if (output.containsKey(name.charAt(index))) {
				count = output.get(name.charAt(index));
				output.put(name.charAt(index), count + 1);
			} else
				output.put(name.charAt(index), count);
		}
		System.out.println(output);
	}

	void getNameFrequency(String[] input) {
		Map<String, Integer> output = new LinkedHashMap<String, Integer>();
		for (int index = 0; index < input.length; index++) {
			int count = 1;
			if (output.containsKey(input[index])) {
				count = output.get(input[index]);
				output.put(input[index], count + 1);
			} else
				output.put(input[index], count);
		}
		System.out.println(output);
	}

	void getNumberFrequency(int[] input) {
		Map<Integer, Integer> output = new LinkedHashMap<Integer, Integer>();
		for (int index = 0; index < input.length; index++) {
			int count = 1;
			if (output.containsKey(input[index])) {
				count = output.get(input[index]);
				output.put(input[index], count + 1);
			} else
				output.put(input[index], count);
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		A33_Frequency_HashMap frq_HsMap = new A33_Frequency_HashMap();
		String name = "aakanksha";
		System.out.println("Frequency of each chater in " + name + " : ");
		frq_HsMap.getCharFrequency(name);

		String[] names = { "raj", "aarya", "aavruti", "shruti", "raj", "aarya" };
		System.out.println("Frequency of each name in given array " + Arrays.toString(names) + " is : ");
		frq_HsMap.getNameFrequency(names);

		int[] numbers = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		System.out.println("Frequency of each number in given array " + Arrays.toString(numbers) + " is : ");
		frq_HsMap.getNumberFrequency(numbers);
	}

}
