package swapnali;

class SimpleIntr{
	
	void SiCalculator(int principle,double rate, int time)
	{
		double SimpIN=(principle*rate*time)/100;
		System.out.println("Simple Interest is: "+SimpIN);
	}
	void Fahrenheit(double fahr){
		double celcius=((fahr-32)*5)/9;
		System.out.println("Celcius Conversion is: "+celcius);
	}
	
	public static void main(String[] args){
		SimpleIntr si=new SimpleIntr();
		si.SiCalculator(25000,14.5,12);
		si.Fahrenheit(54.5);
	}
	
}