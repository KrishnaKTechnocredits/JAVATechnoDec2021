package yogeshNimbalkar;

import java.util.Scanner;

public class Exam4_Program2 {

	boolean isPrimeNumber(int num) {
		boolean flag = true;
		if(num==0 || num == 1) {
			flag = false;
		}else {
			for(int index=2; index<=num/2; index++) {
				if(num % index == 0) {
					flag = false;
					break;
				}		
			}
		}
		return flag;
	}
	
	String checkLengthPrime(String str) {
		String temp="";
		boolean flag;
		String[] arr = str.split(" ");
		for(int index=0; index<arr.length; index++) {
			flag = isPrimeNumber(arr[index].length());
			if(flag == true)
				temp += arr[index] + " ";
		}
		return temp.trim();
	}
	
	public static void main(String[] args) {
		Exam4_Program2 program2 = new Exam4_Program2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = sc.nextLine();
		System.out.println("Resultant string : " + program2.checkLengthPrime(input));
		sc.close();
	}
}
