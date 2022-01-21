package poojaRajguru;

public class A26_FindIdFromUrl {
	String findIdFromUrl(String url) {
		String[] arr = url.split("id=");
		return arr[1];
	}
	public static void main(String[] arg) {
		A26_FindIdFromUrl id = new A26_FindIdFromUrl();
		String url = "http://automationbyKrishna.com/name=techno/id=123";
		String ans = id.findIdFromUrl(url);
		System.out.println("Given URL = " + url);
		System.out.println("ID = " + ans);
	}
}
