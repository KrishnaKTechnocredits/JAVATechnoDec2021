package anamika;

public class Assignment5 {
		
	void findEvenN0() {
		System.out.println("Even N0 between 10 to 15: ");
		for(int num=10;num<=15;num++) {
			if(num%2 == 0)
				System.out.println(num);
		}
	}
	
	void divisible1() {
		System.out.println("List of num divisible by 5: ");
		for(int num=10;num<=30;num++) {
			if(num%5 == 0)
				System.out.println(num);
		}
	}
	
	void divisible2() {
		System.out.println("List of num divisible by 5 & 3: ");
		for(int num=5;num<=18;num++) 
			if(num%5 == 0 && num%3 == 0) {
				System.out.println(num);
			}
	}
	
	void divisible3() {
		System.out.println("List of No divisible by 7 or 13: ");
		for(int num = 5;num<=40;num++)	
			if(num%7 == 0 || num%13 == 0) {
				if(num%7==0)
			        System.out.println(num +"is divisible by 7");
				else
					System.out.println(num +"is divisible by 7");
			}
	}
	
	void sum() {
		int ans=0;
		for(int num=1;num<=5;num++) 
			ans=ans+num;
		    System.out.println("sum of 1 to 5 numbers:"+ans);	
	}
	
	void evenOddDifference() {
		System.out.println("difference between even and odd No:");
		int even = 0;
		int odd = 0;
		    for(int num=3;num<=9;num++)
		    	if(num%2==0)
		    		even=even+num;
		    	else
		    		odd=odd+num;
		        System.out.println(odd-even);
		        
	}
	
	void reverseOrder() {
		System.out.println("odd number in reverse order: ");
		for(int num=20;num>=10;num--)
			if(num%2 !=0)
				System.out.println(num);
	}
	
	public static void main(String[] args) {
		Assignment5 assignment5 = new Assignment5();
		assignment5.findEvenN0();
		assignment5.divisible1();
		assignment5.divisible2();
		assignment5.divisible3();
		assignment5.sum();
		assignment5.evenOddDifference();
		assignment5.reverseOrder();
	}
	
}
	
		
