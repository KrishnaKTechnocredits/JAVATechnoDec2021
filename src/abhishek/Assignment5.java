class Assignment5 {
	void printEvenNumber(int startnumber, int endnumber) {
		System.out.println("output of method 1 :PrintEvenNumber ");
		for (int num = startnumber ; num <= endnumber ; num++) {
			if (num %2 ==0)
				System.out.println(num);
		}
	}
	
	void divisibleBy5(int startnumber, int endnumber) {
		System.out.println("output of method 2 :DivisibleBy5");
		for (int num = startnumber ; num <= endnumber ; num++) {
			if (num %5 ==0)
				System.out.println(num);
		}
	}
	
	void divisibleBy5And13(int startnumber, int endnumber) {
		System.out.println("output of method 3 : DivisibleBy5And13");
		System.out.println("Divisible by 5 & 3 numbers are: ");
		for (int num = startnumber ; num <= endnumber ; num++) {
			if (num %3 ==0 && num %5 ==0)
				System.out.println(num);
		}
	}
	
	void divisibleBy7Or13(int startnumber, int endnumber) {
		System.out.println("output of method 4 : DivisibleBy7Or13");
		System.out.println("Divisible by 7 or 13 numbers are: ");
		for (int num = startnumber ; num <= endnumber ; num++) {
			if (num %7 ==0 || num %13 ==0) {
				if(num%7 ==0)
				System.out.println(num +"is divisible by 7 ");
			else
				System.out.println(num +"is divisible by 13 ");
			}
		}
	}
	
	void sumOfNumber(int startnumber, int endnumber) {
		System.out.println("output of method 5:SumOfNumber");
		int sum = 0;
		for (int num = startnumber ; num <= endnumber ; num++) {
			sum = sum+num;
		}
		System.out.println("sum is "+ sum);
	}
	
	void diffOfOddEven(int startnumber, int endnumber) {
		System.out.println("output of method 6 : DiffOfOddEven");
		int even = 0;
		int odd =0;
		for (int num = startnumber ; num <= endnumber ; num++) {
			if(num%2 ==0)
				even = even+num;
			else
				odd = odd+num;
		}
		System.out.println(odd - even);
	}
	
	void oddNumbersRev(int startnumber, int endnumber) {
		System.out.println("output of method 7 : OddNumbersRev");
		for (int num = endnumber ; num >= startnumber ; num--) {
			if(num%2 !=0)
				System.out.println(num);
		}
	}
	
	public static void main (String[] args) {
		Assignment5 assignment5 = new Assignment5();
		assignment5.printEvenNumber(10,15);
		assignment5.divisibleBy5(10,30);
		assignment5.divisibleBy5And13(5,18);
		assignment5.divisibleBy7Or13(5,40);
		assignment5.sumOfNumber(1,5);
		assignment5.diffOfOddEven(3,9);
		assignment5.oddNumbersRev(10,20);
	}
}
	

	
	