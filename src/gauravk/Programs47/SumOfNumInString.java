package gauravk.Programs47;
/*
 * 29.Write a program which do sum of given string
i/p : h2n9fpn2qk2
o/p : 15
 */
public class SumOfNumInString {

	int sumOfNums(String str) {
		char[] ch = str.toCharArray();
		String num = "0";
		int total = 0;
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i]))
				num += String.valueOf(ch[i]);
			else {
				total += Integer.parseInt(num);
				num = "0";
			}
		}
		// if(num.length()>0)
		// total += Integer.parseInt(num);
		total = num.length() > 0 ? total += Integer.parseInt(num) : total;
		return total;
	}

	public static void main(String[] args) {
		String s1 = "h2n9fpn2qk2";
		String s2 = "20fp1000n20ks5jd";
		SumOfNumInString sumObj = new SumOfNumInString();
		System.out.println("sum of given string: '" + s1 + "'\nOutput: " + sumObj.sumOfNums(s1));
		System.out.println("sum of given string: '" + s2 + "'\nOutput: " + sumObj.sumOfNums(s2));
	}
}
//VVIMP