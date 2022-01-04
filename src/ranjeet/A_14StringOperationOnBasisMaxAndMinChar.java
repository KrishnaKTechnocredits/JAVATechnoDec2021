package ranjeet;

public class A_14StringOperationOnBasisMaxAndMinChar {
	String dup = "";
	String uni = "";

	int getDuplicateCharCount(String str) {
		int duplicatCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == str.indexOf(ch)) {
				if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
					System.out.println(str.charAt(i));
					duplicatCount++;
				}
			}
		}
		return duplicatCount;
	}

	int getUniqueCharCount(String str) {
		int uniqueCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				System.out.println(str.charAt(i));
				uniqueCount++;
			}
		}
		return uniqueCount;
	}

	public static void main(String[] args) {
		A_14StringOperationOnBasisMaxAndMinChar a = new A_14StringOperationOnBasisMaxAndMinChar();
		int dCount = a.getDuplicateCharCount("abcdabc");
		int uCount = a.getUniqueCharCount("abcdabc");
		System.out.println("Duplicate count " + dCount);
		System.out.println("Unique count " + uCount);
		if (dCount < uCount) {
			System.out.println("Selenium");
		} else
			System.out.println("Java");

	}
}