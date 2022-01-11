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
package shwetaDharmadhikari;
class Assign6_StringExample{
	int index=0;
	void printCharacters(String input){
		System.out.println("Output:");
		for (; index < input.length(); index++){
			System.out.println(input.charAt(index));
		}	
		System.out.println(" ");
	}
	
	void printReverseCharacters(String input){
		System.out.println("Characters in reverse order");
		for (index=input.length()-1; index >=0; index--){
			System.out.println(input.charAt(index));
		}
		System.out.println(" ");
	}
	
	void findCharFrequency(String input,char ch){
		int count=0;
		for (index=0; index < input.length(); index++){
			ch = input.charAt(index);
			if(ch == 'a')
				count++;
		}
		System.out.println("Output: "+count);
	}
	
	public static void main(String args[]){
		Assign6_StringExample stringExample = new Assign6_StringExample();
		stringExample.printCharacters("shweta");
		stringExample.printReverseCharacters("Shweta");
		stringExample.findCharFrequency("dhArmadhikari",'a');}
}