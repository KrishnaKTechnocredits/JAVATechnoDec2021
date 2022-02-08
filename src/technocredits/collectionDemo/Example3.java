package technocredits.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Example3 {

	static ArrayList<String> printNames(ArrayList<String> names) {
		ArrayList<String> output = new ArrayList<String>();

		for (int index = 0; index < names.size(); index++) {
			String currentName = names.get(index);
			if (names.indexOf(currentName) == names.lastIndexOf(currentName))
				output.add(currentName);
		}

		return output;
	}

	static String[] printUniqueNames_Naquib() {
		String[] names = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		
		StringBuilder output = new StringBuilder();
		for (int index = 0; index < names.length; index++) {
			String currentName = names[index];
			int count = 0;
			for (int innerIndex = 0; innerIndex < names.length; innerIndex++) {
				if (currentName.equals(names[innerIndex]))
					count++;
			}
			if (count == 1) {
				System.out.println(currentName);
				output.append(names[index]).append(" ");
			}
		}
		String answer = output.toString().trim(); // "Anvit Nishika "
		
		return answer.split(" ");
	}
	
	static String[] printUniqueNames() {
		String[] names = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		String[] output = new String[names.length];
		int tempIndex = 0;
		
		for (int index = 0; index < names.length; index++) {
			String currentName = names[index];
			int count = 0;
			for (int innerIndex = 0; innerIndex < names.length; innerIndex++) {
				if (currentName.equals(names[innerIndex]))
					count++;
			}
			if (count == 1) {
				System.out.println(currentName);
				output[tempIndex] = names[index];
				tempIndex++;
			}
		}
		
		String[] finalArray = new String[tempIndex];
		for(int i=0;i<tempIndex;i++) {
			finalArray[i] = output[i];
		}
		
		return finalArray;
	}

	static ArrayList<String> printUniqueListNames() {
		String[] names = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		ArrayList<String> listOfNames = new ArrayList<String>();
		
		for (int index = 0; index < names.length; index++) {
			String currentName = names[index];
			int count = 0;
			for (int innerIndex = 0; innerIndex < names.length; innerIndex++) {
				if (currentName.equals(names[innerIndex]))
					count++;
			}
			if (count == 1) {
				System.out.println(currentName);
				listOfNames.add(names[index]);
			}
		}
		return listOfNames;
	}
	
	public static void main(String[] args) {
		 String[] output = printUniqueNames();
		 System.out.println(Arrays.toString(output));
	}
}
