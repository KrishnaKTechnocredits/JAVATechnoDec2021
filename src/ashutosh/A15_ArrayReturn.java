package ashutosh;

public class A15_ArrayReturn {
	
	
	void maxOfArray1 (int [] arr1) {
		
		int max=arr1[0];
	
		for (int index=1;index<arr1.length;index++) {
			
			if (arr1[index]>max) {
				
				max= arr1[index];
			}
						
		 }
	
		System.out.println("Max number is  " + max);
		
	 }

		void minOfArray1 (int [] arr1) {
			
			int min=arr1[0];
		
			for (int index=1;index<arr1.length;index++) {
				
				if (arr1[index]<min) {
					
					min= arr1[index];
				}
							
			}
			
			System.out.println("Min number is  " + min);			
	
		}
		
		void positiveNumbers (int [] arr1) {
			
			int count=0;
					
			for (int index=0;index<arr1.length;index++) {
				
				if (arr1[index]>0) {
					
					count++;
				}
							
			}
			
			System.out.println("Positive numbers are  " + count);			
	
		 }	
		
			
		void sumOfPositiveNumbers (int [] arr1) {
			
			int sum=0;
					
			for (int index=0;index<arr1.length;index++) {
				
				if (arr1[index]>0) {
					
					sum=sum+arr1[index];
				}
							
			}
			
			System.out.println("Sum of Positive numbers are  " + sum);			
	
		 }	
		
void sumOfEvenPositiveNumbers (int [] arr1) {
			
			int sum=0;
					
			for (int index=0;index<arr1.length;index++) {
				
				if (arr1[index]>0 && arr1[index]%2==0) {
					
					sum=sum+arr1[index];
				}
							
			}
			
			System.out.println("Sum of Even Positive numbers are  " + sum);			
	
		 }	
			

	
	void findLength (String [] name) {
		
		int length= name[0].length();
		
		String str=name[0];
		
		for (int i=1;i<name.length;i++) {
			
				if (name[i].length()>length) {
					
					length=name[i].length();
				
					str=name[i];
				}	
					
		}
		
		System.out.println("Maximum length of given name is  " + length);
		
		System.out.println("Name with maximum length is  " + str);

	}

	public static void main(String[] args) {
		
		A15_ArrayReturn arrayReturn= new A15_ArrayReturn();
		
		int [] num = { -10, 21, -39, 55, 119, 4 };
		
		String [] name = { "Ashutosh", "Arun", "Shahi", "Technocredits"};
		
		arrayReturn.maxOfArray1(num);
		
		arrayReturn.minOfArray1(num);

		arrayReturn.positiveNumbers(num);
		
		arrayReturn.sumOfPositiveNumbers(num);
		
		arrayReturn.sumOfEvenPositiveNumbers(num);		
				
		arrayReturn.findLength(name);

	}	
		
}
