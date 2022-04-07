package gauravk.Programs47;
/*
 *  Compare two strings without using equals/equalsIgnoreCase method
 */
public class CompareStringWithoutMethods {
	
	void comparisionOfStrings(String str1, String str2) {
		if(str1.length()==str2.length()) {
			System.out.println(str1.contentEquals(str2));
//			System.out.println(str1.equals(str2));
//			System.out.println(str1.equalsIgnoreCase(str2));
		}
	}
	
	public static void main(String[] args) {
		String s1 = "Hi Hello";
		String s2 = "Hi Hello";
		String s3 = "Hello Hi";
		CompareStringWithoutMethods c1 = new CompareStringWithoutMethods();
		c1.comparisionOfStrings(s1, s2);
		c1.comparisionOfStrings(s2, s3);
		c1.comparisionOfStrings(s3, s1);
	}
}