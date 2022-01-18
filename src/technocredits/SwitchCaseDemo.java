package technocredits;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		int dayIndex = 1;
		getDayNameFromIndex(dayIndex);
	}

	static void getDayNameFromIndex(int index) {
		switch (index) {
		case 0:
			System.out.println("sun");
			System.out.println("weekend");
			break;
		case 1:
			System.out.println("mon");
			break;
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		default:
			System.out.println("In default");
			break;
		}
	}

	void charSwitchCase(char ch) {
		switch (ch) {
		case 'a':
			break;
		case 'e':
			break;
		}
	}

	void choseBrowser(String brower) {
		switch (brower) {
		case "Chrome":
			System.out.println("chrome");
			break;
		case "firefox":
			break;
		}
	}
}
