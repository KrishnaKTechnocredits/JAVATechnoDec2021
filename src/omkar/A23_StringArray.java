package omkar;

public class A23_StringArray {
	//Program1
	int SecondMaxNumber(int a[]) {

		int max=0; int secondMax=0;
		for(int index=0;index<a.length;index++) {
			if(a[index]>max) 
				max=a[index];		
			if(a[index]>secondMax && a[index]!=max) 
				secondMax=a[index];
		}
		    return secondMax;
	}
	//Program2
	int SumOfNumbersInString(String input) {
		int sum=0;
		String temp="";
		for(int index=0; index<input.length(); index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch)) 
				temp=temp+ch;
			else if(temp!="") {
				sum=sum+Integer.parseInt(temp);
				temp="";
		    }
		}

		    return sum;
	}
	//Program3
	String Arrange(String input) {
		String lc="";
		String uc="";
		String digit="";
		String sc="";
		for(int index=0;index<input.length();index++){
			char ch= input.charAt(index);
			if(Character.isLowerCase(ch)) 
				lc=lc+ch;
			else if (Character.isUpperCase(ch))
				uc=uc+ch;
			else if (Character.isUpperCase(ch))
				uc=uc+ch;
			else if (Character.isDigit(ch))
				digit=digit+ch;
			else
				sc=sc+ch;
		}
		    return lc+uc+digit+sc;
	}
	//Program4
	int DifferenceOfNumbers(String input) {
		String s="";
		int oddsum=0;
		int evensum=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch)) 
				s=s+ch;
			else if (s!="") {
				if(Integer.parseInt(s)%2==0 && Integer.parseInt(s)!=0) {
					evensum=evensum+Integer.parseInt(s);
					s="";
				}
				else {
				     oddsum=oddsum+Integer.parseInt(s);
				     s="";
			    }
			}
	   }
		  return oddsum-evensum;
	}
	//Program6
	String ArrangeSeries(String input) {
		String uppercase="", evendigit="", oddigit="" ;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch) && input.charAt(index)%2==0) {
				evendigit=evendigit+ch;
			}else if(Character.isDigit(ch) && input.charAt(index)!=0) {
				oddigit=oddigit+ch;
			}else if(Character.isLetter(ch) && Character.isUpperCase(ch)) {
				uppercase=uppercase+ch;
			}
		}
		    return oddigit+uppercase.charAt(0)+evendigit;
	}
	//Program7
	void checkArrays(int arrA[],int arrB[]) {
		boolean result=true; 

		 if(arrA.length==arrB.length) {
			for(int index=0;index<arrA.length;index++) {
				if(arrA[index]!=arrB[index]) {
					result=false;
				}
			}
		 }
		 else {
			  result=false;
		 }
		 if(result==true) {
			 System.out.println("Arrays are Equal");
		 }
		 else {
			 System.out.println("Arrays are not Equal");
		 }
	}
		public static void main(String[] args) {
		A23_StringArray stringarray=new A23_StringArray();
		int arr[]={1,11,3,99,66,54,22,44};
		int temp=stringarray.SecondMaxNumber(arr);
        System.out.println("Second maximum number is :"+temp);
        String str="te12ch22nocre3dits";
        int a=stringarray.SumOfNumbersInString(str);
        System.out.println("Sum of digits in the given String: "+a);
        String str1="te4c&Hno7CreD-8i*ts";
        String temp1=stringarray.Arrange(str1);
        System.out.println("Required String after arrangement :"+temp1);
        String str2="tec5hno3cre6di1ts";
        int var=stringarray.DifferenceOfNumbers(str2);
        System.out.println("Difference of odd and even numbers in a String: "+var);
        String str3="eTe1CH9cred4it6s";
        String s=stringarray.ArrangeSeries(str3);
        System.out.println("Required series after arrangement" +s);
        int[] arr1={10,44,-33};
        int[] arr2={10,44,-33};
        int[] arr3={10,44,-33};
        int[] arr4={10,44,-33,55};
        stringarray.checkArrays(arr1,arr2);
        stringarray.checkArrays(arr3, arr4);
       }
}