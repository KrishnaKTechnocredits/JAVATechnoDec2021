package technocredits.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {
	
	static void unionOfTwoArray(String[] input1, String[] input2) {
		List<String> list1 = Arrays.asList(input1);
		List<String> list2 = Arrays.asList(input2);
		
		ArrayList<String> l1 = new ArrayList<String>(list1);
		//ArrayList<String> l2 = new ArrayList<String>(list2);
		l1.addAll(list2);
		System.out.println(l1);
	}
	
	static void retainAllTwoArray() {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Anajali");
		al1.add("Pradeep");
		al1.add("Prajakta");
		al1.add("Sagar");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Naquib");
		al2.add("Vaibhav");
		al2.add("Sagar");
		al2.add("Yogesh");
		al2.add("Pradeep");
		
		al1.retainAll(al2);
		System.out.println(al1); // 
	}
	
	static void removeAllTwoArray() {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Anajali");
		al1.add("Pradeep");
		al1.add("Prajakta");
		al1.add("Sagar");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Naquib");
		al2.add("Vaibhav");
		al2.add("Sagar");
		al2.add("Yogesh");
		al2.add("Pradeep");
		
		al1.removeAll(al2);
		System.out.println(al1); // 
	}
	
	static void m1() {
		//ArrayList al = new ArrayList(Arrays.asList(19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0));

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Anajali");
		al1.add("Pradeep");
		al1.add("Prajakta");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Naquib");
		al2.add("Vaibhav");
		al2.add("Sagar");
		al2.add("Yogesh");
		
		System.out.println(al1);
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println("----" + al2);
	}
	
	public static void main(String[] args) {
		String[] input1 = {"Deepak","Anvit", "Anjali"};
		String[] input2 = {"Pradeep", "Tanu", "Vrushali", "Deepak"};
		
		Example4.removeAllTwoArray();
		
		/*Example4 example4 = new Example4();
		new Example4();
		m1();*/
	}
}

