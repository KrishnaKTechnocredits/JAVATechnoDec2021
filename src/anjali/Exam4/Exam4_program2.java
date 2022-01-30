package anjali.Exam4;

public class Exam4_program2 {
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
	 String processData(String name)
	{
		String temp="";
		String[] arr=name.split(" ");
		for(int index=0;index<arr.length;index++)
		{ 
			if(arr[index].length()>1)
			{
				if(isPrime(arr[index].length()))
				temp=temp+" "+arr[index];
			}
				
		}
		return temp;
		
	}
	

	public static void main(String[] args) {
		Exam4_program2 exam4_program2 = new Exam4_program2();
		String output2=exam4_program2.processData("I my India");
		System.out.println(output2);
		String output3=exam4_program2.processData("I would like to have a cup of tea");
		System.out.println(output3);

	}

}
