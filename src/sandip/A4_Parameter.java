package sandip;

class A4_Parameter{

	void simpleIntrest(double p, float r, float t){
		double ans = (double)(p*r*t)/100;
		System.out.println("Simple Intrest is "+ans);
	}
	
	void temp(float F){
		float celsius = (F-32)*5/9;
		System.out.println("The conversion is "+celsius);
	}
	
	public static void main(String[]args){
		A4_Parameter parameter_1=new A4_Parameter();
		parameter_1.simpleIntrest(10000,7.5f,2.04f);
		parameter_1.temp(120.5f);
	}
	
}