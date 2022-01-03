package yogiraj;

public class Assignment14 {
	int uniqueCount = 0, count = 0;

	public void countOccurance(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
				count++;
			} else {
				uniqueCount++;
			}
		}
		if (count > uniqueCount) {
			System.out.println("Java");
		} else {
			System.out.println("Selenium");
		}
	}

	public static void main(String[] args) {
		Assignment14 a = new Assignment14();

		a.countOccurance("technocredits");
	}
}
