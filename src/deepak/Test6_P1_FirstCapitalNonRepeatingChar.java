// Test 6 Program 2 - Time Taken- 09 mins
package deepak;

public class Test6_P1_FirstCapitalNonRepeatingChar {
	
	char firstNonRepeatingCapital(String input){
		char outputCh = ' ';	
		for(int index =0 ; index < input.length() ; index++){
				//tEChNoCrEdits
				char ch = input.charAt(index);
				if(input.indexOf(ch) == input.lastIndexOf(ch)){
					if(Character.isUpperCase(ch)){
						//System.out.println(ch);
						outputCh = ch;
						break;
					}
				}
			}
		return outputCh;
		}

	public static void main(String[] args) {
		Test6_P1_FirstCapitalNonRepeatingChar firstChar = new Test6_P1_FirstCapitalNonRepeatingChar();
		System.out.print("First Non Repeating Capital Character is: ");
		System.out.println(firstChar.firstNonRepeatingCapital("tEChNoCrEdits"));

	}

}
