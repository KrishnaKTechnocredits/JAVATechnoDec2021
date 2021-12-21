package debasmita;

public class A7_Characters {
	void print(String str) {
		   for(int i=0; i<=str.length(); i++) {
		        if(i%2==0) {
	               System.out.println(str.charAt(i));
				}
		   } 
		 }
		 
		 void print1(String name) {
		   for(int i=0; i<=name.length(); i++) {
			   if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u'){
				   System.out.println(name.charAt(i));
			   }
		   }
		 }
		 public static void main(String args[]) {
		 A7_Characters assignment7 = new A7_Characters();
		 assignment7.print("technocredits");
		 assignment7.print1("technocredits");
		 }

}
