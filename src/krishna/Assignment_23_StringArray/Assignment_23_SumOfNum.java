package krishna.Assignment_23_StringArray;

public class Assignment_23_SumOfNum {

	void findNum(String str) {
		String temp = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp += ch;
			} else if (temp.length() > 0) {
				sum += Integer.parseInt(temp);
				temp = "";
			}
		}
		if (!temp.equals("")) {
			sum += Integer.parseInt(temp);
		}
		System.out.println("The sum of Number is : " + sum);
	}

	void arrangeString(String str1) {
		String tempLc = "";
		String tempUc = "";
		String tempD = "";
		String tempS = "";
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (Character.isLowerCase(ch)) {
				tempLc += ch;
			} else if (Character.isUpperCase(ch)) {
				tempUc += ch;
			} else if (Character.isDigit(ch)) {
				tempD += ch;
			} else
				tempS += ch;
		}
		System.out.println("The arranged String are : " + tempLc + tempUc + tempD + tempS);
	}

	int diff_sumOdd_Even(String str2) {
		String temp = "";
		int collect = 0;
		int collect1 = 0;
		int sum = 0;
		int D = 0;
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			if (Character.isDigit(ch)) {
				temp += ch;
				sum = Integer.parseInt(temp);

			} else if (temp.length() > 0) {
				sum += Integer.parseInt(temp);
				temp = "";
			}

			if (!temp.equals("")) {
				if (sum % 2 == 0) {
					collect += sum;
				} else if (sum % 2 != 0) {
					collect1 += sum;
				}
			}
		}
		//D = collect1 - collect;
		//System.out.println("Difference between odd and even digits from given string : " + D);
		return collect1 - collect;
	}

	int diff_sumEven_Odd(String str3) {
		String temp = "";
		int odd = 0;
		int even = 0;
		for (int index = 0; index < str3.length(); index++) {
			char ch = str3.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			if ((Character.isLetter(ch) && !temp.isEmpty()) || index == str3.length() - 1) {
				int n = Integer.parseInt(temp);
				if (n % 2 == 0)
					even += n;
				else
					odd += n;
				temp = "";
			}
		}
		return even - odd;
	}

	public static void main(String[] args) {
		Assignment_23_SumOfNum ass23 = new Assignment_23_SumOfNum();
		ass23.findNum("tE12cH22nOcRe3dItS4");
		ass23.arrangeString("te4c&Hno7CreD-8i*ts");
		String str2 ="tec5hno3cre6di1ts";
		System.out.println("The difference between odd and even digits from given string : " +ass23.diff_sumOdd_Even(str2));
		String str3 = "te112ch34no29";
		System.out.println("The difference between even and odd numbers from given string :" + ass23.diff_sumEven_Odd(str3));
	}
}
