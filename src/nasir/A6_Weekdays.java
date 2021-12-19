package nasir;
class A6_Weekdays{
	
	void days(int dayIndex){
		
			if(dayIndex>=1 && dayIndex<=5)
				System.out.println("Weekdays");
			else if (dayIndex>=6 && dayIndex<=7)
				System.out.println("Weekend");
			else	
				System.out.println("Invalid Index");	
			
	}	
	public static void main(String[]args){
		A6_Weekdays weekdays=new A6_Weekdays();
		weekdays.days(2);
		weekdays.days(4);
		weekdays.days(6);
		weekdays.days(-2);
	}
}