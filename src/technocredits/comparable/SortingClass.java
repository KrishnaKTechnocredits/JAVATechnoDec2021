package technocredits.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortingClass {

	public static void main(String[] args) {
//		List<String> list = new ArrayList();
//		list.add("Dharam");
//		list.add("Megha");
//		list.add("Anjali");
//		list.add("Prajkta");
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);

		List<Student> sList = new ArrayList();
		sList.add(new Student(1, "suraj", 25));
		sList.add(new Student(3, "pallavi", 30));
		sList.add(new Student(5, "anvit", 22));
		sList.add(new Student(8, "nasir", 23));

		System.out.println(sList);
		Collections.sort(sList, new StudentNameComparator());
		Collections.sort(sList, new StudentAgeComparator());
		Collections.sort(sList, new StudentRollComparator());
		System.out.println(sList);

//		TreeSet ts = new TreeSet();
//		ts.add("Dharam");
//		ts.add("Megha");
//		ts.add("Anjali");
//		ts.add("Prajkta");
//		ts.add(true);
//		System.out.println(ts);

//		String s1 = "abc";//97
//		String s2 = "ABC";//65
//		System.out.println(s1.compareTo(s2));

	}
}
