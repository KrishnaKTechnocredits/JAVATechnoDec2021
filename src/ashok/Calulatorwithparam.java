package ashok;
class CalulatorWithParam{
	
	void add(int num1,int num2){
		int ans;
		ans = num1 + num2;
		System.out.println("Addition of 2 number is "+ ans);
	}
	
	void sub(int num1,int num2){
		int ans;
		ans = num1 - num2;
		System.out.println("Substraction of 2 number is "+ ans);
	}
	
	void mul(int num1,int num2){
		int ans;
		ans = num1 * num2;
		System.out.println("Multiplication of 2 number is "+ ans);
	}
	
	void div(float num1,float num2){
		float ans;
		ans = num1 / num2;
		System.out.println("Division of 2 number is "+ ans);
	}
	
	public static void main(String[] args){
		CalulatorWithParam calulatorWithParam = new CalulatorWithParam();
		calulatorWithParam.add(10,20);
		calulatorWithParam.sub(10,20);
		calulatorWithParam.mul(10,20);
		calulatorWithParam.div(1,20);
	}
}
