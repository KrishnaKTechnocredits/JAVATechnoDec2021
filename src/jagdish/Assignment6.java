package jagdish;

public class Assignment6 {
	   void printName(String name) {
		   System.out.println("The output is :- "); 
	   for(int index=0;index<name.length();index++){
		   System.out.println(name.charAt(index));
	   } 
	 }
	   
	/*   
	   void printNamehere(String input) {
		   for(int index=0;index<input.length();index++)
		   {
			   System.out.println(input.charAt(index));
		   }
	   }*/

	   void reverseName(String name) {
		   System.out.println("The Reverse output is :- "); 
	   for(int index=name.length()-1;index>=0;index--){
		   System.out.println(name.charAt(index));
	   } 
	 }
	   
	   void countChar(String name ,char ch) {
		   System.out.println("The count of ch is :- ");
		   int count =0;
		   for(int index=0;index<name.length();index++) {
			   if(name.charAt(index)== ch)
				   count++;
		   }
		   System.out.println(count);
	   }

	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.printName("Jagdish");
		assignment6.reverseName("Jagdish");
		assignment6.countChar("JagdishBunge",'g');
	}
}
