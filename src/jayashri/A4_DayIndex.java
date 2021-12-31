package jayashri;

class A4_DayIndex{

	void findDay(int index){
		if(index>=1 && index<=5){
			System.out.println("Weekday");
		}
		else if(index>=6 && index<=7){
			System.out.println("Weekend");
		}
		else{
			System.out.println("Invalid Index");
		}
	}
	
	public static void main(String[] args){
		A4_DayIndex a4_dayIndex = new A4_DayIndex();
		a4_dayIndex.findDay(1);
		a4_dayIndex.findDay(4);
		a4_dayIndex.findDay(6);
		a4_dayIndex.findDay(11);
		a4_dayIndex.findDay(-2);
	}

}