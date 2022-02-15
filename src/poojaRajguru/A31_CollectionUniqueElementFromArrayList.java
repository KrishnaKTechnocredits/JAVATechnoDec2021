package poojaRajguru;

/*Finding Unique Elements Using IndexOf() and LastIndexOf()*/
import java.util.ArrayList;

public class A31_CollectionUniqueElementFromArrayList {

	ArrayList<Object> uniqueElements(ArrayList<Object> list) {
		ArrayList<Object> output = new ArrayList<Object>();
		for (int index = 0; index < list.size(); index++) {
			Object element = list.get(index);  // to get the content
			if (list.indexOf(element) == list.lastIndexOf(element)) {
				output.add(element);
			} else if (!output.contains(element)) {
				output.add(element);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		A31_CollectionUniqueElementFromArrayList al = new A31_CollectionUniqueElementFromArrayList();
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(19);
		list.add(8);
		list.add(0);
		list.add(60);
		list.add(56);
		list.add(97);
		list.add(0);
		list.add(33);
		list.add(60);
		list.add(0);
		System.out.println("Input List : " + list);
		ArrayList<Object> ArrayList1 = new ArrayList<Object>();
		ArrayList1 = al.uniqueElements(list);
		System.out.println("Output List : " + ArrayList1);
		System.out.println();
		ArrayList<Object> list1 = new ArrayList<Object>();
		list1.add("Techno");
		list1.add("Credits");
		list1.add("Techno");
		list1.add("TechnoCredits");
		list1.add("Credits");
		list1.add("TechnoCredits");
		System.out.println("Input List : " + list1);
		ArrayList<Object> ArrayList2 = new ArrayList<Object>();
		ArrayList2 = al.uniqueElements(list1);
		System.out.println("Output List : " + ArrayList2);
		System.out.println();
		ArrayList<Object> list2 = new ArrayList<Object>();
		list2.add("Techno");
		list2.add(6);
		list2.add("Credits");
		list2.add(19);
		list2.add("Techno");
		list2.add(2);
		list2.add(19);
		list2.add("Credits");
		list2.add(16);
		list2.add("TEchnoCredits");
		System.out.println("Input List : " + list2);
		ArrayList<Object> ArrayList3 = new ArrayList<Object>();
		ArrayList3 = al.uniqueElements(list2);
		System.out.println("Output List : " + ArrayList3);
	}
}
