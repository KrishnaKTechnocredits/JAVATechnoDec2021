/*Assignment - 4 : 16th Dec2021

Program 1: Find weekdays or weekend based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday

dayIndex -> 3 : Weekday
dayIndex -> 6 : WeekEnd
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index

 */

package vaibhav.Assignment_4;

public class WeekWithDayIndex {
	
	void decideDayType(int index){
		if (index >=1 && index <=5)
			System.out.println("Dayindex --> " +index+ "  : Weekday");
		else if (index == 6 || index == 7)
			System.out.println("Dayindex --> " +index+ "  : Weekend");
		else
			System.out.println("Dayindex --> " +index+ "  : Invalid");
	}
		
	public static void main(String [] args){
		WeekWithDayIndex weekWithDayIndex = new WeekWithDayIndex();
		weekWithDayIndex.decideDayType(-1);
		weekWithDayIndex.decideDayType(1);
		weekWithDayIndex.decideDayType(2);
		weekWithDayIndex.decideDayType(3);
		weekWithDayIndex.decideDayType(4);
		weekWithDayIndex.decideDayType(5);
		weekWithDayIndex.decideDayType(6);
		weekWithDayIndex.decideDayType(7);
		weekWithDayIndex.decideDayType(8);
		
	}
}