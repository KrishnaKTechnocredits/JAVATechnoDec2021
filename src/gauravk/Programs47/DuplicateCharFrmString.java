package gauravk.Programs47;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 1. Write a program that finds duplicate characters in strings
i/p : technocredits
o/p : tec

 */
public class DuplicateCharFrmString {
	
	void findDuplicateChar(String str) {
		char[] ch = str.toCharArray();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for(char c : ch) {
			if(lhm.containsKey(c)) {
				lhm.put(c, lhm.get(c)+1);
			}else lhm.put(c, 1);
		}
		System.out.println(lhm);
		String ans = "";
		for(Map.Entry<Character, Integer> entry : lhm.entrySet()) {
			if(entry.getValue()>1) {
				ans += entry.getKey();
			}
		}
		System.out.println(ans);
	}
	
	void findDuplicateCharV2(String str) {
		String ans ="";
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i)) && !ans.contains(String.valueOf(str.charAt(i)))) {
				ans = ans + str.charAt(i);
			}
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		String s = "technocredits";
		DuplicateCharFrmString dc = new DuplicateCharFrmString();
		dc.findDuplicateChar(s);
		System.out.println("********");
		dc.findDuplicateCharV2(s);
	}
}
