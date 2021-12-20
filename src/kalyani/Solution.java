package kalyani;

class Solution{
	
	void simpleInterest (double p, double t, double r){
		double simplInter = p*t*r/100;
		System.out.println("simple interest is " + simplInter);
		}
		
	void temperature(double fahrenheit){
		double celsius = (fahrenheit-32)*5/9;
		System.out.println("temperature from fahrenheit to celsius is " + celsius);
		}
		
	public static void main(String args[]){
		Solution solution = new Solution();
		solution.simpleInterest(25000,5,13);
		solution.temperature(350);
	}
}	
		
	