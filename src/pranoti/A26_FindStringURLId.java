package pranoti;

public class A26_FindStringURLId {

	void findid(String url) {
		String[] arr = url.split("id=");
		System.out.println("Input URL : " + url);
		System.out.println("Value of ID from given URL : " + arr[1]);
	}

	public static void main(String[] args) {
		A26_FindStringURLId a26_FindStringURLId = new A26_FindStringURLId();
		a26_FindStringURLId.findid("https://automationbykrishna.com/name=techno/id=123");
	}
}
