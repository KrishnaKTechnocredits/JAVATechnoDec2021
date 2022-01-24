package sandip;

public class Assignment_26 {

	void url(String input) {
		String[] arg = input.split("id=");
		System.out.println("ID is :" + arg[1]);
	}

	public static void main(String[] args) {
		Assignment_26 a1 = new Assignment_26();
		a1.url("https://automationbykrishna.com/name=techno/id=123");
	}
}
