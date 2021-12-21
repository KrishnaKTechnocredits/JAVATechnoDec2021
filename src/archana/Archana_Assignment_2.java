package archana;
class Archana_Assignment_2{ 
	
	void add(int num1 , int num2) {
		int ans = num1 + num2;
		//tot =  ans;
		System.out.println("Addition is " + ans);
	}
	
	void mult(int num1 , int num2) {
		int ans =num1*num2;
		System.out.println("Multiplication is " + ans);
	}
	
	void sub(int num1 , int num2) {
		int ans =num1-num2;
		System.out.println("Substraction is " + ans);
	}
	
	void div(int num1 , int num2) {
		int ans =num1/num2;
		System.out.println("Division is " + ans);
	}
	
	
	public static void main(String[] args){
		Archana_Assignment_2 cal = new Archana_Assignment_2();
		cal.add(10 , 20);//passing value to variable of method
		cal.mult(10 , 20);
		cal.div(100 , 2);
		cal.sub(50 , 20);
	}
	
}