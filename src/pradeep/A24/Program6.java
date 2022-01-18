package pradeep.A24;

public class Program6 {
	
	// 6. WAP to reverse each word and convert first letter of each word into capital
	String firstLetterCapital(String str) {
		char ch = Character.toUpperCase(str.charAt(0));
		String temp = ch + str.substring(1);
		return temp;
	}

	String getReverseWordFirstLetterCapital(String input) {
		String[] arr = input.split(" ");
		String output = "";
		String temp = "";

		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			for (int innerIndex = str.length() - 1; innerIndex >= 0; innerIndex--) {
				temp += str.charAt(innerIndex);
			}
			temp = firstLetterCapital(temp);
			output += temp + " ";
			temp = "";
		}
		return output;
	}

	public static void main(String[] args) {
		Program6 program6 = new Program6();
		String input = "Vrushali Sagar Shital";
		System.out.println("Input: " + input);
		String output = program6.getReverseWordFirstLetterCapital(input);
		System.out.println("Output: " + output);
	}
}
