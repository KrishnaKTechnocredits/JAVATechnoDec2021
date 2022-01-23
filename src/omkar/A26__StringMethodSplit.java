package omkar;

public class A26__StringMethodSplit {
	String getIdFromString(String url) {
		String[] arrStr = url.split("id=");
		return arrStr[1];
	}
	public static void main(String[] args) {
		A26__StringMethodSplit ass26 = new A26__StringMethodSplit();
		String url = "https://automationbykrishna.com/name=techno/id=123";
		String id = ass26.getIdFromString(url);
		System.out.println("ID : " + id);
	}
}