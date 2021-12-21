package tanu;
class Assignment2{
   
   int number1= 10;
   int number2= 2;
   
   void add(){
	    int ans =number1+number2;
		
		System.out.println("Addition is " + ans);
		
   }
    void substraction(){
		int ans =number1-number2;
		System.out.println("substraction is " + ans);
	}
	 void division(){
		int ans = number1/number2;
		System.out.println("Division is "+ ans);
	 }
	 
public static void main(String[] arg){
	Assignment2 assignment1 = new Assignment2();
		  assignment1.add();
		  assignment1.substraction();
		  assignment1.division();
		  
	 }
} 
		  