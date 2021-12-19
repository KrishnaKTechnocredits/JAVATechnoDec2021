package pradeep;

class Assignment4{
	void dayIndex(int index){
		if(index == 1 || index == 2 || index == 3 || index == 4 || index == 5 )
			System.out.println("dayIndex -> " + index + " :Weekdays");
		else if(index == 6 || index == 7)
			System.out.println("dayIndex -> " + index + " :Weekend");
		else
			System.out.println("dayIndex -> " + index + " :Invalid Index");
	}
	
	public static void main(String[] args){
		Assignment4 assignment4 = new Assignment4();
		assignment4.dayIndex(1);
		assignment4.dayIndex(2);
		assignment4.dayIndex(3);
		assignment4.dayIndex(4);
		assignment4.dayIndex(5);
		assignment4.dayIndex(6);
		assignment4.dayIndex(7);
		assignment4.dayIndex(11);
		assignment4.dayIndex(-3);
	}
}