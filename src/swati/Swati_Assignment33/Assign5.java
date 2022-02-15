package swati.Swati_Assignment33;

import java.util.LinkedHashMap;

public class Assign5 {

	void charFreq(String name) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (map.containsKey(c)) {
				int value = map.get(c);
				map.put(c, value + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "aakanksha";
		Assign5 a5 = new Assign5();
		a5.charFreq(name);
	}

}
