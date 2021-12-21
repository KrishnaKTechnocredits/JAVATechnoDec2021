package yogeshNimbalkar;
//Assignment = 3 : 15 Dec 2021
class A3_SimpleIntAndTemp{
	
	void processSimpleInterest(float principal, float time, float rate){
		float simpleInterest = (principal*time*rate)/100;
		System.out.println("Simple insert = " + simpleInterest);
	}
	
	void processTemprature(float fahrenheit){
		float celsius = (fahrenheit - 32)*5/9;
		System.out.println("Temprature in celsius = " + celsius);
	}
	
	public static void main(String[] args){
		A3_SimpleIntAndTemp simpleintandtemp = new A3_SimpleIntAndTemp();
		simpleintandtemp.processSimpleInterest(25000,5,8.5f);
		simpleintandtemp.processTemprature(103);
	}
}