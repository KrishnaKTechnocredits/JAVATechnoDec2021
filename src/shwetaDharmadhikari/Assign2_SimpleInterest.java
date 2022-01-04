/*Assignment - 2 : 14th Dec'2021
Write a calculator program, all methods should take 2 parameters.

for example : void add(int num1, int num2){}
 */
package shwetaDharmadhikari;
class Assign2_SimpleInterest{

	void calculateSimpleInterest(int p, int t, int r){
		int simpleInterest = (p*t*r)/100;
		System.out.println("Simple interest :" +simpleInterest);
	}
	
	void convertTemperature(double faherenhite){
		double celsius = (faherenhite - 32) * 5/9;
		System.out.println("Temperature :" +celsius);
	}
	
	public static void main(String[] args){
		Assign2_SimpleInterest simpleInterest = new Assign2_SimpleInterest();
		simpleInterest.calculateSimpleInterest(5000,3,15);
		simpleInterest.convertTemperature(50);
	}	
}