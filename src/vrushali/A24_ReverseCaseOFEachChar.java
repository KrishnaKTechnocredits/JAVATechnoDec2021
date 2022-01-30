/*7. WAP to reverse the case of each char in a given word
Input    : "TeCHnoC*
Output : tEchNOc
 */

package vrushali;

public class A24_ReverseCaseOFEachChar {

	void reverseCaseOfEachChar(String name) {
		String str = ""; 
		for(int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if(Character.isUpperCase(ch)) {
				str+= Character.toLowerCase(ch);
			} else 
				str+= Character.toUpperCase(ch);
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		A24_ReverseCaseOFEachChar reverseCaseOFEachChar = new A24_ReverseCaseOFEachChar();
		reverseCaseOFEachChar.reverseCaseOfEachChar("TeCHnoC");
	}
}


