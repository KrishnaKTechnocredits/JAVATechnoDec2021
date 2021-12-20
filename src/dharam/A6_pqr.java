package dharam;
class A6_pqr{
	void weekday(int day){
	if (day>1 && day <6){
		System.out.println("weekday");
	}else if (day >=6 && day<11){
		System.out.println("weekend");
	}else
		System.out.println("Invalid Index");
	}
	public static void main (String[]args){
		A6_pqr dayIndex = new A6_pqr();
		dayIndex.weekday(3);
		dayIndex.weekday(6);
		dayIndex.weekday(11);
		dayIndex.weekday(-3);
	} 
}