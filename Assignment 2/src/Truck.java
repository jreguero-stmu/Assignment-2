public class Truck extends Automobile{
	
	private double towCapacity;
	
	
	public Truck(){
		towCapacity = 6000;
	}
	
	
	public Truck(int year, double weight, String licensePlate, String make, double towCapacity){
		this.setYear(year);
		this.setWeight(weight);
		this.setLicensePlate(licensePlate);
		this.setMake(make);
		this.setTowCapacity(towCapacity);
	}
	
	public double getTowCapacity() {
		return towCapacity;
	}

	public void setTowCapacity(double towCapacity) {
		this.towCapacity = towCapacity;
	}
	
	public String toString(){
		return "Year: " + this.getYear() + " " + "Weight: " + this.getWeight() + " " + 
				"LicensePlate: " + this.getLicensePlate() + " " + "Make: " + this.getMake() + " TowCapacity: " + 
				this.getTowCapacity();
	}

}
