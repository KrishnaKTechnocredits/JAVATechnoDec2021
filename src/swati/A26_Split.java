package swati;

public class A26_Split {

	public static void main(String[] args) {
		String url = "https://automationbykrishna.com/name=techno/id=123";

		String[] str = url.split("=");
		String temp = "";
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				char c = str[i].charAt(j);
				if (Character.isDigit(c)) {
					temp = temp + c;
				}
			}
		}
		System.out.println(temp);
	}

}
