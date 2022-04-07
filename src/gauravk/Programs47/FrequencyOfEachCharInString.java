package gauravk.Programs47;
import java.awt.LinearGradientPaint;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 26.Find frequency of each char in String (the same character shouldn't be printed
twice)

 */
public class FrequencyOfEachCharInString {
	
	void frequencyOfEachChar(String str) {
		char[] ch = str.toCharArray();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		for(char c : ch) {
			if(lhm.containsKey(c)) {
				lhm.put(c, lhm.get(c)+1);
			}else
				lhm.put(c, 1);
		}
		for(Map.Entry<Character, Integer> entry : lhm.entrySet()) {
			System.out.println(entry.getKey()+" --> "+entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		String s = "DD/MM/YYYY";
		FrequencyOfEachCharInString charFreq = new FrequencyOfEachCharInString();
		charFreq.frequencyOfEachChar(s);
	}
}
