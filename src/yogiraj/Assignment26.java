package yogiraj;

public class Assignment26 {
	String findStringFromUrl() {
		String[] output = null;

		String url = "https://automationbykrishna.com/name=techno/id=123";

		output = url.split("id=");

		return output[1];
	}

	public static void main(String[] args) {
		Assignment26 a = new Assignment26();

		String valueOfID = a.findStringFromUrl();

		System.out.println("Value of ID is  " + valueOfID);
	}

}
