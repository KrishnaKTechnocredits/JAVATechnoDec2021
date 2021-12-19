package jagdish;
class SumofNumber{
	
	int num1 = 10;
	int num2 = 20;
	int num3 = 30;
	
	void setData(){
		int ans = num1+num2+num3;
		System.out.println("Sum of No. is: "+ans);
	}
		
	public static void main(String[] args){
		SumofNumber sumofnumber = new SumofNumber();
		sumofnumber.setData();
	}
}