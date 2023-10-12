package vehicles;
import engines.ElectricEngine;

public class BEV extends Vehicle{
	public Manufacture manufacture;
	public ElectricEngine motor; 
	
	double batteryCapacity;
	String typeOfBattery;
	String chargingCableAC;
	String chargingCableDC;
	
	public BEV(double batCapacity, String typeBattery, String cableAC, String cableDC,
			int travellingDistance, int refillingTime) {
		this.typeOfVehicle = "BEV";
		this.travellingDistance = travellingDistance;
		this.refillingTime = refillingTime;
		
		this.batteryCapacity = batCapacity;
		this.typeOfBattery = typeBattery;
		this.chargingCableAC = cableAC;
		this.chargingCableDC = cableDC;
	}
	
	public void ShowCharacteristics() {
		super.ShowCharacteristics();
		System.out.println("\tBattery: " + "\n\t\tCapacity: " + this.batteryCapacity + " kWh"
				+ "\n\t\tType: " + this.typeOfBattery);
		System.out.println("\t" + "Charging cables: \n\t\tAC: " + this.chargingCableAC 
				+ "\n\t\tDC: " + this.chargingCableDC);
		manufacture.printCharacteristics();
		motor.printEngineInfo();
	}
}
