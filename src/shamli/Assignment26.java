package shamli;

public class Assignment26 {

	void findIDFromGivenUrl(String input) {
		String[] arr = input.split("id=");
		System.out.println("The output is : " + arr[1]);

	}

	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		assignment26.findIDFromGivenUrl("https://automationbykrishna.com/name=techno/id=123");

	}
}
