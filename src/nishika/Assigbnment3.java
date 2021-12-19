class Assigbnment3{
	
	void SimpleInterest(double amount , double time ,double rate){
		double SimpleInterest = (amount*time*rate)/100;
		System.out.println(SimpleInterest);	
	}
	
	void ConvertTempreture(double fahrenheit){
		double Celsious=(fahrenheit-32)*5/9;
		System.out.println(Celsious);
	}
	
	public static void main(String[] args){
		Assigbnment3 assigbnment3 = new Assigbnment3();
		assigbnment3.SimpleInterest(200,5,10);
		assigbnment3.ConvertTempreture(28);
	}
}