/*
// AUTHOR: Brandon Chao
// FILENAME: Geek.java
// SPECIFICATION: Learn about methods. Methods are similar to old assignments/labs
// FOR: CS 1400 - ASSIGNMENT #5
// TIME SPENT: 1HR
//*/

public class Geek {
	
	private String name;
	private int numQuestions;
	
	public Geek(String name)
	{
		this.name = name;
		numQuestions = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNumberOfQuestions()
	{
		return numQuestions;
	}
	
	//Check for even
	public boolean isEven(int num)
	{
		numQuestions+=1;
		if(num%2==0)
			return true;
		return false;
	}
	
	//Repeat a string(text) a number(count) times
	public String multiConcat(String text, int count)
	{
		numQuestions+=1;
		//placeholder string
		String concat = "";

		for(int i=0;i<count;i++)
		{
			concat += text;
		}
		
		return concat;
	}
	
	//Add all the numbers excluding the bounds. D:(num1,num2)
	public int sumRange(int num1, int num2)
	{
		numQuestions+=1;
		
		int sum = 0;
		//If Numbers are equal or num1 > num2
		if(num1==num2 || num1>num2)
			return 0;
		//Otherwise find the sum
		for(int i = (num1+1); i<num2; i++)
		{
			sum += i;
		}
		return sum;
	}
	
	//Check in nums are sorted num1<num2<num3
	public boolean sorted(int num1, int num2, int num3)
	{
		numQuestions+=1;
		if(num1 <= num2 && num2 <= num3)
			return true;
		return false;
	}
	
	//Count the amount of As lower/upper in a string(text)
	public int countA(String text)
	{
		numQuestions+=1;
		
		int count = 0;
		for(int i=0;i<text.length();i++)
		{
			//Converting string to uppercase, and looking 1 char at a time
			if(text.toUpperCase().charAt(i) == 'A')
				count += 1;
		}
		return count;
	}
	
	//Count the number of digits
	public int countDigits(int num)
	{
		numQuestions+=1;
		
		int count = 0;
		//Continue to do integer division, divide by 10, until no more digits
		while(num > 0) {
			count += 1;
			num = num/10;
		}
		return count;
	}
	
	public boolean isPrime(int num)
	{
		numQuestions+=1;
		
		//checking every number in D:(1,num) to see if it is divisible
		for(int i=2;i<num;i++) {
			if(num%i == 0)
				return false;
		}
		return true;
	}
	
}

