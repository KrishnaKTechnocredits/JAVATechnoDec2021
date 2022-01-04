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
package shwetaDharmadhikari;
class Assign4_FindWeekdaysAndWeekend{
	
	void findDay(int dayIndex)
	{
		if (dayIndex > 0 && dayIndex <6)
			System.out.println("Weekday");
		else if (dayIndex == 6 || dayIndex == 7)
			System.out.println("Weekend");
		else 
			System.out.println("Invalid Index");
	}
	
	public static void main(String args[])
	{
		Assign4_FindWeekdaysAndWeekend findWeekdaysAndWeekend= new Assign4_FindWeekdaysAndWeekend();
		findWeekdaysAndWeekend.findDay(6);
		findWeekdaysAndWeekend.findDay(3);
		findWeekdaysAndWeekend.findDay(10);
		findWeekdaysAndWeekend.findDay(-6);
	}	
}