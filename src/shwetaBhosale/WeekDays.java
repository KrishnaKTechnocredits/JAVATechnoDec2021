/* Assignment - 4 : 16th Dec2021

Program 1: Find weekdays or weekend based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday

dayIndex -> 3 : Weekday
dayIndex -> 6 : WeekEnd
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index */
package shwetaBhosale;

class WeekDays{
	
	void displayDays(int dayIndex){
		if(dayIndex >=1 && dayIndex <= 5)
			System.out.println("It is Weekday");
		else if(dayIndex == 6 || dayIndex == 7)
			System.out.println("It is WeekEnd");
		else
			System.out.println("Invalid Index");
	}
	
	public static void main(String[] a){
		WeekDays weekDays = new WeekDays();
		weekDays.displayDays(3);
		weekDays.displayDays(6);
		weekDays.displayDays(11);	
		weekDays.displayDays(-3);		
	}
}