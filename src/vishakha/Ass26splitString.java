package vishakha;

public class Ass26splitString {
	void splitString(String url) {
		String[] spilt = url.split("id=");
		System.out.println(spilt[1]);
		}
	public static void main(String[] args) {
		Ass26splitString a26 = new Ass26splitString();
		a26.splitString("https://automationbykrishna.com/name=techno/id=123");
	}
}
