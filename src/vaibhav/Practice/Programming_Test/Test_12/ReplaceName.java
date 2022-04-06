/*Programming Test - 12 : 22nd May'2021

2) int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3*/

package vaibhav.Practice.Programming_Test.Test_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceName {

	int countName(ArrayList<String> arr, String targetName) {
		int count = 0;
		while (arr.contains(targetName)) {
			int index = arr.indexOf(targetName);
			arr.set(index, "Technocredits");
			count++;
		}
		System.out.println("Modified word list	:" + arr);
		return count;
	}

	public static void main(String[] args) {
		String[] nameArr = { "Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav" };
		List<String> names = Arrays.asList(nameArr);
		ArrayList<String> nameList = new ArrayList<String>(names);

		ReplaceName replaceName = new ReplaceName(); 
		System.out.println("Word List		:" + nameList);
		int count = replaceName.countName(nameList, "Aashay");
		System.out.println("Count of 'Aashay' in the given string : " + count);
	}
}
