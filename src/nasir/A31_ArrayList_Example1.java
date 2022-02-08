package nasir;
import java.util.ArrayList;
import java.util.Arrays;

public class A31_ArrayList_Example1 {
	ArrayList setArrayList(ArrayList input) {
		ArrayList output = new ArrayList();
		for (int index = 0; index < input.size(); index++) {
			Object obj = input.get(index);
			//int ans = (int) obj;
			if (input.indexOf(input.get(index)) == input.lastIndexOf(input.get(index)))
				output.add(input.get(index));
			if (!output.contains(input.get(index)))
				output.add(input.get(index));
		}
		return output;
	}

	public static void main(String[] args) {
		A31_ArrayList_Example1 al = new A31_ArrayList_Example1();
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0));
		ArrayList output = al.setArrayList(input);
		System.out.println(output);
		ArrayList<String> input1=new ArrayList<String>(Arrays.asList("Techno", "Credits","Techno","Technocredits","Credits","Technocredits"));
		ArrayList output1=al.setArrayList(input1);
		System.out.println(output1);
	}
}
