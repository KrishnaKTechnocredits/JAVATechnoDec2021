package kavleen;

public class Assignment23_Difference {


	void differenceFromOddDigits(String input){
		int even = 0;
	    int odd = 0 ;
		String temp = "";
		for (int index=0 ; index<input.length();index++){
			char ch = input.charAt(index);
			if(Character.isDigit(ch)){
		      temp +=ch;
			  int num = Integer.parseInt(temp.valueOf(ch));
			  if(num%2 !=0){
				  odd += num;
			  }else
			      even += num;
		}
	}
	   System.out.println("Diff between sum of odd and even numbers is " + (odd-even));
	}
	public static void main(String [] args){
		Assignment23_Difference assignmentdiff = new Assignment23_Difference();
		String num = "tec5hno3cre6di1ts";
		assignmentdiff.differenceFromOddDigits(num);
	}	
}
