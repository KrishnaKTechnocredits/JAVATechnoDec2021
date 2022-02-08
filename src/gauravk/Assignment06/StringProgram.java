package gauravk.Assignment06;
/*
 * Assignment - 6 : 18th Dec'21

Create a single program for following requirements.
1. Create a method to print all characters of given input.
input : techno
output : t
             e
	     c
	     h
	     n
	     o
Hint : 
void display(String input){

}

2. Create a method to print all characters of given input in reverse order.
input : techno
output : o
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
public class StringProgram {
	
	void display(String input) {
		System.out.println("Displaying characters of "+input+":");
		for(int i=0; i<input.length(); i++) {
			System.out.print(input.charAt(i)+" ");
		}
	}
	
	void reverse(String input) {
		System.out.println("\nDisplaying characters of "+input+" in reverse order:");
		for(int i=input.length()-1; i>=0; i--) {
			System.out.print(input.charAt(i)+" ");
		}
	}
	
	void findCharFreq(String input, char ch) {
		int count=0;
		if(input.contains(String.valueOf(ch))) {
			for(int i=0; i<input.length(); i++) {
				if(Character.valueOf(input.charAt(i)).equals(ch))
					count++;
			}
		}
		System.out.println("\nFrequency of character "+ch+" in the string "+input+" --> "+count);
	}
	
	public static void main(String[] args) {
		StringProgram sp = new StringProgram();
		sp.display("techno");
		sp.reverse("techno");
		sp.findCharFreq("techno", 'a');
		sp.findCharFreq("akanksha", 'a');
	}
}
