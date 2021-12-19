package karan;

public class Assignment_6 {

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
