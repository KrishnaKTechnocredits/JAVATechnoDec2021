/*Assignment - 4 : 16th Dec2021

Program 1: Find weekdays or weekend based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday

dayIndex -> 3 : Weekday
dayIndex -> 6 : WeekEnd
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index*/

package priyankaZende;
class A4_WeekDayWeekEndDemo{
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
		A4_WeekDayWeekEndDemo weekDayWeekEnd = new A4_WeekDayWeekEndDemo();
		weekDayWeekEnd.printWeekStatus(3);
		weekDayWeekEnd.printWeekStatus(6);
		weekDayWeekEnd.printWeekStatus(11);
		weekDayWeekEnd.printWeekStatus(-3);
		weekDayWeekEnd.printWeekStatus(0);
	}	
}		