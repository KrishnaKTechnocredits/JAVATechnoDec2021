package omkar;
import java.util.Scanner;


public class A12_FreqOfChar {
	static int cntP=0;
	
	static void display (String name){
		for (int i=0; i<name.length(); i++){
			System.out.println(name.charAt(i));
			if(name.charAt(i)=='p')
				cntP++;
			
		}	
		System.out.println(cntP);
	
	}

	public static void main(String[] args) {
		A12_FreqOfChar a12_FreqOfChar = new A12_FreqOfChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string" );
		String Str =scanner.next();
		a12_FreqOfChar.display(Str);
		//scanner.display(Str);
		

	}

}
