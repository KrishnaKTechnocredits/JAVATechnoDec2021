package krishna.Assignment24;

public class Assignment24_SetFirstCharCaps {

	String reverseDataWithFirstCaps(String str) {
		String revString = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == 0)
				ch = Character.toUpperCase(ch);
			revString += ch;
		}
		return revString;

	}

	void spiltWord(String str) {
		String[] data = str.split(" ");
		String col = "";
		for (int index = 0; index < data.length; index++) {
			col = col + " " + reverseDataWithFirstCaps(data[index]);
		}
		System.out.println(col.trim());
	}

	public static void main(String[] args) {
		Assignment24_SetFirstCharCaps ass24 = new Assignment24_SetFirstCharCaps();
		ass24.spiltWord("anvit harsh dipali");
	}

}
