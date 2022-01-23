package anvit;

public class A24_6_Reverse_Word_CapitalChar {
	
	String reverseString(String input) {
		String str = "";
		char ch;
		for (int index = input.length() - 1; index >= 0; index--) {
			ch = input.charAt(index);
			str += ch;
		}
		return str;
	}

	void getString(String input) {
		String[] arr = input.split(" ");
		String str = "";
		for (int index = 0; index < arr.length; index++) {
			String temp = reverseString(arr[index]);
			char ch = Character.toUpperCase(temp.charAt(0));
			String s = ch + temp.substring(1);
			str = str + " " + s;
		}
		System.out.println(str.trim());
	}
	
	public static void main(String[] args) {
		A24_6_Reverse_Word_CapitalChar a24_6_Reverse_Word_CapitalChar = new A24_6_Reverse_Word_CapitalChar();
		a24_6_Reverse_Word_CapitalChar.getString("Vrushali Sagar Shital");
	}
}
