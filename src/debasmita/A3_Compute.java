package debasmita;

public class A3_Compute {
	double simpleInterest ;
	double celcius;
	
	void simpleInterest(int p, float r, float t) {
	   simpleInterest = (p*r*t)/100 ;
	   System.out.println(simpleInterest);
	}
	void temperature(double f) {
	   celcius=(f-32)*5/9 ;
	   System.out.println(celcius);
	}
	public static void main(String[] args) {
	   A3_Compute compute = new A3_Compute();
	   compute.simpleInterest(5000,10.5f,6.5f);
	   compute.temperature(102.2);
	}

}
