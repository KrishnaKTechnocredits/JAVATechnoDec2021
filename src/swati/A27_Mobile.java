package swati;


import java.util.Scanner;

public class A27_Mobile {
	
	void checkValid(String num) {
		
		if(num.startsWith("+91 ") && num.length()==14) {
			System.out.println(num);
		}
		else {
			System.out.println("invalid Number");
		}
	}

	public static void main(String[] args) {
		A27_Mobile a27=new A27_Mobile();
		 Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Mobile:");
	    String mobile = sc.nextLine();
	    a27.checkValid(mobile);
	    
	   
	}

}
