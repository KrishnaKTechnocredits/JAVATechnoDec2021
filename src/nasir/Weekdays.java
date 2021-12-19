package nasir;
class Weekdays{
	
	void days(int dayIndex){
		
			if(dayIndex>=1 && dayIndex<=5)
				System.out.println("Weekdays");
			else if (dayIndex>=6 && dayIndex<=7)
				System.out.println("Weekend");
			else	
				System.out.println("Invalid Index");	
			
	}	
	public static void main(String[]args){
		Weekdays weekdays=new Weekdays();
		weekdays.days(2);
		weekdays.days(4);
		weekdays.days(6);
		weekdays.days(-2);
	}
}