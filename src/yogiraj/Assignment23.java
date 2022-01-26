package yogiraj;

import java.util.Arrays;

public class Assignment23 {

	public void findSecindMax() {
		int[] arr = { 1, 11, 3, 99, 66, 54, 22, 44 };

		Arrays.sort(arr);

		for (int i : arr) {
			System.out.println("Second Max item in the array is " + arr[arr.length - 2] + "\n");
			break;
		}
	}

	public void findSum() {
		String temp = "0";

		String s = "te12ch22nocre3dits4";

		int sum = 0;

		char ch;

		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);

			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}

			else {
				sum = sum + Integer.parseInt(temp);

				temp = "0";
			}
		}

		sum = sum + Integer.parseInt(temp);

		System.out.println("Sum of all digits in the given String is " + sum + "\n");
	}

	public void sortString() {
		String s = "te4c&Hno7CreD-8i*ts";

		// output : tecnoreits478HCD&-*

		String sortedString = "";

		for (int i = 0; i <= 4; i++) {
			switch (i) {
			case 1:
				for (int j = 0; j < s.length(); j++) {
					if (Character.isLowerCase(s.charAt(j))) {
						sortedString += s.charAt(j);
						}
				}
				break;

			case 2:

				for (int j = 0; j < s.length(); j++) {
					if (Character.isDigit(s.charAt(j))) {
						sortedString += s.charAt(j);
					}
				}
				break;

			case 3:

				for (int j = 0; j < s.length(); j++) {
					if (Character.isUpperCase(s.charAt(j))) {
						sortedString += s.charAt(j);
					}
				}
				break;

			case 4:

				for (int j = 0; j < s.length(); j++) {
					if (!(Character.isDigit(s.charAt(j))) && !(Character.isAlphabetic(s.charAt(j)))) {
						sortedString += s.charAt(j);
					}
				}
				System.out.println("The sorted String is " + sortedString + "\n");
				break;
			}

		}
	}

	public void oddEvenDifference() {
		String input = "te112ch34no29";

		int even = 0, odd = 0;

		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				int temp = 0;

				temp = Integer.parseInt(String.valueOf(input.charAt(i)));

				if (temp % 2 == 0) {
					even += temp;
				} else {
					odd += temp;
				}
			}
		}

		if (even < odd) {
			System.out.println("Difference even odd  " + (odd - even) + "\n");
		} else {
			System.out.println(" Difference of even odd " + (even - odd) + "\n");

		}
	}

	public void oddEvenDifference(String input) {
		String temp = "0";

		int sum = 0, even = 0, odd = 0;

		char ch;

		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);

			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}

			else {
				sum = sum + Integer.parseInt(temp);

				if (sum % 2 == 0) {
					even = even + sum;
				}

				else {
					odd = odd + sum;
				}
				temp = "0";

				sum = 0;
			}
		}

		sum = 0;
		sum = sum + Integer.parseInt(temp);

		if (sum % 2 == 0) {
			even = even + sum;
		}

		else {
			odd = odd + sum;
		}

		System.out.println("Difference between even and odd  " + (even - odd) + " \n ");
	}

	public void sortString(String s) {
		
		String sortedString = "";

		for (int i = 0; i <= 4; i++) {

			switch (i) {
			case 1:
				for (int j = 0; j < s.length(); j++) {
					if (Character.isDigit(s.charAt(j)) && !((Integer.parseInt(s.valueOf(s.charAt(j))) % 2) == 0)) {
						sortedString += s.charAt(j);
					}
				}

				break;

			case 2:

				for (int j = 0; j < s.length(); j++) {
					if (Character.isUpperCase(s.charAt(j))) {
						sortedString += s.charAt(j);
						break;
					}
				}
				
				break;

			case 3:

				for (int j = 0; j < s.length(); j++) {
					if (Character.isDigit(s.charAt(j)) && Integer.parseInt(s.valueOf(s.charAt(j))) % 2 == 0) {
						sortedString += s.charAt(j);
					}
				}
				
				break;
			}

		}

		System.out.println("The sorted String is " + sortedString + "\n");
	}

	public void checkIfArrayIdentical() {
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };

		int[] arr3 = { 10, 44, -33 };
		int[] arr4 = { 10, 44, -33, 55 };

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Arrays 1 & 2 are equal\n");
		} else {
			System.out.println("Arrays are  1 & 2  not equal\n");
		}

		if (Arrays.equals(arr3, arr4)) {
			System.out.println("Arrays 3 & 4 are equal\n");
		} else {
			System.out.println("Arrays 3 & 4 are not equal\n");
		}
	}

	public static void main(String[] args) {
		Assignment23 a = new Assignment23();

		a.findSecindMax();

		a.findSum();

		a.oddEvenDifference();

		a.oddEvenDifference("te112ch34no29");

		a.sortString("eTe1CH9cred4it6s");

		a.checkIfArrayIdentical();
	}

}

/*
 * for(int j=i+1; j<s.length();j++) { if(Character.isDigit(s.charAt(i)) &&
 * Character.isDigit(s.charAt(j))) { //num[index] = num[index]+ 10
 * *Integer.parseInt(s.valueOf(s.charAt(i)));
 * 
 * int n = 10 * Integer.parseInt(s.valueOf(s.charAt(i)));
 * 
 * num[index] = n + Integer.parseInt(s.valueOf(s.charAt(j)));
 * 
 * 
 * 
 * break; }
 * 
 * else if(Character.isAlphabetic(s.charAt(i))&& Character.isDigit(s.charAt(j)))
 * { num[index] = +Integer.parseInt(s.valueOf(s.charAt(j)));
 * 
 * System.out.println(num[index]);
 * 
 * index++;
 * 
 * 
 * break; }
 * 
 * 
 * break; }
 * 
 * }
 * 
 * for(int i=0;i<num.length;i++) { System.out.println(num[index]);
 * 
 * }
 */

/*
 * for (; i <= s.length() - 2; i++) { if (Character.isDigit(s.charAt(i)) &&
 * Character.isDigit(s.charAt(i + 1))) { num[index] = 10 *
 * Integer.parseInt(s.valueOf(s.charAt(i))); }
 * 
 * else if (Character.isDigit(s.charAt(i))) { num[index] = num[index] +
 * Integer.parseInt(s.valueOf(s.charAt(i)));
 * 
 * index++; } }
 * 
 * num[index] = num[index] + Integer.parseInt(s.valueOf(s.charAt(i)));
 * 
 * for (int i = 0; i < num.length; i++) { if (num[i] == 0) { break;
 * 
 * } else { sum = sum + num[i];
 * 
 * } } System.out.println(sum);
 * 
 */