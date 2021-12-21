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