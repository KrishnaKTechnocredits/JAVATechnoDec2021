package krishna.Assignment24;

public class Assignment24_AtIndexReverseWord {
	void spiltWord(String str) {
		String[] data = str.split(" ");
		String col = "";
		for (int index = 0; index < data.length; index++) {
			col = col + " " + reverseString(data[index]);
		}
		System.out.println(col.trim());
	}
	
	String reverseString(String provide) {
		String revString = "";
		for (int index = provide.length() - 1; index >= 0; index--) {
			char ch = provide.charAt(index);
			revString += ch;
		}
		return revString;
	}
	
	 
	public static void main(String[] args) {
		Assignment24_AtIndexReverseWord ass24 = new Assignment24_AtIndexReverseWord();
		ass24.spiltWord("Hi techno hello");
	}
	
}
