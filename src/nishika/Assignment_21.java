package nishika;

public class Assignment_21 {
	void stringDigit(String name) {

		String temp = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
		}

		System.out.println("given String is " + name + " -------> : " + temp);
	}

	public static void main(String[] args) {
		Assignment_21 assignment = new Assignment_21();
		assignment.stringDigit("Tech1NO3Cr5edi7ts9");
	}
}
