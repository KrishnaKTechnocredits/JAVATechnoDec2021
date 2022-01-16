/*WAP to find  vowel in each word from the given string
Input=>aashvi technocredits
Output=>aashvi =>3
        technocredits=>4
*/package anjali.Assignment24;

public class A24_Program2 {

	void toFindNoOfVowelInString(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u')
				count++;
		}
		System.out.println(name + "=>" + count);
	}

	void covertStringToArray(String name) {
		String[] arr = name.split(" ");
		for (int index = 0; index < arr.length; index++) {
			toFindNoOfVowelInString(arr[index]);
		}
	}

	public static void main(String[] args) {
		A24_Program2 a24_Program2 = new A24_Program2();
		a24_Program2.covertStringToArray("aashvi technocredits");

	}
}
