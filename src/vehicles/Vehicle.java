package vehicles;

public class Vehicle {
	protected String typeOfVehicle;
	protected int travellingDistance;
	protected int refillingTime;
	public void ShowCharacteristics() {
		System.out.println("Vehicle information:");
		System.out.println("\tType: " + this.typeOfVehicle);
		System.out.println("\tTravelling distance: " + this.travellingDistance + " miles");
		if (this.typeOfVehicle.matches("BEV"))
			System.out.println("\tRefilling time (Fast charge: 150kW): " 
					+ this.refillingTime + " min");
		else
			System.out.println("\tRefilling time: " + this.refillingTime + " min");
	}
}
