package gauravk.Programs47;
import java.util.HashMap;
import java.util.Map;
/*
 * 4. Write a program which find maximum repeating character from the string
i/p : technocreditst
o/p : t (analyzed)

 */
public class MaxRepeatingCharFrmString {
	
	void maxRepeatingCharFrmString(String str) {
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(char c : ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else hm.put(c, 1);
		}
		System.out.println(hm);
		int count=1;
		char ans = ' ';
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if((entry.getValue())>count){
				count = entry.getValue();
				ans = entry.getKey();
			}
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		String s = "technocreditst";
		MaxRepeatingCharFrmString mx = new MaxRepeatingCharFrmString();
		mx.maxRepeatingCharFrmString(s);
	}
}
