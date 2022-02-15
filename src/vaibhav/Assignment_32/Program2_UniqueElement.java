/*Assignment 32: 5th Feb'2021

2. 	Input  : String [] arr = {"Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"}
  	Output : Vaibhav  Amruta Shivangi Pooja
	with all below three ways
	- without collection
	- with ArrayList
	- with Linked HashSet
     
*/

package vaibhav.Assignment_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Program2_UniqueElement {

	// Expected output using without using collection
	void printUniqueElementWithoutUsingCollection(String[] input) {
		String temp = "";
		for (int index = 0; index < input.length; index++) {
			if (!temp.contains(input[index])) {
				temp += input[index] + " ";
			}
		}
		System.out.println("Expected output without using Collection	: " + temp.trim());
	}

	// Expected output using ArrayList
	void printUniqueElementWithArrayList(String[] input) {
		List<String> list = Arrays.asList(input);
		ArrayList<String> al = new ArrayList<String>(list);
		for (int index = 0; index < al.size(); index++) {
			if (al.indexOf(al.get(index)) != al.lastIndexOf(al.get(index))) {
				al.remove(al.get(index));
			}
		}
		System.out.println("Expected output using ArrayList 		: " + al);
	}

	// Expected output using LinkedHashset
	void printUniqueElementWithLinkedHashSet(String[] input) {
		List<String> list = Arrays.asList(input);
		LinkedHashSet<String> hs = new LinkedHashSet<String>(list);
		System.out.println("Expected output using LinkedHashSet 		: " + hs); 
	}

	public static void main(String[] args) {

		Program2_UniqueElement program2_UniqueElement = new Program2_UniqueElement();
		String[] inputArr = { "Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav" };
		String[] inputArr2 = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		System.out.println("Input Array 1			: " + Arrays.toString(inputArr2));
		System.out.println("-----------------------------------------------------------------------------------");
		program2_UniqueElement.printUniqueElementWithoutUsingCollection(inputArr2);
		program2_UniqueElement.printUniqueElementWithArrayList(inputArr2);
		program2_UniqueElement.printUniqueElementWithLinkedHashSet(inputArr2);

	}
}
