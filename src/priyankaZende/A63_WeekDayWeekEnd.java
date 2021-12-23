/* Find weekdays or weekend based on dayIndex. */
package priyankaZende;
class A63_WeekDayWeekEnd{
	void printWeekStatus(int dayIndex){
		if(dayIndex >=1 && dayIndex<=5){
			System.out.println("dayIndex -> " + dayIndex + " : Weekday" );
			if(dayIndex == 1)
				System.out.println(dayIndex +" -> Monday"); 
			else if(dayIndex == 2)
				System.out.println(dayIndex +" -> Tuesday"); 
			else if(dayIndex == 3)
				System.out.println(dayIndex +" -> Wednesday"); 
			else if(dayIndex == 4)
				System.out.println(dayIndex +" -> Thursday"); 
			else if(dayIndex == 5)
				System.out.println(dayIndex +" -> Friday"); 
		}	
		else if(dayIndex ==6 || dayIndex ==7){
			System.out.println("dayIndex -> " + dayIndex + " : WeekEnd" );
			if(dayIndex == 6)
				System.out.println(dayIndex +" -> Saturday"); 
			else if(dayIndex == 7)
				System.out.println(dayIndex +" -> Sunday"); 
		}
		else 
			System.out.println("dayIndex -> " + dayIndex + " : Invalid Index" );	
	}	
	
	public static void main(String[] args){
		A63_WeekDayWeekEnd weekDayWeekEnd = new A63_WeekDayWeekEnd();
		weekDayWeekEnd.printWeekStatus(3);
		weekDayWeekEnd.printWeekStatus(6);
		weekDayWeekEnd.printWeekStatus(11);
		weekDayWeekEnd.printWeekStatus(-3);
		weekDayWeekEnd.printWeekStatus(0);
	}	
}		