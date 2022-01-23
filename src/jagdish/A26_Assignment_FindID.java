package jagdish;

public class A26_Assignment_FindID {

	void finddigitinUrl(String id) {
		String[] arr = id.split("/");

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].contains("id="))
				System.out.println("The Output is:- " + arr[index].substring(3));
		}
	}

	public static void main(String[] args) {
		A26_Assignment_FindID c1 = new A26_Assignment_FindID();
		String input = "String url = \"https://automationbykrishna.com/name=techno/id=123";
		c1.finddigitinUrl(input);
	}

}