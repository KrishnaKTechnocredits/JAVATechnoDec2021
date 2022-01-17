/* Program 6. WAP to reverse each word and convert first letter of each word into capital
Input    : "Vrushali Sagar Shital"
Output :   "IlahsurV Ragas LatihS"
 */
package anjali.Assignment24;

public class A24_program6 {
	String revesePlusFirstletterCapitalLogic(String name) {
		A24_Program4 a24_Program4 = new A24_Program4();
		String first = a24_Program4.reverseString(name);
		A24_Program5 a24_Program5 = new A24_Program5();
		String result = a24_Program5.makeFirstletterCapital(first);
		return result;
	}

	String reversePlusFirstCpaitalWordString(String name) {
		String temp = "";
		String arr[] = name.split(" ");
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + revesePlusFirstletterCapitalLogic(arr[index]);
		}
		return temp.trim();
	}

	public static void main(String[] args) {
		A24_program6 a24_program6 = new A24_program6();
		String output = a24_program6.reversePlusFirstCpaitalWordString("Vrushali Sagar Shital");
		System.out.println(output);
	}

}
