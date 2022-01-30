package poojaRajguru;

public class Test4_PrimeString {
	boolean isPrimeNo(int num) {
		boolean flag = true;
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (num == 1) {
			return false;
		} else if (flag == true) {
			return true;
		}
		return flag;
	}

	String isStringPrime(String str) {
		String[] arr = str.split(" ");
		String s = "";
		for (int index = 0; index < arr.length; index++) {
			if (isPrimeNo(arr[index].length())) {
				s = s + arr[index] + " ";
			}
		}
		return s.trim();
	}

	public static void main(String[] args) {
		Test4_PrimeString prime = new Test4_PrimeString();
		String input1 = "I my India";
		String input2 = "I would like to have a cup of tea";
		System.out.println("Input String : " + input1);
		System.out.println("The Word ' " + prime.isStringPrime(input1) + " ' is having prime number lenght ");
		System.out.println();
		System.out.println("Input String : " + input2);
		System.out.println("The Word ' " + prime.isStringPrime(input2) + " ' is having prime number lenght ");
	}
}
