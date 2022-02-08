// Program 3: write a method which will print Ascii value of A to Z.
// Program 4: write a program which will print characters between ascii value 97 to 122.
package anjali.Assignment33;

public class A33_program3and4_printAsciiInRange {
	
   void	printasciiValue()
   {
	   for(char ch='A';ch<='Z';ch++) 
	   {
		   int num=ch;
		   System.out.println(num);
	   }
   }
   
   void printCharBasedonAscii()
   {
	  for(int num=97;num<=122;num++)
	  {
		 char ch=(char)num;
		 System.out.println(ch);
	  }
	  
   }
   

   
	public static void main(String[] args) {
		A33_program3and4_printAsciiInRange a33_program3and4= new A33_program3and4_printAsciiInRange();
		//a33_program3and4.printasciiValue();
		a33_program3and4.printCharBasedonAscii();
	}

}
