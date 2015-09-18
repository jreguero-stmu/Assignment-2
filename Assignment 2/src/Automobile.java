public class Automobile extends Vehicle{
	
	private String licensePlate;
	private String make;
	
	public Automobile(){
		licensePlate = "UNKNOWN";
		make = "UNKNOWN";
	}
	
	public Automobile(int year, double weight, String licensePlate, String make){
		this.setYear(year);
		this.setWeight(weight);
		this.setLicensePlate(licensePlate);
		this.setMake(make);
	}
	
	
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	
	public String toString(){
		return "Year: " + this.getYear() + " " + "Weight: " + this.getWeight() + " " + 
				"LicensePlate: " + this.getLicensePlate() + " " + "Make: " + this.getMake();
	}

}
