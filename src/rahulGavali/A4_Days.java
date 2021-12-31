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

package rahulGavali;

public class A4_Days {
	void validateDay(int index){
		if (index >=1 && index <=5)
			System.out.println("weekday");
		else if(index >= 6 && index<=7)
			System.out.println("weekend");
		else
			System.out.println("Invalid index");
	}
	public static void main(String[] arg){
		A4_Days days = new A4_Days();
			days.validateDay(3);
			days.validateDay(6);
			days.validateDay(11);
			days.validateDay(-3);
	}		

}

