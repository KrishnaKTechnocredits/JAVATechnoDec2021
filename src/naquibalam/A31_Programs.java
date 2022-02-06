package naquibalam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A31_Programs {
	
	ArrayList<Integer> getUniqueNumbers(ArrayList<Integer> input){
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for (int i = 0; i < input.size(); i++) {
			if (input.indexOf(input.get(i)) == input.lastIndexOf(input.get(i))) {
				outputList.add(input.get(i));
			}else if (!outputList.contains(input.get(i))) {
				outputList.add(input.get(i));
			}
		}
		return outputList;	
	}
	
	ArrayList<String> getUniqueStrings(ArrayList<String> input){
		ArrayList<String> outputList = new ArrayList<String>();
		for (int i = 0; i < input.size(); i++) {
			if (input.indexOf(input.get(i)) == input.lastIndexOf(input.get(i))) {
				outputList.add(input.get(i));
			}else if (!outputList.contains(input.get(i))) {
				outputList.add(input.get(i));
			}
		}
		return outputList;	
	}
	
	ArrayList<Object> getUniqueAny(ArrayList<Object> input){
		ArrayList<Object> outputList = new ArrayList<Object>();
		for (int i = 0; i < input.size(); i++) {
			if (input.indexOf(input.get(i)) == input.lastIndexOf(input.get(i))) {
				outputList.add(input.get(i));
			}else if (!outputList.contains(input.get(i))) {
				outputList.add(input.get(i));
			}
		}
		return outputList;	
	}

	public static void main(String[] args) {
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
		arraylist1.add(19);
		arraylist1.add(8);
		arraylist1.add(0);
		arraylist1.add(8);
		arraylist1.add(60);
		arraylist1.add(56);
		arraylist1.add(97);
		arraylist1.add(0);
		arraylist1.add(33);
		arraylist1.add(60);
		arraylist1.add(0);
		
		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("Techno");
		arraylist2.add("Credits");
		arraylist2.add("Techno");
		arraylist2.add("TechnoCredits");
		arraylist2.add("Credits");
		arraylist2.add("TechnoCredits");
		
		ArrayList<Object> arraylist3 = new ArrayList<>();
		arraylist3.add("Techno");
		arraylist3.add(16);
		arraylist3.add("Credits");
		arraylist3.add(19);
		arraylist3.add("Techno");
		arraylist3.add(2);
		arraylist3.add(19);
		arraylist3.add("Credits");
		arraylist3.add(16);
		arraylist3.add("TechnoCredits");
		
		A31_Programs a31_Programs = new A31_Programs();
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Return an ArrayList of unique elements from a given input ArrayList");
		System.out.println(arraylist1);
		System.out.println(a31_Programs.getUniqueNumbers(arraylist1));
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Return an ArrayList of unique elements from a given input ArrayList");
		System.out.println(arraylist2);
		System.out.println(a31_Programs.getUniqueStrings(arraylist2));
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Return an ArrayList of unique elements from a given input ArrayList");
		System.out.println(arraylist3);
		System.out.println(a31_Programs.getUniqueAny(arraylist3));
		System.out.println("---------------------------------------------------------------------------");
	}
}
