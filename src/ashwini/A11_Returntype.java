package ashwini;

public class A11_Returntype {

	int getFirstOccurrence(String s1, char ch) {

		for (int i = 0; i < s1.length(); i++) {
			int output = 0;
			if (s1.charAt(i) == ch) {
				output = i;
				System.out.println("The occurrence of character : " + ch + " is " + output);
				return output;
			}
		}
		return 0;
	}

	int getLastOccurrence(String s2, char ch) {
		for (int i = s2.length() - 1; i >= 0; i--) {
			int output = 0;
			if (s2.charAt(i) == ch) {
				output = i;
				System.out.println("the last occurence of charater is : " + ch + " is " + output);
				return output;
			}

		}
		return 0;
	}

	int isCharPresent(String s3, char ch) {
		for (int i = 0; i <= s3.length() - 1; i++) {
			int output = 0;
			if (s3.charAt(i) == ch) {
				output = i;
				System.out.println("the given character " + ch + " is present at : " + output + " position");
				return output;
			}
		}
		return 0;
	}

	int totalOcuurence(String s4, char ch) {
		int c = 0;
		for (int i = 0; i < s4.length(); i++) {

			if (s4.charAt(i) == ch) {
				c++;
			}
		}
		System.out.println("total occurece of " + ch + " is " + c + " times");
		return c;
	}

	public static void main(String[] args) {
		A11_Returntype r = new A11_Returntype();
		int FOI = r.getFirstOccurrence("Ashwini", 'i');
		System.out.println(FOI);
		r.getLastOccurrence("happy", 'p');
		r.isCharPresent("suraj", 'a');
		r.totalOcuurence("Newyear", 'e');
	}
}
