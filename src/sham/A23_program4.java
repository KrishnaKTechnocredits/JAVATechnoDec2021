/*Program 4 : Find the difference between odd and even digits from given string.
input : tec5hno3cre6di1ts
output : 3
Hint : (5+3+1)-(6) = 9-6
 */
package sham;

public class A23_program4 {

	static int diffBetweenOddAndEven(String name) {
		int num = 0;
		int even = 0;
		int odd = 0;
		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index))) {
				num = Character.getNumericValue(name.charAt(index));
				if (num % 2 == 0)
					even = even + num;
				else
					odd = odd + num;
			}
		}
		int result = odd - even;
		return result;
	}

	public static void main(String[] args) {
		int result = diffBetweenOddAndEven("tec5hno3cre6di1ts");
		System.out.println("The difference between odd and even digits is : " + result);

	}

}
