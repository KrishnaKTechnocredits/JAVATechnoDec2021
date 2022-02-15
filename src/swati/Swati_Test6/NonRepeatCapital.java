package swati.Swati_Test6;

public class NonRepeatCapital {
	static char nonRepeat(String name) {
		char ch = 0;
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (name.indexOf(c) == name.lastIndexOf(c) && Character.isUpperCase(c)) {
				ch = c;
				break;
			}
		}
		return ch;
	}

	public static void main(String[] args) {

		String name = "tEChNoCrEdits";
		char ch = nonRepeat(name);
		System.out.println("First Non Repeating Capital " + ch);
	}

}
