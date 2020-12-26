
public class Student {
	private String firstName, lastName, fullName, broncoId;
	private double grade;
	
	public Student(String fName, String lName, String broncoId)
	{
		firstName = fName;
		lastName = lName;
		this.broncoId = broncoId;
		grade = -1.0;
		fullName = fName + " " + lName;
	}
	
	//Set Methods
	public void setGrade(double newGrade)
	{
		grade = newGrade;
	}
	
	//Get Methods
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getFullName() { return fullName; }
	public String getBroncoId() { return broncoId; }
	public double getGrade() { return grade; }
	
	public String toString()
	{
		return ("Student: " + fullName + ", Bronco Id: " + broncoId + ", Grade: " + grade);
	}
}
