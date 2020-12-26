
public class Collection {
	int[] numArray;
	int count;//Number of values stored in numArray
	
	public Collection(int arraySize)
	{
		numArray = new int[arraySize];
		count = 0;
	}
	
	
	//Find the int in the array returns index, if not there return -1
	private int search(int searchingNum)
	{
		for(int i=0; i<numArray.length;i++)
		{
			if(searchingNum == numArray[i])
				return i;
		}
		return -1;
	}
	
	//Adding numbers to the Array
	public boolean add(int numberToAdd)
	{
		//Make sure number doesn't exist
		if(search(numberToAdd)==-1)
		{
			//Make sure array still has room
			if(count != (numArray.length-1))
			{

				numArray[count++] = numberToAdd;
			}
			else
			{
				doubleArray();
				numArray[count++] = numberToAdd;
			}
			return true;
		}
		else
			return false;
	}
	
	//Replaces value with the value one to the right of it
	public boolean remove(int numberToRemove)
	{
		int indexEnd = count;
		int indexStart= search(numberToRemove);
		
		if(indexStart != -1)
		{
			for(int i = indexStart; i<indexEnd;i++)
			{
				if(i<numArray.length-1)
				{
					numArray[i] = numArray[i+1];
				}
			}
			count--;
			return true;
		}
		else
			return false;
		
	}
	
	//Make new array reassign values, reassign pointer on numArray
	private void doubleArray()
	{
		
		int[] newArray = new int[numArray.length*2];
		
		for(int i =0;i<numArray.length;i++)
		{
			newArray[i] = numArray[i];
		}
		
		numArray = newArray;
	}
	
	//Assign first index as largest, and loop through all values to compare
	public int findLargest()
	{
		int big = numArray[0];
		for(int i=1;i<numArray.length;i++)
		{
			if(big < numArray[i])
				big = numArray[i];
		}
		return big;

	}
	
	//Adds all numbers that arent zero together and finds average
	public double computeAvg()
	{
		double avg=0;
		int counter = 0;
		for(int i=0;i<numArray.length;i++)
		{
			if(numArray[i]!=0) {
				avg+=numArray[i];
				counter ++;
			}
		}
		return avg/counter;
	}
	
	public int countPositives()
	{
		int count = 0;
		for(int i =0;i<numArray.length;i++)
		{
			if(numArray[i]>0) {
				count ++;
			}
		}
		return count;
	}
	
	//Goes through the array, if it is a zero, won't include it
	public String toString()
	{
		String array = "{";
		for(int i=0;i<numArray.length;i++) {
			if(numArray[i]!=0)
			{
				if(i != numArray.length-1)
				{
					if(numArray[i+1] != 0)
						array += numArray[i] + ",";
					else
						array += numArray[i];
				}
				else {
					array += numArray[i];
				}
					
				
			}
		}
		return array+"}";
	}
}
