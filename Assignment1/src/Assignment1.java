/*
// AUTHOR: Brandon Chao
// FILENAME: Assignment1.java
// SPECIFICATION: Pt. 1 Descriptions to Expressions.java     Pt. 2 Program to display distances given by user in different units 
// FOR: CS 1400 - ASSIGNMENT #1
// TIME SPENT: 1HR
//*/

//Assignment Part 1
//a  A multiplied by C then add the result to B. 15*5 Then +17=91
//b A mod C then D divided by D add the two results. 15Mod5, 17/17, result 0+1=1
//c Add 1 to A. 15+1=16
//d D Mod C, finding remainder. 17Mod5= 2
//e D divided by C no decimals. 17/5=3
//f A Divided by B. Then D + result + b. 15/17=0, 16+0+17=33
//g D add A, D add B. Divide the two No Decimal. 15+17=32, 16+17=33. 32/33=0
//h A multiplied by A. Take the square root, result is a double. 15^2 = 225 Sqrt(225)=15.0
//i  A to the power of 2.Returns Double. 15^2=225
//j Finds the max between A and B, in this case B. 16

//Assignment Part 2
import java.util.Scanner;

public class Assignment1 
{
	String athleteName;
	double[] athleteDistancesMeter;
	double[] athleteDistancesYard;
	double[] athleteDistancesFeet;
	double[] athleteDistancesInch;
	double[] athleteDistancesCm;
	
	//Will Store and Calculate all Data in Assignment1 Obj
	public Assignment1()
	{
		athleteDistancesMeter = new double[3];
		athleteDistancesYard = new double[3];
		athleteDistancesFeet = new double[3];
		athleteDistancesInch = new double[3];
		athleteDistancesCm = new double[3];
	}
	
	
	public double calculateYards(double distance) {
		return distance*1.093;
	}
	public double calculateFeet(double distance) {
		return distance*3;
	}
	public double calculateInch(double distance) {
		return distance*12;
	}
	public double calculateCm(double distance) {
		return distance*100;
	}
	
	
	public void setDistances(double distance,int i) {
		athleteDistancesMeter[i] = distance;
		athleteDistancesYard[i] = calculateYards(distance);
		athleteDistancesFeet[i] = calculateFeet(athleteDistancesYard[i]);
		athleteDistancesInch[i] = calculateInch(athleteDistancesFeet[i]);
		athleteDistancesCm[i] = calculateCm(distance);
	}
	public void setName(String name){
		athleteName = name;
	}
	
	public String getName() {
		return athleteName;
	}
	public double[] getYard() {
		return athleteDistancesYard;
	}
	public double[] getFeet() {
		return athleteDistancesFeet;
	}
	public double[] getInch() {
		return athleteDistancesInch;
	}
	public double[] getCm() {
		return athleteDistancesCm;
	}
	
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the competitor's name: ");
		Assignment1 contestant = new Assignment1();
		contestant.setName(scanner.nextLine());
		
		//Asking for Name
		System.out.println("\nOlympic Javelin Throws");
		System.out.println("Enter the distances, in meters for, "+contestant.getName()+"\n");
		
		//Asking for Distances
		double temp;
		for (int i = 0; i< 3; i++)
		{
			//Only Want Double, if it is int convert, otherwise ask for different value
			System.out.print("Enter the distance for throw "+(i+1)+": ");
			if (scanner.hasNext() && scanner.hasNextDouble())
			{
				contestant.setDistances(scanner.nextDouble(), i);
			}
			else if(scanner.hasNextInt())
			{
				temp = scanner.nextInt();
				contestant.setDistances(temp, i);
			}
			else
			{
				System.out.println("Please enter a number, not anything else.");
				scanner.next();
				i--;
			}
		}
		scanner.close();
		
		//Display Distances in different units
		System.out.print("\n");
		System.out.printf("%-10s%-10s%-10s%-10s\n","Yards","Feet","Inch","Cm");
		for (int i=0; i<3; i++) 
		{
			System.out.printf("%-10.2f%-10.2f%-10.2f%-10.2f\n",
					contestant.getYard()[i],
					contestant.getFeet()[i],
					contestant.getInch()[i],
					contestant.getCm()[i]);
		}
		
	}//End Main
	
}//End Class
