package nishika;

/* Program 4. WAP to reverse each word on the same index 
 * Input    : "Hi techno hello" 
 * Output : "iH onhcet olleh" 
 */

public class A_24_program4 {

	String reverse(String name) {
		String temp = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			temp = temp + ch;

		}
		return temp;
	}

	String findEachWord(String name) {
		String temp = "";
		String[] arr = name.split(" ");
		
		for (int index = 0; index <= arr.length - 1; index++) {
			temp = temp + " " + reverse(arr[index]);
		}
		return temp = temp.trim();
	}

	public static void main(String[] args) {
		A_24_program4 a_24_program4 = new A_24_program4();
		String output = a_24_program4.findEachWord("Hi techno hello");
		System.out.println(output);
	}
}
