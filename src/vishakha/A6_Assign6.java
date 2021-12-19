package vishakha;

public class A6_Assign6 {
	void displayName(String name){
			System.out.println("Output is :- ");
		for(int index=0; index<name.length();index++){
			System.out.println(name.charAt(index));
		}
	}
	
	void displayReverse(String name){
			System.out.println("Reverse output is :- ");
		for (int index=name.length()-1;index>=0;index--){
			System.out.println(name.charAt(index));
		}
	}
	
	void charCount(String name ,char ch){
			System.out.println("The count of ch is :- ");
			int count =0;
		for(int index=0;index<name.length();index++){
				if(name.charAt(index)== ch)
				count++;
		}
			System.out.println(count);
	}
	
	public static void main(String[] args) {
		A6_Assign6 assign6 = new A6_Assign6();
		assign6.displayName("Vishakha");
		assign6.displayReverse("Vishakha");
		assign6.charCount("VishakhaRokade", 'a');
	}
}