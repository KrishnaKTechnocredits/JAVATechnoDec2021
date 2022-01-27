package sandip.Test_4;

public class Program_2 {

	void splitWords(String input) {
		boolean flag1 = false;
		String[] s1 = input.split(" ");
		for (int index = 0; index < s1.length; index++) {
			flag1 = isPrimeNumber(s1[index]);
			if (flag1 == true) {
				System.out.print(" " + s1[index]);
			}
		}
	}

	boolean isPrimeNumber(String input) {
		boolean flag = true;
		int l = input.length();
		if (l == 1) {
			return false;
		}
		for (int index = 2; index < l; index++) {
			if ((l % index) == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Program_2 p2 = new Program_2();
		p2.splitWords("I love my India");
		System.out.println();
		p2.splitWords("I would like to have a cup of tea");
	}
}
