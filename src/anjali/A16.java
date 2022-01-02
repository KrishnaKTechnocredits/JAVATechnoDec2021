/*Assignment - 16 : 31st Dec'2021

print count of vowels in each input from String array and print total vowels.
input : String[] arr = {"priyanka", "swati", "acharya", "hevin" }
output : priyanka -> 3
              swati -> 2
              acharya -> 3
              hevin -> 2
total vowels -> 10
*/
package anjali;

public class A16{
	
	void printVowelInString(){
		String[] arr = {"priyanka", "swati", "acharya", "hevin" };
		int count = 0;
		int cnt=0;
		for(int index=0;index<arr.length;index++){
			String name=arr[index];
		    cnt=0;
			for(int index1=0;index1<name.length();index1++){
				if(name.charAt(index1)=='a'||name.charAt(index1)=='e'||name.charAt(index1)=='i'||name.charAt(index1)=='o'||name.charAt(index1)=='u') {
				count++;
				cnt++;
				}
			}System.out.println("The vowel is "+name+" String is : " +cnt);
		}System.out.println("The total vowel in array is : "+count);
		
	}

	public static void main(String[] args) {
		A16 a16 = new A16();
		a16.printVowelInString();
   }

}
