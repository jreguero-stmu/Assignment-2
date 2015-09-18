public class Tank extends Vehicle{
	
	private double armorWidth;
	
	
	public Tank(){
		armorWidth = 52;
	}
	
	public Tank(int year, double weight, double armorWidth){
		this.setYear(year);
		this.setWeight(weight);
		this.setArmorWidth(armorWidth);
	}
	
	public double getArmorWidth() {
		return armorWidth;
	}

	public void setArmorWidth(double armorWidth) {
		this.armorWidth = armorWidth;
	}
	
	
	public String toString(){
		return "Year: " + this.getYear() + " " + "Weight: " + this.getWeight() + " " + "ArmorWidth: " + this.getArmorWidth();
	}

}
