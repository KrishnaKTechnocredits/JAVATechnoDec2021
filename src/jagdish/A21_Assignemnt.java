package jagdish;

public class A21_Assignemnt {
	String temp = "";

	void getStringInfo(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}
		}
		System.out.println("The Total count digit are:- " + temp);

	}

	public static void main(String[] args) {
		A21_Assignemnt a21 = new A21_Assignemnt();
		a21.getStringInfo("T1e34590TD1");

	}

}
