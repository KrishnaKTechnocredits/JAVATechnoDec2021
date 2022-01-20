package sagarShrikhande.arrayAndStrings;

public class A26_StringOpFindValue {

	String findIdInString(String input) {
		String[] arr = input.split("id=");
		String str = arr[arr.length - 1];
		String id = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				id = id + str.charAt(index);
			else
				break;
		}
		return id;
	}

	public static void main(String[] args) {
		String url = "https://automationbykrishna.com/name=techno/id=123/ffdjk9";
		A26_StringOpFindValue a26_StringOpFindValue = new A26_StringOpFindValue();
		System.out.println("ID is: " + a26_StringOpFindValue.findIdInString(url));
	}
}
