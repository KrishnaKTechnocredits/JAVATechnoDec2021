package technocredits.collection.list;

import java.util.ArrayList;
import java.util.List;

//List
//1. Duplicate element allows
//2. Order maintain

/**
 * 1. add() - boolean - to add element in the list. 2. get() - Based on Generic
 * type -to get the value of any specific element using index. 3. size() - int -
 * to get the size of list. 4. contains() - boolean 5. add(index, value) 6.
 * clear() 7. indexOf() 8. set(index, value) 9. isEmpty() 10. remove(index) 11.
 * remove(value)
 */
public class ArrayListExample {

	public static void main(String[] args) {

//		String s = new String("");
//		 A a = new A();

//		int a[] = { 4, 5, 9, 3, 6, 7 };
//		int b[] = new int[100];
		List<String> list = new ArrayList<String>();
		list.add("jagdish");// 0 -1
		list.add("neha");// 1 -2 
		list.add("amruta");// 2 - 3
		list.add("saurav");// 3 - 3
		list.add("nasir");// 4-5
		list.add("archana");//5 -6 
		list.add("anjali");//6 -7 
		list.add("harsh");//7 - 8
		list.add("harsh");
		System.out.println(list);
		list.remove("harsh1");
		System.out.println(list);
//		System.out.println(list.get(1));
//		System.out.println(list.contains("Nasir"));
//		list.add(2, "hevin");
//		list.add(18,"deepak");
//		System.out.println(list);
//		list.clear();
//		System.out.println(list.indexOf("Neha"));
//		list.set(3, "megha");
//		System.out.println(list);
////		list.remove(2);
//		list.remove("harsh");
//		
//		System.out.println(list);

//		for (int index = 0; index < list.size(); index++) {
//			System.out.println(list.get(index));
//		}
		m1();
	}

	static void m1() {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(1);
		System.out.println(list);
		list.remove(10);
		list.remove(new Integer(1));
		System.out.println(list);
	}
}
