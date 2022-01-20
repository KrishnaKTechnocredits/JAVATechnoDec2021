package nasir;

public class A26_FindId {
	void findIdFromGivenUrl(String input) {
		String[] output = input.split("id=");
		for (int index = 0; index < output.length; index++) {
			String ans = output[index];
			char ch = ans.charAt(index);
			if (Character.isDigit(ch))
				System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		A26_FindId findId = new A26_FindId();
		findId.findIdFromGivenUrl("https://automationbykrishna.com/name=techno/id=123");
	}
}
