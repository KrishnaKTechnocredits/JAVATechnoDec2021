package rohini;
/*Assignment 2 - Program to perform all calculator operations*/

class Rohini_Assignment2{
	int ans;
	
	void multiply(int a,int b){
		ans = a*b;
		System.out.println("multiplication: "+ans);
	}
	
	void division(int a,int b){
	    ans=a/b;
		System.out.println("division: "+ans);
     }
	
	void addition(int a,int b){
		ans=a+b;
		System.out.println("addition: "+ans);
	}
	
	void subtraction(int a,int b){
		ans=a-b;
		System.out.println("subtraction: "+ans);
	}

		
	public static void main(String[] args){
		Rohini_Assignment2 calc = new Rohini_Assignment2();
		calc.multiply(27,77);
		calc.division(100,21);
		calc.addition(15,19);
		calc.subtraction(200,57);
		
	}
	
}