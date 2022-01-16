package sagarAcharya;
import java.util.Scanner;
class A16_P1_ArrayFreqChar{
	
	public static void main(String[] args){
		A16_P1_ArrayFreqChar a16 = new A16_P1_ArrayFreqChar();
		//System.out.println("Enter Name : ");
		Scanner sc = new Scanner(System.in);
		//String name = sc.next();
		//System.out.println("Enter Character : ");
		//char c = sc.next().charAt(0);
		//a16.findFreqChar(name,c);
		String[] arr = {"priyanka", "swati", "acharya", "hevin" };
		System.out.println("Enter Character for Array : ");
		char c2 = sc.next().charAt(0);
		a16.findFreqInArray(arr,c2);
	}
	
	//int count1;
	int getFreqChar(String input,char ch){
		int count = 0;
		for(int index = 0;index<input.length();index++){
			if(input.charAt(index) == ch){
				count++;
				//count1++;
			}
		}
		//System.out.println(input+"--"+count);
		return count;
	}
	
	void findFreqInArray(String[] inputNew,char c1){
		int cnt = 0;
		for(int index1 = 0;index1 < inputNew.length;index1++){
			int temp = getFreqChar(inputNew[index1],c1);
			System.out.println(inputNew[index1] + "--" + temp);
			cnt += temp;
		}
		System.out.println(cnt);
	}
}

