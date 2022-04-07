package gauravk.Programs47;
import java.util.Arrays;

/*
 * 25.Make a program that create below pattern
Pattern 1
    *
   **
  ***
 ****
*****
Pattern 2
1****
*2***
**3**
***4*
****5

 */
public class PatternPrinting {
	
	void pattern1(char ch, int size) {
		char[] c = new char[size];
		for(char a : c) {
			a=' ';
		}
		for(int i=1; i<=size; i++) {
			for(int j=size-i; j<size; j++) {
				c[j]=ch;
				break;
			}
			System.out.println(Arrays.toString(c));
		}
	}
//    *
//   **
//  ***
// ****
//*****

	void pattern3(String ch, int size) {
		System.out.println("Pattern 3");
		String ans ="";
		for(int i=1; i<=size; i++) {
			for(int j=size; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	*----
//	**---
//	***--
//	****-
//	*****

	void pattern1(String ch, int size) {
		System.out.println("Pattern 1");
		for(int i=1; i<=size; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=size; j>i; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

//	1****
//	*2***
//	**3**
//	***4*
//	****5

	void pattern2(String ch, int size) {
		System.out.println("Pattern 2");
		for(int i=1; i<=size; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(ch);
			}
			for(int k=i; k<=i; k++) {
				System.out.print(i);
			}
			for(int l=i+1; l<=size; l++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	void pattern4(String ch, int curveSize) {
		
	}
	
	public static void main(String[] args) {
		PatternPrinting pp = new PatternPrinting();
		pp.pattern1('*', 5);
		pp.pattern1("*", 5);
		pp.pattern2("*", 5);
		pp.pattern3("*", 5);
		pp.pattern4("*", 5);
	}
}
