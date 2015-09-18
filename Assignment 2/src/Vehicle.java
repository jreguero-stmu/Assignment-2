public class Vehicle {
	
	private int year;
	private double weight;
	
	public Vehicle(){
		year = 2015;
		weight = 4000;
	}
	
	public Vehicle(int year, double weight){
		this.setYear(year);
		this.setWeight(weight);
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString(){
		return "Year: " + this.getYear() + " " + "Weight: " + this.getWeight() + " ";
	}

}
