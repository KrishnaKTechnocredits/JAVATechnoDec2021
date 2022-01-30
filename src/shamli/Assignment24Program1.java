package shamli;

public class Assignment24Program1 {
	
	void calculateLengthOfSeparateString(String[] input)
	{
		for(int index=0;index<input.length;index++)
		{
			System.out.println(input[index]+" : "+ input[index].length());
		}
	}

	public static void main(String[] args) {
		Assignment24Program1 assignment24program1= new Assignment24Program1();
		String str="Hi Hello GM Techno";
		String[] arr=str.split(" ");
		assignment24program1.calculateLengthOfSeparateString(arr);
	}

}
