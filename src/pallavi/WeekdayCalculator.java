/*Assignment - 4 : 16th Dec2021

Program 1: Find weekdays or weekend based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday

dayIndex -> 3 : Weekday
dayIndex -> 6 : WeekEnd
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index*/

package pallavi;

class WeekdayCalculator{

	void dayCalculator(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5)
			System.out.println("dayIndex -> " + dayIndex + " :Weekday");
		else if (dayIndex==6 || dayIndex==7)
			System.out.println("dayIndex -> " + dayIndex + " :WeekEnd");
		else
			System.out.println("dayIndex -> " + dayIndex + " :Invalid Index");
	}
	
	public static void main(String[] arr){
		WeekdayCalculator weekdayCalculator=new WeekdayCalculator();
		weekdayCalculator.dayCalculator(3);
		weekdayCalculator.dayCalculator(6);
		weekdayCalculator.dayCalculator(11);
		weekdayCalculator.dayCalculator(-3);
	}
}