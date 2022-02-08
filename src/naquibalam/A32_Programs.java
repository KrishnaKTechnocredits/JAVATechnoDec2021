package naquibalam;

import java.util.ArrayList;
import java.util.Arrays;

public class A32_Programs {

	ArrayList<String> getOnlyUniqueName(String[] input) {
		ArrayList<String> arrayListInput = new ArrayList<String>(Arrays.asList(input));
		ArrayList<String> arrayListOutput = new ArrayList<String>();
		for (int i = 0; i < arrayListInput.size(); i++) {
			String eachName = arrayListInput.get(i);
			if (arrayListInput.indexOf(eachName) == arrayListInput.lastIndexOf(eachName)) {
				arrayListOutput.add(eachName);
			}
		}
		return arrayListOutput;
	}

	ArrayList<String> getOneCopyOfName(String[] input) {
		ArrayList<String> arrayListInput = new ArrayList<String>(Arrays.asList(input));
		ArrayList<String> arrayListOutput = new ArrayList<String>();
		for (int i = 0; i < arrayListInput.size(); i++) {
			String eachName = arrayListInput.get(i);
			if (!(arrayListOutput.contains(eachName))) {
				arrayListOutput.add(eachName);
			}
		}
		return arrayListOutput;
	}
	
	public static void main(String[] args) {
		A32_Programs a32_Programs = new A32_Programs();
		String[] input1 = { "Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya" };
		String [] input2 = {"Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"};
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Input array = " + Arrays.toString(input1));
		System.out.println("Array with only unique names = " + a32_Programs.getOnlyUniqueName(input1));
		System.out.println("Array with only one copy of names = " + a32_Programs.getOneCopyOfName(input1));
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Input array = " + Arrays.toString(input2));
		System.out.println("Array with only unique names = " + a32_Programs.getOnlyUniqueName(input2));
		System.out.println("Array with only one copy of names = " + a32_Programs.getOneCopyOfName(input2));
		System.out.println("---------------------------------------------------------------------------------------------");
	}
}
