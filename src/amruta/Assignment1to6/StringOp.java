/* Assignment - 6 : 18th Dec'21

Create a single program for following requirements.
1. Create a method to print all characters of given input.
input : techno
output :    t
           	    e
	     c
	     h
	     n
	     o
Hint : 
void display(String input){  }
2. Create a method to print all characters of given input in reverse order.
input : techno
output :      o
                    n
	      h
	      c
	      e
	      t
Hint:
void reverse(String input){
}
3. Create a method to find occurance of given character from input string.
input : akanksha
        'a'
output : a -> 3
Hint : 
void findCharFreq(String input, char ch){
}

 */

package amruta.Assignment1to6;

public class StringOp {
	
	void displayChar(String name) {
		System.out.println("String Characters:");
		for(int index=0;index<name.length();index++)
			System.out.println(name.charAt(index));
	}

	void reverseChar(String name) {
		System.out.println("String characters in Reverse Order :");
		for(int index=name.length()-1;index>=0;index--)
			System.out.println(name.charAt(index));
	}

	void findFreqOfChar(String name) {
		int count = 0;
		System.out.print("Occurence of character a in given string is : ");
		
		for(int index=0; index < name.length(); index++) {
			char ch= name.charAt(index);
			if(ch== 'a')
				count++;
		}
		System.out.print(count);
	}
	
	public static void main(String[] args) {
		StringOp stringop =new StringOp();
		stringop.displayChar("Techno");
		stringop.reverseChar("techno");
		stringop.findFreqOfChar("aakanksha");
	}

}
