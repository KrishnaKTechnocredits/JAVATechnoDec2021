package rahulGavali;
/*Assignment24
Program 5. WAP to convert first character of word with capital letter 
Input    : "anvit harsh dipali" 
Output : "Anvit Harsh Dipali" 
*/
import java.util.Scanner;

public class A24_ConvertFirstLetterCapital {

	String ConvertFirstChToCap(String str) {
		String[] arr = str.split(" ");
		String temp="";
		for(int index=0; index<arr.length; index++) {
			char ch = arr[index].charAt(0);
			ch = Character.toUpperCase(ch);
		//	String temp = ch+arr[index].substring(1);
			temp = temp + (ch + arr[index].substring(1) + " ");
		}
		return temp;
	}
	
	public static void main(String[] args) {
		A24_ConvertFirstLetterCapital conFirstLetterCapital = new A24_ConvertFirstLetterCapital();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = scanner.nextLine();
		System.out.println("Resultant String : " + conFirstLetterCapital.ConvertFirstChToCap(input));
		scanner.close();
	}
}