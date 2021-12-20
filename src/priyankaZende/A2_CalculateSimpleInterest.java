package priyankaZende;
class A2_CalculateSimpleInterest {
	
	void simpleInterestCal(float principalAmt, float time, float rate){
		float simpleInt = (principalAmt * time * rate);
		System.out.println("Simple Interest is: " + simpleInt);
	}
	
	public static void main(String[] args){
		A2_CalculateSimpleInterest calculateSimpleInterest = new A2_CalculateSimpleInterest();
		calculateSimpleInterest.simpleInterestCal(10000f, 12.5f, 11.75f);
	}
}	