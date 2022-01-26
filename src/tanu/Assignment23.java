

package tanu;

import java.util.Arrays;
class Assignment23 {
	void findSecondMax(int[] arr) {
		int maxnum = arr[0];
		int secondmax = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (maxnum < arr[index]) {
				maxnum = arr[index];
			}
		}
		for (int index = 0; index < arr.length; index++) {
			if (maxnum != arr[index]) {
				if (secondmax < arr[index]) {
					secondmax = arr[index];
				}
			}
		}
		System.out.println("Second Max number of array is " + secondmax);
	}
	void countSumFromString(String name) {
		int sum = 0;
		char d;
		String temp = "";
		for (int index = 0; index < name.length(); index++) {
			d = name.charAt(index);
			if (Character.isDigit(d)) {
				temp = temp + d;
			} else {
				if (temp != "") {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if (temp != "") {
			sum = sum + Integer.parseInt(temp);
			temp = "";
		}
		System.out.println("Sum of digits of array is " + sum);
	}
	void displaySequence(String name) {
		char d;
		String lowercase = "";
		String uppercase = "";
		String digits = "";
		String specialchar = "";
		for (int index = 0; index < name.length(); index++) {
			d = name.charAt(index);
			if (Character.isLowerCase(d)) {
				lowercase = lowercase + d;
			} else if (Character.isUpperCase(d)) {
				uppercase = uppercase + d;
			} else if (Character.isDigit(d)) {
				digits = digits + d;
			} else {
				specialchar = specialchar + d;
			}
		}
		System.out.println(lowercase + digits + uppercase + specialchar);
	}
	void sumOddEvenFromString(String name) {
		int oddcount = 0;
		int evencount = 0;
		char d;
		int num = 0;
		for (int index = 0; index < name.length(); index++) {
			d = name.charAt(index);
			if (Character.isDigit(d)) {
				num = Character.getNumericValue(d);
				if (num % 2 == 0) {
					evencount = num + evencount;
				} else {
					oddcount = num + oddcount;
				}
			}
		}
		System.out.println(oddcount - evencount);
	}
	void sumOddEvenFromConnectedString(String name) {
	char d;
	String temp ="";
	int sumoddcount=0;
	int sumevencount=0;
	for (int index = 0; index < name.length(); index++) {
		d = name.charAt(index);
		if (Character.isDigit(d)) {
			temp = temp + d;
		} else {
			if (temp != "") {
				if(Integer.parseInt(temp) % 2 == 0)
				{
					sumevencount = sumevencount + Integer.parseInt(temp);
				}
				else
				{
					sumoddcount = sumoddcount + Integer.parseInt(temp);
				}
				temp = "";
			}
		}
	}
	if (temp != "") {
		if(Integer.parseInt(temp) % 2 == 0)
		{
			sumevencount = sumevencount + Integer.parseInt(temp);
		}
		else
		{
			sumoddcount = sumoddcount + Integer.parseInt(temp);
		}
		temp = "";
	}
	   System.out.println(sumevencount-sumoddcount);
	}	
	void placingOddCapitalEvenSequence(String name) {
	 char d;
	 String temp="";
	 String oddcount = "";
	 String evencount = "";
	 String uppercase = "";
	 for (int index = 0; index < name.length(); index++) {
		 d=name.charAt(index);//eTe1CH9cred4it6s
		 if (Character.isDigit(d)) {
			 temp = temp + d;
			 if (Integer.parseInt(temp) % 2 == 0) {
					evencount = evencount+d;
				} 
			 else{
					oddcount = oddcount+d;
				}
			 temp = "";
			 }
		 else if(Character.isUpperCase(d))
		 {
			 uppercase = uppercase + d;
			 temp = "";
		 }
		 }
	 System.out.println(oddcount + uppercase + evencount);
 }
	void verifyIdenticalArray(int [] arr1, int [] arr2) {
		String temparr1 = Arrays.toString(arr1);
		String temparr2 = Arrays.toString(arr2);

		if (temparr1.equals(temparr2))
		{
			System.out.println("Both arrays are identical");
		}
		else
		{
			System.out.println("Both arrays are not identical");
		}
 }
 
	public static void main(String[] arg) {
		Assignment23 assignment = new Assignment23();
		int[] userinput = { 1, 11, 3, 99, 66, 54, 22, 44 };
		assignment.findSecondMax(userinput);
		assignment.countSumFromString("te12ch22nocre3dits4");
		assignment.displaySequence("te4c&Hno7CreD-8i*ts");
		assignment.sumOddEvenFromString("tec5hno3cre6di1ts");
		assignment.sumOddEvenFromConnectedString("te112ch34no29");
		int[] userinput1 = { 1, 11, 3, 99, 6, 54, 22, 44 };
		int[] userinput2 = { 1, 11, 3, 99, 66, 54, 22, 44 };
		assignment.verifyIdenticalArray(userinput1, userinput2);
		assignment.placingOddCapitalEvenSequence("eTe1CH9cred4it6s");	
	}
}