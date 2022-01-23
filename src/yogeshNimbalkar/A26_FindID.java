package yogeshNimbalkar;

public class A26_FindID {

	public static void main(String[] args) {
		String url = "https://automationbykrishna.com/name=techno/id=123";
		String[] arr = url.split("id=");
		String id = arr[arr.length-1];
		System.out.println("ID = " + id);
	}
}
