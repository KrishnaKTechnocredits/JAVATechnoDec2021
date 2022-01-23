package megha;

public class Megha_Assignment26 {

	void findIDFromGivenUrl(String input) {
		String[] arr = input.split("id=");
		System.out.println("The output is : " + arr[1]);

	}

	public static void main(String[] args) {
		Megha_Assignment26 megha_Assignment = new Megha_Assignment26();
		megha_Assignment.findIDFromGivenUrl("https://automationbykrishna.com/name=techno/id=123");

	}

}
