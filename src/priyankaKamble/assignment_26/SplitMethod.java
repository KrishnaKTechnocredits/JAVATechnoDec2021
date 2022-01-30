package priyankaKamble.assignment_26;

/*Assignment 26 : 20th Jan'2022

WAP to find out the value of id form the given input url.
String url = "https://automationbykrishna.com/name=techno/id=123";
Output = "123"

Hint : use split()
 */
public class SplitMethod {

	void findID(String url) {
		String[] arr= url.split("=");
		int digit=0;
		for(int index = 0; index < url.length(); index++) {
			try {
				digit += Integer.parseInt(arr[index]);
			}
			catch(Exception e){
			}
		}
		System.out.println("ID = " +digit);
	}
	
	
	public static void main(String[] args) {
		SplitMethod split = new SplitMethod();
		String url = "https://automationbykrishna.com/name=techno/id=123";
		System.out.println("input Strinh -> "+url);
		split.findID(url);
		
	}
}
