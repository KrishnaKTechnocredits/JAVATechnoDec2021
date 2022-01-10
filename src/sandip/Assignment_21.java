package sandip;

public class Assignment_21 {

	String temp = "";

	String characterFromString(String s1) {
		for (int index = 0; index < s1.length(); index++) {
			char ch = s1.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch; // temp=temp+ch
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		Assignment_21 a1 = new Assignment_21();
		System.out.println(a1.characterFromString("Tec123hno456credits"));
	}
}
