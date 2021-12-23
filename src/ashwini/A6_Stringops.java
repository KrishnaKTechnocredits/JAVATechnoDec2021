package ashwini;
public class A6_Stringops {
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
		A6_Stringops so = new A6_Stringops();
		so.display("techno");
		so.reverse("techno");
		so.findCharFreq("akanksha", 'a');
	}
}
