
public class Car extends Automobile{
	
	private int maxPassengers;
	
	
	public Car(){
		maxPassengers = 5;
	}
	
	
	public Car(int year, double weight, String licensePlate, String make, int maxPassengers){
		this.setYear(year);
		this.setWeight(weight);
		this.setLicensePlate(licensePlate);
		this.setMake(make);
		this.setMaxPassengers(maxPassengers);
	}
	
	
	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	
	public String toString(){
		return "Year: " + this.getYear() + " " + "Weight: " + this.getWeight() + " " + 
				"LicensePlate: " + this.getLicensePlate() + " " + "Make: " + this.getMake() + " MaxPassengers: " + 
				this.getMaxPassengers();
	}

}
