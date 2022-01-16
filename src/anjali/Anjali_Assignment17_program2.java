/*Assignment - 17 : 1st Jan'2022
Program 2: return String having maximum vowels from given array.
Sample input : String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
output : aakanksha           
 */
package anjali;

public class Anjali_Assignment17_program2 {
	String maximumvowel(String[] arr){
		int maxcount=0;
		int cnt=0;
		String name="";
		String namehavingmaxvowel="";
		for(int index=0;index<arr.length;index++){
		    name=arr[index];
			 cnt=0;
			for(int index1=0;index1<name.length();index1++){
					if(name.charAt(index1)=='a'||name.charAt(index1)=='e'||name.charAt(index1)=='i'
							||name.charAt(index1)=='o'||name.charAt(index1)=='u')
						cnt++;
		    } 
			//System.out.println("The count of vowel in "+name+ " is "+cnt);
			//System.out.println(maxcount);
				if(cnt>maxcount) {
					maxcount=cnt;
					namehavingmaxvowel=name;
					}
	          }
		return namehavingmaxvowel;
	}

	public static void main(String[] args) {
		Anjali_Assignment17_program2 assignment17_program2= new Anjali_Assignment17_program2();
		String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		String MaxName=assignment17_program2.maximumvowel(arr);
		System.out.println(MaxName);
		
	}

}
