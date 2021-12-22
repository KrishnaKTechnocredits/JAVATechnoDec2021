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

package amruta.Assignment1to6;

public class Weekdays {
	
	void display(int dayIndex){
		if (dayIndex >= 1 && dayIndex <=5){
			System.out.println("DayIndex --> "+dayIndex+" : Weekday");
		}else if (dayIndex >= 5 && dayIndex <=7){
			System.out.println("DayIndex --> "+dayIndex+" : Weekend");
		}else
			System.out.println("DayIndex --> "+dayIndex+" : Invalid day");
	}

	public static void main(String[] args){
		Weekdays weekdays = new Weekdays();
		weekdays.display(3);
		weekdays.display(6);
		weekdays.display(11);
		weekdays.display(-3);
	}

}
