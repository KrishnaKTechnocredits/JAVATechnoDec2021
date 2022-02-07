/*2: 
      Write a method which will return character of given Ascii value.
      Hint : Method signature should be char getAsciiOfChar(int asciiValue)

 */
package anjali.Assignment33;

public class A33_Program2_asciiconversion {
	
	char getAsciiOfCharfirstapprorach(int asciiValue) 
	{
		char ch= (char)(asciiValue); //asciiValue is a int and we fit 4 byte int in to 2 byte char that not possible 
		                              //therefore type casting is needed
		return ch;
	}
	
     void  getAsciiOfCharsecondapprorach()
	{
		char ch= 100; //compiler thought we need to store ascii 100 so it's allowed
		System.out.println(ch);
	}
	

	public static void main(String[] args) {
		A33_Program2_asciiconversion a33_Program2 = new A33_Program2_asciiconversion();
		char ch=a33_Program2.getAsciiOfCharfirstapprorach(98);
		System.out.println(ch);
		a33_Program2.getAsciiOfCharsecondapprorach();
	}

}
