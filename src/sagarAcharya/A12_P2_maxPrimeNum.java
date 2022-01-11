import java.util.Scanner;

class A12_P2_maxPrimeNum{
	
	int maxPrime;
	void findPrimeNum(int num,boolean nonPrimeprint,boolean printPrime){
		boolean flag = true;
		for(int index = 2;index<=num/2;index++){
			if(num % index == 0){
				if(nonPrimeprint == true)
					System.out.println(num + " Is not a prime number");
					flag = false;
					break;
			}
		}
			if(flag == true){
				maxPrime = num;
				if(printPrime == true)
					System.out.println(num + " is a prime number.");
			}
		//maxPrime = num;
		//return flag;
	}

	void getMaxPrime(int fNum,int lNum){
		for(int i = fNum;i <= lNum;i++){
			findPrimeNum(i,false,false);
		}
		System.out.println("Max Prime Num from given range is : "+maxPrime);
	}
	
	public static void main(String[] args){
		A12_P2_maxPrimeNum a12_p2_maxprimenum = new A12_P2_maxPrimeNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num for your range -");
		int num1 = sc.nextInt();
		System.out.println("Enter Last num for your range -");
		int num2 = sc.nextInt();
		
		a12_p2_maxprimenum.getMaxPrime(num1,num2);
		
	}
}

/* 1. print freq of each character in given String. [prgram-1]
2. find max primenumber from given range. [range : 2 to 100, ans ; 97] [program-2]
3. find the first non repeating character from given string. [program-3]
   input : technocredits
   output : h
4. find the first repeating character from given string. [program-3]
   input : shivangi
   output : i
5. write a method to return the reverse string. [program-3] */