/* WAP to find total words in given string and print exact word with it's length
 input=>Hi Hello
 output=>total 2 words
 Hi=>2
 Hello=>5
  */
package anjali.Assignment24;

public class A24_Program1 {

	void findNoOFWordInString(String name) {
		String[] arr = name.split(" ");
		int StringLength = arr.length;
		System.out.println("total " + StringLength + " words");
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index] + "=>" + arr[index].length());
		}

	}

	public static void main(String[] args) {
		A24_Program1 a24_Program1 = new A24_Program1();
		a24_Program1.findNoOFWordInString("Hi Hello");
	}

}
