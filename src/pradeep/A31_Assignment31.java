// WAP to return an ArrayList of unique elements from a given input ArrayList 
package pradeep;

import java.util.ArrayList;

public class A31_Assignment31 {

	// This method returns unique number ArrayList generic on Integer
	static ArrayList<Integer> getUniqueArrayList(ArrayList<Integer> inputArrayList) {
		ArrayList<Integer> outputArrayList = new ArrayList<Integer>();
		for (int index = 0; index < inputArrayList.size(); index++) {
			int num = inputArrayList.get(index);
			if (!outputArrayList.contains(num))
				outputArrayList.add(num);
		}
		return outputArrayList;
	}

	// This method returns unique number ArrayList generic on String
	static ArrayList<String> getUniqueArrayList2(ArrayList<String> stringArrayList) {
		ArrayList<String> outputArrayList = new ArrayList<String>();
		for (int index = 0; index < stringArrayList.size(); index++) {
			String name = stringArrayList.get(index);
			if (!outputArrayList.contains(name))
				outputArrayList.add(name);
		}
		return outputArrayList;
	}

	// This method returns unique number ArrayList without generic
	static ArrayList getUniqueArrayList3(ArrayList arrayList) {
		ArrayList outputArrayList = new ArrayList();
		for (int index = 0; index < arrayList.size(); index++) {
			Object obj = arrayList.get(index);
			if (!outputArrayList.contains(obj))
				outputArrayList.add(obj);
		}
		return outputArrayList;
	}

	public static void main(String[] args) {
		// Integer ArrayList
		ArrayList<Integer> inputArrayList = new ArrayList<Integer>();
		inputArrayList.add(19);
		inputArrayList.add(8);
		inputArrayList.add(0);
		inputArrayList.add(8);
		inputArrayList.add(4, 60);
		inputArrayList.add(5, 56);
		inputArrayList.add(97);
		inputArrayList.add(0);
		inputArrayList.add(33);
		inputArrayList.add(60);
		inputArrayList.add(0);
		System.out.println("Input Array List: " + inputArrayList);
		System.out.println("Output Array List: " + getUniqueArrayList(inputArrayList));

		// String ArrayList
		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add("Techno");
		stringArrayList.add("Credits");
		stringArrayList.add("Techno");
		stringArrayList.add("TechnoCredits");
		stringArrayList.add("Credits");
		stringArrayList.add("TechnoCredits");
		System.out.println("Input Array List: " + stringArrayList);
		System.out.println("Output Array List: " + getUniqueArrayList2(stringArrayList));

		// Object ArrayList
		ArrayList arrayList = new ArrayList();
		arrayList.add("Techno");
		arrayList.add(16);
		arrayList.add("Credits");
		arrayList.add(19);
		arrayList.add("Techno");
		arrayList.add(2);
		arrayList.add(19);
		arrayList.add("Credits");
		arrayList.add(16);
		arrayList.add("TechnoCredits");
		System.out.println("Input Array List: " + arrayList);
		System.out.println("Output Array List: " + getUniqueArrayList3(arrayList));
	}
}
