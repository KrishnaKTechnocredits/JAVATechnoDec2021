/*find the first non repeating character from given string. 
   input : technocredits
   output : h */

package anjali;

public class Anjali_Test1 {
	
	void firstnonOccurenceOfChar(String name) {
		char charIndex = ' ';
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			int count = 0;
			for (int index1 = index; index1 < name.length(); index1++) {
				if (name.charAt(index1) == ch)
					count++;
			}
			if (count == 1) {
				charIndex = name.charAt(index);
				break;
			}
		}
		System.out.println("The first Non Repeating Character in " + name + " is : " + charIndex);
	}

	public static void main(String[] args) {
		Anjali_Test1  anjali_Test1 =new Anjali_Test1 ();
		anjali_Test1.firstnonOccurenceOfChar("technocredits");

	}
}


