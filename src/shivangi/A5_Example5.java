package shivangi;

class A5_Example5{

	void processData(double num){
		double ans = num/10;
		System.out.println(ans);
	}
	
	void doCalculation(int num1, int num2){
		//int num1 = 10;
		//int num2 = 3;
		double ans = (double)num1/num2;
		//double ans = (double)(num1/num2);   //3.0
		//double ans = num1/num2;
		System.out.println(ans);
	}	
	
	public static void main(String[] args){
		A5_Example5 example5 = new A5_Example5();
		//example5.processData(20.2);
		example5.doCalculation(10,3);
		
		/*int num1 = 20;
		double num2 = num1;*/    //implicitely type casting
		
	}
}