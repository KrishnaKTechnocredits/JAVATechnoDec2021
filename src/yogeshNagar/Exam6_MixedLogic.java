package yogeshNagar;
/*
 Programming Test - 6
1.  Write a method to return the first non repeating Capital character.
Input : tEChNoCrEdits
Output : N

2. Find maximum word length from a given statement.
input = "good morning technocredits hi hello";
output : technocredits

3. sum of all numbers in a given statement.
input = "10 10 20 30";
output : 70
*/

import java.util.LinkedHashMap;

public class Exam6_MixedLogic {
	void getNonRepeatingFirstCapsChar(String str) {
		char[] chArray = str.toCharArray();
		LinkedHashMap<Character,Integer> lhmap = new LinkedHashMap<Character,Integer>();
		for(char keyName:chArray) {
			if(lhmap.containsKey(keyName))
				lhmap.put(keyName, lhmap.get(keyName)+1);
			else
				lhmap.put(keyName, 1);
		}
		for(char keys:lhmap.keySet()) {
			if(Character.isUpperCase(keys) && lhmap.get(keys)==1)
				System.out.println("First non repeating Capital in "+str+" is "+keys);
		}
	}
	
	void getMaxLengthWord(String str) {
		String[] splittedStr = str.split(" ");
		int maxLength=0;
		String maxLengthStr = "";
		LinkedHashMap<String,Integer> lhmap = new LinkedHashMap<String,Integer>();
		for(String word:splittedStr) {
			lhmap.put(word, word.length());
		}
		for(String keys:lhmap.keySet()) {
			if(lhmap.get(keys)>maxLength) {
				maxLength=lhmap.get(keys);
				maxLengthStr=maxLengthStr.replace(maxLengthStr, keys);
			}
		}
		System.out.println("Maximum length word in string "+"\""+str+"\""+" is "+maxLengthStr);
	}
	
	void sumOfIntegerInString() {
		String str = "10 10 20 30";
		String[] splittedStr = str.split(" ");
		int sum=0;
		for(int index=0;index<splittedStr.length;index++) {
			sum+=Integer.parseInt(splittedStr[index]);
		}
		System.out.println("Sum of input String "+"\""+str+"\""+" is "+sum);
	}
	
	public static void main(String[] args) {
		Exam6_MixedLogic mxdLogic = new Exam6_MixedLogic();
		System.out.println("----Programme 1----");
		mxdLogic.getNonRepeatingFirstCapsChar("tEChNoCrEdits");
		System.out.println();
		System.out.println("----Programme 2----");
		mxdLogic.getMaxLengthWord("good morning technocredits hi hello");
		System.out.println();
		System.out.println("----Programme 3----");
		mxdLogic.sumOfIntegerInString();
	}
}