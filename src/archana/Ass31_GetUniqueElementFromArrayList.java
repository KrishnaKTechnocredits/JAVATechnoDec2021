package archana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ass31_GetUniqueElementFromArrayList {

	ArrayList GetUniqEleFromArrayList(ArrayList al) {

		for (int index = 0; index < al.size(); index++) {
			if (al.indexOf(al.get(index)) != (al.lastIndexOf(al.get(index)))) {
				al.remove(al.get(index));
			}
		}
		return al;
	}

	public static void main(String[] args) {
		Ass31_GetUniqueElementFromArrayList ass31 = new Ass31_GetUniqueElementFromArrayList();
		ArrayList al = new ArrayList(Arrays.asList(19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0));
		System.out.println("I/P: " + al);
		ArrayList ans = ass31.GetUniqEleFromArrayList(al);
		System.out.println("O/P: " + al);
		System.out.println("-----------------------------------------------------------------");
		al = new ArrayList(Arrays.asList("Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"));
		System.out.println("I/P: " + al);
		ans = ass31.GetUniqEleFromArrayList(al);
		System.out.println("O/P: " + al);
		System.out.println("------------------------------------------------------------------");
		al = new ArrayList(Arrays.asList("Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits"));
		System.out.println("I/P: " + al);
		ans = ass31.GetUniqEleFromArrayList(al);
		System.out.println("O/P: " + al);

	}

}
