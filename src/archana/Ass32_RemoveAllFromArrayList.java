package archana;

import java.util.ArrayList;
import java.util.Arrays;

public class Ass32_RemoveAllFromArrayList {
	int count = 0;

	public void removeAlloccurancs(ArrayList<Object> al) {

		ArrayList<Object> al1 = new ArrayList<Object>();
		for (int i = 0; i < al.size(); i++) {
			if (al.indexOf(al.get(i)) == al.lastIndexOf(al.get(i)))
				al1.add(al.get(i));
		}

		System.out.println("Print All Name only once  : " + al1);

		for (int i = 0; i < al.size(); i++) {
			if (al.indexOf(al.get(i)) != al.lastIndexOf(al.get(i)))
				al.remove(al.get(i));
		}
		System.out.println("All names atleast once  : " + al);

	}

	public static void main(String[] args) {
		Ass32_RemoveAllFromArrayList obj = new Ass32_RemoveAllFromArrayList();
		ArrayList<Object> al = new ArrayList<Object>(
				Arrays.asList("Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"));
		obj.removeAlloccurancs(al);

		System.out.println("--------------------------------------------------- ");
		al = new ArrayList<Object>(Arrays.asList("Vaibhav", "Amruta", "Shivangi", "Pooja", "Amruta", "Vaibhav"));
		obj.removeAlloccurancs(al);
	}
}
