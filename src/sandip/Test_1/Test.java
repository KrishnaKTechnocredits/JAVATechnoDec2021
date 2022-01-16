package sandip.Test_1;

public class Program2 {
	int count;
	char store;

	void nonRepeatingChar(String input) {
		for (int index = 0; index < input.length() - 1; index++) {
			count = 1;
			store = input.charAt(index);
			for (int index1 = index + 1; index1 < input.length() - 1; index1++) {
				if (store == input.charAt(index1)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("Only occurance : " + store);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Program2 nonrep = new Program2();
		nonrep.nonRepeatingChar("technocredits");
	}
}
