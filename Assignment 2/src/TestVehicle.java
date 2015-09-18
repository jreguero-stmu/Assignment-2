public class TestVehicle {

	public static void main(String[] args) {
		
		Car car = new Car(2009, 3500, "DFG584", "Porche", 5);
		System.out.println(car.toString());
		
		Truck truck = new Truck();
		System.out.println(truck.toString());
		
		Tank tank = new Tank(1980, 120000, 52.5);
		System.out.println(tank.toString());

	}

}
