package karan;

public class Assignment_6 {
	/*
	Assignment - 6 : 18th Dec'21

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
		void display(String input){
			System.out.println("All characters of given input:");
			for(int index=0;index<input.length();index++) {
				
				System.out.println(input.charAt(index));
			}
		}
		
		void reverse(String input){
			System.out.println("Rverse characters of given input:");
			for(int index=input.length()-1;index>=0;index--) {
				
				System.out.println(input.charAt(index));
			}
		}
		
		void findFreqofChar(String input,char ch){
			int count=0;
			for(int index=0;index<input.length();index++) {
				if(input.charAt(index) == ch) {
					count++;
				}
			}
			System.out.println("\n Display occurance of given character:"+ch +"-->"+count);		
		}
		
		public static void main(String[] args) {
			Assignment_6 assignment6 = new Assignment_6();
			assignment6.display("techno");
			assignment6.reverse("techno");
			assignment6.findFreqofChar("akanksha", 'a');
		}
}
