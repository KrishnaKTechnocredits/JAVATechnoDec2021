package sagarAcharya;

class Dayindex{
	
	void indexMethod(int num){
		if(num >=1 && num <=5)
			System.out.println("Dayindex is Weekday");
		else if(num >=6 && num <=7)
			System.out.println("Dayindex is Weekend");
		else
			System.out.println("Invalid Index");
	}
	
	public static void main(String[] args){
		Dayindex dayindex = new Dayindex();
		dayindex.indexMethod(6);
		dayindex.indexMethod(7);
		dayindex.indexMethod(11);
		dayindex.indexMethod(2);
	}
}