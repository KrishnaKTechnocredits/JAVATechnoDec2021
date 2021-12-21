package nishika;

class A3_assignment3{
	
	void SimpleInterest(double amount , double time ,double rate){
		double SimpleInterest = (amount*time*rate)/100;
		System.out.println(SimpleInterest);	
	}
	
	void ConvertTempreture(double fahrenheit){
		double Celsious=(fahrenheit-32)*5/9;
		System.out.println(Celsious);
	}
	
	public static void main(String[] args){
		A3_assignment3 a3_assigbnment3 = new A3_assignment3();
		a3_assigbnment3.SimpleInterest(200,5,10);
		a3_assigbnment3.ConvertTempreture(28);
	}
}