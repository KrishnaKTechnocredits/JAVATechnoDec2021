package jayashri;

public class A26_SplitString {
	public static void main(String[] args) {
		String str = "https://automationbykrishna.com/name=techno/id=123";
		String[] splitarr = str.split("id=");
		System.out.println("Split value of URL>>Non-Id is  : " + splitarr[0]);
		System.out.println("Split value of URL>>-Id is : " + splitarr[1]);
	}
}
