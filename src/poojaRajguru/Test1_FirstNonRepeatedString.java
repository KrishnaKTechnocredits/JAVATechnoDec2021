/*Name : Pooja Rajguru
Test 1 , 25/12/2021*/

package poojaRajguru;

public class Test1_FirstNonRepeatedString {

	void findChar(String str1){
		System.out.println("The given string is: " + str1);
		for (int i = 0; i < str1.length(); i++) {
			boolean flag = true;
			for (int j = 0; j < str1.length(); j++) {
				if (i != j && str1.charAt(i) == str1.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("The first non repeated character in String is: " + str1.charAt(i));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Test1_FirstNonRepeatedString fn = new Test1_FirstNonRepeatedString();
		fn.findChar("technocredit");  
	}
}

