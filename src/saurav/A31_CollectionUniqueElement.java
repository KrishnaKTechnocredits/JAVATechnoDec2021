package saurav;

import java.util.ArrayList;

public class A31_CollectionUniqueElement {

	ArrayList<Object> getUniqueElements(ArrayList<Object> input) {
		ArrayList<Object> elements = new ArrayList<Object>();
		for (int index = 0; index < input.size(); index++) {
			Object getElement = input.get(index);
			if (input.indexOf(getElement) == input.lastIndexOf(getElement)) {
				elements.add(getElement);
			} else if (!elements.contains(getElement)) {
				elements.add(getElement);
			}
		}
		return elements;
	}

	public static void main(String[] args) {
		A31_CollectionUniqueElement assignment31 = new A31_CollectionUniqueElement();
		ArrayList<Object> input1 = new ArrayList<Object>();
		input1.add(19);
		input1.add(8);
		input1.add(0);
		input1.add(8);
		input1.add(60);
		input1.add(56);
		input1.add(97);
		input1.add(0);
		input1.add(33);
		input1.add(60);
		input1.add(0);
		System.out.println("Input =" + input1);
		ArrayList<Object> output1 = assignment31.getUniqueElements(input1);
		System.out.println("Output =" + output1);
		System.out.println();
		ArrayList<Object> input2 = new ArrayList<Object>();
		input2.add("Techno");
		input2.add("Credits");
		input2.add("Techno");
		input2.add("TechnoCredits");
		input2.add("Credits");
		input2.add("TechnoCredits");
		System.out.println("Input =" + input2);
		ArrayList<Object> output2 = assignment31.getUniqueElements(input2);
		System.out.println("Output =" + output2);
		System.out.println();
		ArrayList<Object> input3 = new ArrayList<Object>();
		input3.add("Techno");
		input3.add(16);
		input3.add("Credits");
		input3.add(19);
		input3.add("Techno");
		input3.add(2);
		input3.add(19);
		input3.add("Credits");
		input3.add(16);
		input3.add("TechnoCredits");
		System.out.println("Input =" + input3);
		ArrayList<Object> output3 = assignment31.getUniqueElements(input3);
		System.out.println("Output =" + output3);
	}
}
