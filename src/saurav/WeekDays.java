package saurav;

class WeekDays{
	
	void weekDays(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5)
			System.out.println("DayIndex :"+dayIndex +" =weekday");
		else if(dayIndex>5 && dayIndex<7)
			System.out.println("DayIndex :"+dayIndex+" = weekend");
		else 
			System.out.println("DayIndex :"+dayIndex+" =Invalid Index");
	}
		
	public static void main(String[] a){
		WeekDays weekdays = new WeekDays();
		weekdays.weekDays(3);
		weekdays.weekDays(6);
		weekdays.weekDays(11);
		weekdays.weekDays(-3);

		
	}	
} 