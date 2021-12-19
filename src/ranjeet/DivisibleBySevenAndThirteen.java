package ranjeet;
class DivisibleBySevenAndThirteen{
	
	void printData(int startNo, int endNo){
		int num;
		for(num = startNo; num <=endNo; num++){
			if(num%7 == 0){
				System.out.println(num+" is devisible by 7");
			}else if(num%13 == 0){
				System.out.println(num+" is devisible by 13");
			}
		}
	
	}
	public static void main(String[] args){
		
		DivisibleBySevenAndThirteen divisibleBySevenAndThirteen = new DivisibleBySevenAndThirteen();
		divisibleBySevenAndThirteen.printData(5, 40);
	}
}