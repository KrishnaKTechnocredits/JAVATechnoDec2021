package prajakta;

public class Assignment24_ReverseCharCase {
	String revCharcterCase(String data) {
		String rev = " ";
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (Character.isLowerCase(ch))
				ch = Character.toUpperCase(ch);
			else
				ch = Character.toLowerCase(ch);
			rev += ch;
		}
		return rev;
	}

	void splitWord(String found) {
		String[] arr1 = found.split(" ");
		String coll = " ";
		for (int i = 0; i < arr1.length; i++)
			coll += " " + revCharcterCase(arr1[i]);
		System.out.println(coll.trim());
	}

	public static void main(String[] args) {
		Assignment24_ReverseCharCase ass24 = new Assignment24_ReverseCharCase();
		ass24.splitWord("TeCHnoC");
	}
}