package Arrays;

public class DVD {
	public String Name;
	public int Year;
	
	public DVD(String Name,int Year) {
		this.Name = Name;
		this.Year = Year;
	}
	
	public String toString() {
		return "Movie Name : " + this.Name + "\nReleased in Year : " + this.Year;
	}
}
