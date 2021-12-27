package vishakha;

import java.util.Scanner;

public class A12_ReverseString {

	static String str="";
	static void reverseString(String s)
	{
		for(int firstIndex=s.length()-1;firstIndex>=0;firstIndex--) {
			str=str +s.charAt(firstIndex);
			}
	}
	static public void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter String Name : ");
			String strname = scan.next();
			reverseString(strname);
			System.out.print("Reverse String : " +str);
			scan.close();
	
	}

}
