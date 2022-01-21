package krishna.Assignment26;

public class Assignment_26_SplitString {

	public static void main(String[] args) {
		String str = "https://automationbykrishna.com/name=techno/id=123";
		String[] result = str.split("/id=");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] + "\n");
		}
	}
}
