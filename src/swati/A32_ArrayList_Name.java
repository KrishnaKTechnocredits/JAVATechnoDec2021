package swati;

import java.util.ArrayList;
import java.util.Arrays;

public class A32_ArrayList_Name {
	void getNonRepeatName(ArrayList<String> arr) {
		ArrayList<String> temp = new ArrayList<String>();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
				temp.add(arr.get(i));
			}
		}
		System.out.println(temp);
	}

	void getUnion(ArrayList<String> arr) {
		ArrayList<String> temp = new ArrayList<String>();
		for (int i = 0; i < arr.size(); i++) {
			if (!temp.contains(arr.get(i))) {
				temp.add(arr.get(i));
			}
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		A32_ArrayList_Name a32 = new A32_ArrayList_Name();
		ArrayList<String> findName = new ArrayList<String>(Arrays.asList(names));
		a32.getNonRepeatName(findName);
		// Print union
		String[] arr = { "Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav" };
		ArrayList<String> arrName = new ArrayList<String>(Arrays.asList(arr));
		a32.getUnion(arrName);
	}

}
