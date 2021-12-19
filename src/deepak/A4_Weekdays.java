/*Assignment - 4: 16th Dec2021
Program 1: Find weekdays or weekend based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday

dayIndex -> 3 : Weekday
dayIndex -> 6 : WeekEnd
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index
*/
package deepak;
class A4_Weekdays{
	
	void identifyDay(int dayIndex){
		if(dayIndex > 0 && dayIndex < 6)
			System.out.println("Weekday");
		else if(dayIndex == 6 || dayIndex == 7)
			System.out.println("WeekEnd");
		else
			System.out.println("Invalid Index");
	}
	
	public static void main(String[] a){
		A4_Weekdays weekdays = new A4_Weekdays();
		weekdays.identifyDay(-28);
	}
}