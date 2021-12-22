package ashwini;

public class A3_Methods {
		void CalculateSI(int amount,int year,int rate)
		{
			double SimpleInterest = (amount*year*rate)/100;
			System.out.println(SimpleInterest);
		}
		
		void convertTtoF(float fahrenheit)
		{
			double Celcius=(fahrenheit- 32) * 5 / 9;
			System.out.println(Celcius);
		}
		
		public static void main(String[] args)
		{
			A3_Methods m=new A3_Methods();
				m.CalculateSI(2000,3,4);
				m.convertTtoF(34);
		}
}
