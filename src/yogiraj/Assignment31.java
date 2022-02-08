package yogiraj;

import java.util.ArrayList;

public class Assignment31 {
	ArrayList list = new ArrayList();

	public ArrayList uniqueElements(ArrayList al) {
		for (int i = 0; i < al.size(); i++) {
			if (al.indexOf(al.get(i)) == al.lastIndexOf(al.get(i))) {
				list.add(al.get(i));

			}
		}
		return list;
	}

	public static <E> void main(String[] args) {
		int[] array = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };

		ArrayList input = new ArrayList<>();

		ArrayList list = new ArrayList();

		Assignment31 a = new Assignment31();

		for (int i : array) {
			input.add(i);
		}

		list = a.uniqueElements(input);

		System.out.println("Array list with unique elements \n \n" + list);
	}

}
