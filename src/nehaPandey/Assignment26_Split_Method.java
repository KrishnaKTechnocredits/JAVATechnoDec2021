package nehaPandey;

public class Assignment26_Split_Method {
	void findOutValueOfId(String url) {
		String str[] = url.split("id=");

		System.out.println("The value of id from the given input url is : " + str[1]);

	}

	public static void main(String[] args) {
		Assignment26_Split_Method splitmethod = new Assignment26_Split_Method();
		splitmethod.findOutValueOfId("https://automationbykrishna.com/name=techno/id=123");
	}

}
