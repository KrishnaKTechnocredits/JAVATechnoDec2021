/*Program 1: Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
 */
package anjali.Assignment33;

public class A33_Program1_ascii {
	
	int getAsciiOfChar(char ch) 
	{
		int Ascii=ch;
		return Ascii;
	}

	public static void main(String[] args) {
		A33_Program1_ascii a33_Program1 = new A33_Program1_ascii();
	    int output=	a33_Program1.getAsciiOfChar('A');
	    System.out.println(output);
	    int output1=a33_Program1.getAsciiOfChar('a');
	    System.out.println(output1);
	}

}
