package anshuma;



class Assignment2_Calculator
{
	void add(int num1, int num2){
		int a = num1+num2;
		System.out.println(a);
	}
	
	void substract(int num1, int num2){
		int a = num1-num2;
		System.out.println(a);
	}
	
	void multi(int num1, int num2){
		int a = num1*num2;
		System.out.println(a);
	}
	
	void div(int num1, int num2){
		int a = num1/num2;
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		Assignment2_Calculator assignment2calculator = new Assignment2_Calculator();
		assignment2calculator.add(10,2);
		assignment2calculator.substract(10,6);
		assignment2calculator.multi(2,3);
		assignment2calculator.div(14,2);
	}	
}

