package gauravk.Assignment04;

import java.util.Scanner;

/*
 * Assignment - 4 : 16th Dec2021

Program 1: Find weekdays or weekend based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday

dayIndex -> 3 : Weekday
dayIndex -> 6 : WeekEnd
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index

 */
public class FindWeekDayWeekend {
	
	void findingDayType(int dayIndex) {
		
			switch(dayIndex) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Weekday");
				break;
			case 6:
			case 7:
				System.out.println("WeekEnd");
				break;
			default:
				System.out.println("Invalid index");
			}
		
	}
	
	public static void main(String[] args) {
		FindWeekDayWeekend dayName = new FindWeekDayWeekend();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number of a week to find out its corresponding day");
		dayName.findingDayType(sc.nextInt());
	}
}
