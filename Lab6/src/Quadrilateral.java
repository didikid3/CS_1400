
public class Quadrilateral {
	private int side1,side2,side3,side4;
	
	
	//Get Methods
	public int getSide1()
	{
		return side1;
	}
	public int getSide2()
	{
		return side2;
	}
	public int getSide3()
	{
		return side3;
	}
	public int getSide4()
	{
		return side4;
	}
	
	//Set Methods
	public void setSide1(int length)
	{
		side1 = length;
	}
	public void setSide2(int length)
	{
		side2 = length;
	}
	public void setSide3(int length)
	{
		side3 = length;
	}
	public void setSide4(int length)
	{
		side4 = length;
	}
	
	//Checking for congruent diagonals by calculating with pythagoras theorem 
	private boolean	hasCongruentDiagonals(int side1, int side2, int side3, int side4)
	{
		double diagTopLBotR = Math.sqrt( (side1*side1) + (side2*side2) );
		double diagBotLTopR = Math.sqrt( (side2*side2) + (side3*side3) );
		
		if(diagTopLBotR == diagBotLTopR)
			return true;
		return false;
		
	}
	
	//Side 1 = Side 3 and Side 2 = Side 4 and Congruent Diagonals
	public boolean isRectangle() 
	{
		//Check sides
		if (side1 == side3 && side2 == side4) {
			//check congruent
			if(hasCongruentDiagonals(side1,side2,side3,side4))
				return true;
			return false;
		}
		return false;
	}
	
	//All sides equal and Congruent Diagonals
	public boolean isSquare()
	{
		//check sides
		if(side1==side2 && side3==side4 && side1==side3) {
			//check congruent
			if(hasCongruentDiagonals(side1,side2,side3,side4))
				return true;
			return false;
		}
		return false;
	}
}
