package krishna.Assignment24;

public class Assignment24_VowelsCount {

	void splitWords(String provide) {
		String[] arr = provide.split(" ");
		for (int i = 0; i < arr.length; i++)
			vowelsCount(arr[i]);
	}

	void vowelsCount(String provide) {
		int count = 0;
		for (int i = 0; i < provide.length(); i++) {
			char ch = provide.charAt(i);
			if (ch == 'a' || ch == 'A' || ch == 'a' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o'
					|| ch == 'O' || ch == 'u' || ch == 'U') {
				count++;
			}
		}
		System.out.println(provide + " --=> " + count);
	}

	public static void main(String[] args) {
		Assignment24_VowelsCount ass24 = new Assignment24_VowelsCount();
		ass24.splitWords("aashvi technocredits");
	}
}
