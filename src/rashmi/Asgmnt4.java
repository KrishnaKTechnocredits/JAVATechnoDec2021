package rashmi;

public class Asgmnt4 {
	void DayValidation (int index){
		if(index>=1 && index<=5 )
		    System.out.println("weekday");
		else if(index>=6 && index<=8)
		    System.out.println("WeekEnd");
		else 
			System.out.println("Invalid index"); 
		
	}	
	public static void main(String b[]){	
		Asgmnt4 asgmnt4 = new Asgmnt4();
		asgmnt4.DayValidation(3);
		asgmnt4.DayValidation(6);
		asgmnt4.DayValidation(11);
		asgmnt4.DayValidation(-3);
	}	
}
