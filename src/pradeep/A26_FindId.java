package pradeep;

public class A26_FindId {

	String findId(String url) {
		String[] arr = url.split("id=");
		return arr[1].trim();
	}

	public static void main(String[] args) {
		A26_FindId a26_FindId = new A26_FindId();
		String url = "https://automationbykrishna.com/name=techno/id=123";
		String idString = a26_FindId.findId(url);
		int id = Integer.parseInt(idString);
		System.out.println("ID: " + id);
	}
}
