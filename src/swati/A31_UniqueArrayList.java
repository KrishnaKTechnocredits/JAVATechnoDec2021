package swati;

import java.util.ArrayList;
import java.util.Arrays;

public class A31_UniqueArrayList {

//Find Unique String
	ArrayList<String> findUniqueWord(ArrayList<String> arr) {
		ArrayList<String> temp = new ArrayList<String>();
		for (int i = 0; i < arr.size(); i++) {
			String st = arr.get(i);
			if (!temp.contains(st)) {
				temp.add(st);
			}
		}
		return temp;

	}

// Find Unique Object
	ArrayList<Object> FindUniqueObj(ArrayList<Object> arr) {
		ArrayList<Object> temp = new ArrayList<Object>();
		for (int i = 0; i < arr.size(); i++) {
			String value = arr.get(i).toString();
			if (!temp.contains(value)) {
				temp.add(value);
			}
		}
		return temp;
	}

// Find Unique Number
	ArrayList<Integer> FindUniqueNum(ArrayList<Integer> arr) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < arr.size(); i++) {
			int value = arr.get(i);
			if (!temp.contains(value)) {
				temp.add(value);
			}
		}
		return temp;
	}

	public static void main(String[] args) {

		A31_UniqueArrayList ex = new A31_UniqueArrayList();
		String arr[] = { "Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits" };
		// Print Unique String
		ArrayList<String> getArr = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> getArray = ex.findUniqueWord(getArr);
		System.out.println(getArray);
		// Print Unique Object
		ArrayList<Object> obj = new ArrayList<>(
				Arrays.asList("Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits"));
		ArrayList<Object> getObject = ex.FindUniqueObj(obj);
		System.out.println(getObject);
		// Print Unique Number
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0));
		ArrayList<Integer> getNum = ex.FindUniqueNum(num);
		System.out.println(getNum);

	}
}