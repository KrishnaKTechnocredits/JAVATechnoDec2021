package jagdish;

public class Exam_1_getnonRepeatingChar {
	int getnonRepeatingChar(String name, char ch) {
		int count =0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void passChar(String name) {
		for (int index = 0; index < name.length(); index++) {
			int count = getnonRepeatingChar(name, name.charAt(index));
			if (count == 1) {
				System.out.println("1st Non repating occurance is " + name.charAt(index));
			break;
		}
	}
} 
	public static void main(String[] args) {

		Exam_1_getnonRepeatingChar exam_1 = new Exam_1_getnonRepeatingChar();
		exam_1.passChar("technocredit");
	}
}