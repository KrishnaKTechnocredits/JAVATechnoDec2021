package hevin;

public class Exam4_PrimeLengthWord {
	
	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	String getPrimeLengthWord(String input) {
		String output = "";
		String[] word = input.split(" ");
	
		for(int i=0;i<=word.length-1;i++)
		{ 
			if(word[i].length()>1)
			{
				if(isPrime(word[i].length()))
					output = output + " " + word[i];
			}

		}
		return output.trim();
	}
	
	public static void main(String[] args) {
		Exam4_PrimeLengthWord obj = new Exam4_PrimeLengthWord();
		String input1 = "I love my India";
		String input2 = "I would like to have a cup of tea";
		System.out.println("Input String : " + input1);
		System.out.println("Words That having Prime Number length : " + obj.getPrimeLengthWord(input1));
		System.out.println();
		System.out.println("Input String : " + input2);
		System.out.println("Words That having Prime Number length : " + obj.getPrimeLengthWord(input2));
		
	}
}