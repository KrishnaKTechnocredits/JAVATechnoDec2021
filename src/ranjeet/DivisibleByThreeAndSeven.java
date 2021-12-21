package ranjeet;
class DivisibleByThreeAndSeven{
	int i = 1;
	
	void print(){
		for(int i = 1; i <=100; i++){
			if(i%3 == 0 && i%7 == 0){
			System.out.println(i);
			}
		}
	
	}
	
	public static void main(String[] args){
		DivisibleByThreeAndSeven divisibleByThreeAndSeven = new DivisibleByThreeAndSeven();
		divisibleByThreeAndSeven.print();
	}
}