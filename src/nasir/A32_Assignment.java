package nasir;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class A32_Assignment {
	
	static void findUinqueElement(String[] input) {
		LinkedHashSet<String> list = new LinkedHashSet<String>();
		for(String name:input) {
			list.add(name);
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		String[] arr = {"Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"};
		findUinqueElement(arr);
	}

}