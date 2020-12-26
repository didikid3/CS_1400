
public class Geek2 {

	public static boolean find(String str, String match)
	{
		if(str.length() >= match.length() && str.substring(0,match.length()).equals(match))
			return true;
		else if(str.length() < match.length())
			return false;
		else
			return find(str.substring(1,str.length()),match);
	}
	
	public static int digitSum(int n)
	{
		if(n/10 >= 1)
			return n%10 + digitSum(n/10);
		else
			return n;
	}
	
	public static int pow(int a, int n)
	{
		if(n > 1)
			return a*pow(a,n-1);
		else
			return a;
	}
	
	public static int smallestDigit(int number)
	{
		if(number/100 == 0)
			return Math.min(number/10, number%10);
		else
		{
			String numString = Integer.toString(number);
			int first = Integer.parseInt(numString.substring(0,1));
			int last = Integer.parseInt(numString.substring(1,numString.length()));
			return Math.min(first, smallestDigit(last));
		}
	}
	
	public static String reverse(String text)
	{
		if(text.length() == 1)
			return text;
		else
			return reverse(text.substring(1,text.length())) + text.charAt(0);
	}
}
