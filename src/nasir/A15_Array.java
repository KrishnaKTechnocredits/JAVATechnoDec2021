package nasir;
class A15_Array {
	void maxNumber(int[] num){
		int max=num[0];	
		for(int index=1; index<num.length;index++){
			if(max<num[index])
			max=num[index];
		}
		System.out.println("Maximum Number is "+max);
		System.out.println("....................................");
	}
	
	void minNumber(int[] num){
		int min= num[0];			
		for(int index=1; index<num.length;index++){
			if(min>num[index])
			min=num[index];
		}
		System.out.println("Minimum Number is "+min);
		System.out.println("....................................");
	}
	
	int getCountOfPositive(int[] num){
		int count=0;
		for(int index=0; index<num.length;index++){
			int output =num[index];
			if(output>0){
				System.out.println("Positive Number is "+output);
				count++;
			}
		}
		return count;
	}
	
	int getSumOfEvenPositive(int[] num){
		int sum=0;
		for(int index=0; index<num.length;index++){
			int output=num[index];
			if(output>0){
				System.out.println("Positive Number is "+output);
				sum=sum+output;
			}				
		}
		return sum;	
	}
	
	void sumOfEvenPositive(int[] num){
		int sum=0;
		for(int index=0;index<num.length;index++){
			if(num[index]%2==0){
				int evenNumber=num[index];
				if(evenNumber>0){
				System.out.println("Positive Even Number is "+evenNumber);
				sum=sum+evenNumber;
				}
			}
		}
		System.out.println("Total sum of all even positive number is "+sum);
		System.out.println("....................................");
	}
	
	String getNameMaxLength(String[] name){
		String ans;
		String ans1="";
		for(int index=0; index<name.length;index++){
			 ans=name[index];
			if(ans.length()>ans1.length())
				ans1=ans;				
		}
		return ans1;
	}
	public static void main(String[]args){
		A15_Array array = new A15_Array();
		int[] input = {10,210,11,40,5,55};
		array.maxNumber(input);
		array.minNumber(input);
		int[] input1 ={10,-11,12,13,-14,16};
		int totalcount=array.getCountOfPositive(input1);
				System.out.println("Total count of positive number is "+totalcount);
				System.out.println("....................................");
		int sumOfPositive=array.getSumOfEvenPositive(input1);	
				System.out.println("Total Sum of positive number is "+sumOfPositive);
				System.out.println("....................................");
		int[] input2 ={1,3,5,7,8,-10,10,-12,9,11,15,17};	
		array.sumOfEvenPositive(input2);
		String[] input3 = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar","NasirAhmedQureshi"};
		String nameOfMaximumLength=array.getNameMaxLength(input3);
				System.out.println("Maximum length of provide name is "+nameOfMaximumLength);
			
	}
}