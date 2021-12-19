/*Assignment - 6: 18th Dec'21

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

}*/
package deepak;
class A6_StringOperations{
	
	void display(String input){
		System.out.print("Input String is: ");
		for(int index = 0 ; index < input.length() ; index++){
			System.out.print(input.charAt(index));
		}
		System.out.println();
	}
	
	void reverse(String input){
		System.out.print("Reverse of Input String is: ");
		for(int index = input.length()-1 ; index >=0 ; index--){
			System.out.print(input.charAt(index));
		}
		System.out.println();
	}
	
	void findCharFreq(String input, char ch){
		int count = 0;
		for(int index = 0 ; index < input.length() ;  index++){
			if(input.charAt(index) == ch)
				count++;
		}
		System.out.println(ch+" : "+count);
	}
	
	public static void main(String [] a){
		A6_StringOperations stringOperations = new A6_StringOperations();
		stringOperations.display("techno");
		stringOperations.reverse("techno");
		stringOperations.findCharFreq("akanksha", 'a');
	}
}
