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

class Assig4{
	
	void displayDays(int dayIndex){
		if(dayIndex >=1 && dayIndex <= 5)
			System.out.println("It is Weekday");
		else if(dayIndex >= 6 && dayIndex <= 7)
			System.out.println("It is WeekEnd");
		else
			System.out.println("Invalid Index");
	}
	
	public static void main(String[] a){
		Assig4 assig4 = new Assig4();
		assig4.displayDays(3);
		assig4.displayDays(6);
		assig4.displayDays(11);	
		assig4.displayDays(-3);		
	}
}