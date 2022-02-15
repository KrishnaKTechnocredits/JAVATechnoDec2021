/*Write a method which will remove all the occurrences of the name from the list which is passed as a parameter.
    
1.  String[] names = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
Anvit Sandip Nishika Priya [all names should be printed once]
Anvit Nishika [only name having freq - 1]

2. Input :  String [] arr = {"Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"}
Output : Vaibhav  Amruta Shivangi Pooja 

Note – Try to do the above with Arrays, ArrayList and Hashset
*/
package deepak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class A32_SingleOccurence {

	void getUniqueStringFromArray(String[] input) {
		System.out.print("Names with frequency in the String array as 1: ");
		for (int index = 0; index < input.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex]) {
					count++;
				}
			}
			if (count == 1)
				System.out.print(input[index] + " ");
		}
		System.out.println();
	}

	void getSingleOccuranceLinkedHashSet(String[] input) {
		LinkedHashSet<String> tempList = new LinkedHashSet<String>(Arrays.asList(input));
		System.out.println(tempList);
	}

	void getSingleOccuranceArrayList(String[] input) {
		ArrayList<String> tempList = new ArrayList<String>();
		for (String name : input) {
			if (!tempList.contains(name))
				tempList.add(name);
		}
		System.out.println(tempList);
	}

	public static void main(String[] args) {
		A32_SingleOccurence singleOccur = new A32_SingleOccurence();

		String[] input1 = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		singleOccur.getUniqueStringFromArray(input1);
		String[] input2 = { "Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav" };
		System.out.print("Unique Names in the String Array1 using HashSet: ");
		singleOccur.getSingleOccuranceLinkedHashSet(input2);
		System.out.print("Unique Names in the String Array2 using HashSet: ");
		singleOccur.getSingleOccuranceLinkedHashSet(input1);
		System.out.print("Unique Names in the String Array1 using ArrayList: ");
		singleOccur.getSingleOccuranceArrayList(input1);
		System.out.print("Unique Names in the String Array2 using ArrayList: ");
		singleOccur.getSingleOccuranceArrayList(input2);

	}

}
