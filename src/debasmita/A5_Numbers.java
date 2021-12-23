package debasmita;

public class A5_Numbers {
	void evenNumbers(int startNumber,int endNumber) {
		  System.out.println("Even numbers are");
		for(int num=startNumber; num<=endNumber; num++) {
			
			if(num%2==0) {
				System.out.println(num);
			}
		}
	 }
	 void divisibleByFive(int start,int end) {
		  System.out.println("Divisible by 5 numbers are");
		  for(int num=start; num<=end; num++) {
			  if(num%5==0) {
				  System.out.println(num);
			  }
		  }
	 }
	 
	 void divisibleBy5And3(int start,int end) {
		 System.out.println("Divisible by 5 and 3,numbers are");
		 for(int num=start; num<=end; num++) {
			  if(num%3==0 && num%5==0) {
				  System.out.println(num);
			  }
		 }
	 }
	 
	 void divisibleBy7(int start,int end) {
		 System.out.println("Divisible by 7 or 13,numbers are");
		 for(int num=start; num<=end; num++) {
			   if(num%7==0 || num%13==0) {
				   System.out.println(num);
			   }
		 }
	 }
	 
	 void sum(int start,int end) {
		int add=0;
		 for(int num=start; num<=end; num++) {
			 add=add+num; 
			 }
		   System.out.println("sum is :" + add);
	 }

     void difference(int start,int end) {
		 int sum1=0;
		 int sum2=0;
		 int temp=0;
		 for(int num=start; num<=end; num++) {
			 if(num%2==0) {
				 sum1=sum1+num;
			 }
			 else {
				 sum2=sum2+num;
			 }
	     }
		    temp= sum2-sum1;
			System.out.println("difference is :" + temp);
	 }		 
				 
     void oddNumbers(int endNumber,int startNumber) {
	       System.out.println("Odd numbers are");
	    for(int num= endNumber;num>=startNumber; num--) {
	      if(num%2!=0){
		    System.out.println(num);
		  }
	    }
   } 
	  public static void main(String[] args) {
	 
	     A5_Numbers numbers = new A5_Numbers();
		 numbers.evenNumbers(10,15);
		 System.out.println("****************");
		 numbers.divisibleByFive(10,30);
		 System.out.println("****************");
		 numbers.divisibleBy5And3(3,18);
		 System.out.println("****************");
		 numbers.divisibleBy7(5,40);
		 System.out.println("****************");
		 numbers.sum(1,5);
		 System.out.println("****************");
		 numbers.difference(3,9);
		 System.out.println("****************");
		 numbers.oddNumbers(20,10);
	  }
}
