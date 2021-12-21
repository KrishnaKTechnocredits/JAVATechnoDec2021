package debasmita;

public class A6_Letters {
	void display(String input) {
	     for(int index=0; index<input.length(); index++) {
		     System.out.println(input.charAt(index));
		 }
	   }
	   void reverse(String input) {
		    for(int index=input.length()-1; index>=0; index--) {
		     System.out.println(input.charAt(index));
		 }
	   }
	   void occurence(String name, char ch) {
		   int count=0;
		   for(int index=0; index<name.length(); index++) {
			   if(name.charAt(index)== ch)
				   count++;
		   }   
			   System.out.println(count);
	   }
	   public static void main(String[] args) {
	       A6_Letters assignment6 = new A6_Letters();
	       assignment6.display("Technocredits");
	       System.out.println("******************");
	       assignment6.reverse("Techno");
	       System.out.println("******************");
	       assignment6.occurence("Debasmita", 'a');
	   }
}
