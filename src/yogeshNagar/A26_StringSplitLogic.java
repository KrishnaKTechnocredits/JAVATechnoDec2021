package yogeshNagar;

public class A26_StringSplitLogic {

	void getStringVlueFromURL(String str) {
		String[] splittedStr = str.split("/");
		for (int index = 0; index < splittedStr.length; index++) {
			if (splittedStr[index].contains("id=")) {
				System.out.println(splittedStr[index].substring(3));
			}
		}
	}

	public static void main(String[] args) {
		A26_StringSplitLogic strSplitLog = new A26_StringSplitLogic();
		strSplitLog.getStringVlueFromURL("https://automationbykrishna.com/name=techno/id=123");
	}
}