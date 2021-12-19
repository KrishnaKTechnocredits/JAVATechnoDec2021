package sagarShrikhande;
class A4_Weekdays{

	void weekdays(int dayIndex){
		if(dayIndex >= 1 && dayIndex <=5)
			System.out.println("Weekday");
		else if(dayIndex >= 6 && dayIndex <=7)
			System.out.println("Weekend");
		else
			System.out.println("Invalid Index");
	}
	
	public static void main(String[] a){
		A4_Weekdays assignment4 = new A4_Weekdays();
		assignment4.weekdays(3);
		assignment4.weekdays(6);
		assignment4.weekdays(11);
		assignment4.weekdays(-3);
	}
}



/* Program 1: Find weekdays or weekend based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday

dayIndex -> 3 : Weekday
dayIndex -> 6 : WeekEnd
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index */
