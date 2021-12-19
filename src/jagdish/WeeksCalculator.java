package jagdish;
class WeeksCalculator{
        		
	 void weekdays(int dayIndex){
		 if (dayIndex >= 1 && dayIndex <= 5)
			 System.out.println("This is weekdays");
		 else if (dayIndex>= 6 && dayIndex <=7)
			 System.out.println("This is Weekend");
		 else
			 System.out.println("Invalid Index");	 
	 } 
	 
	 public static void main (String[]args){
		 WeeksCalculator weekscalulator = new WeeksCalculator();
		 weekscalulator.weekdays(3);
		 weekscalulator.weekdays(6);
		 weekscalulator.weekdays(12);
		 weekscalulator.weekdays(0);
	 }
}


/*
Assignment - 4 : 16th Dec2021

Program 1: Find weekdays or weekend based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday

dayIndex -> 3 : Weekday
dayIndex -> 6 : WeekEnd
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index
*/