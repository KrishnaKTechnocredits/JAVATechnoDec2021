package kavleen;

class Calulator{
	
	void add(int num1,int num2){
	  int ans = num1 + num2 ; 
	  System.out.println("Addition is " + ans);
	  
	}
	
	void sub(int num1,int num2){
	  int ans = num1 - num2;
	  System.out.println("Subtraction is " + ans);
	
	}
	
	void multi(int num1,int num2){
	  int ans = num1 + num2;
	  System.out.println("Multiplication is " + ans);
	
	}
	
	void div(int num1,int num2){
	  int ans = num1 / num2 ;
	  System.out.println("Division is " + ans);
	
	}
	
    public static void main ( String[] args){
		
		Calulator calulator = new Calulator();
		calulator.add(10,15);
		calulator.sub(10,15);
		calulator.multi(10,15);
		calulator.div(10,15);	
	}
	
}
