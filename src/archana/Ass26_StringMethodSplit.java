package archana;

public class Ass26_StringMethodSplit {
	String getIdFromString(String url) {
		String[] arrStr = url.split("id=");
		return arrStr[1];
	}
	public static void main(String[] args) {
		Ass26_StringMethodSplit ass26 = new Ass26_StringMethodSplit();
		String url = "https://automationbykrishna.com/name=techno/id=123";
		String id = ass26.getIdFromString(url);
		System.out.println("ID : " + id);
	}
}
