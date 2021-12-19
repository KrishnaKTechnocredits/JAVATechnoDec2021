package ranjeet;
class DivisibleFiveThree{

	void devide(int startNo, int endNo){
		int num;
		for(num = startNo; num <=endNo; num++ ){
			if(num%5 == 0 && num%3 ==0){
			System.out.println("Number is divisible by 5 and 3 is = "+num);
			}
		}
	
	}
	public static void main(String[] args){
	DivisibleFiveThree divisibleFiveThree = new DivisibleFiveThree();
	divisibleFiveThree.devide(5, 18);
	
	}
}