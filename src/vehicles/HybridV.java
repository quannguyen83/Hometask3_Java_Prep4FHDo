package vehicles;
import engines.HybridEngine;

public class HybridV extends Vehicle{
	public Manufacture manufacture;
	public HybridEngine engine;
	String typeOfHybrid;
	String typeOfBattery;
	double combinedPowerConsumption; 
	boolean isPlug;
	
	public HybridV(String typeOfHybrid, double combinedPowerConsumption, 
			String typeOfBattery, boolean isPlug,
			int travellingDistance, int refillingTime) {
		this.typeOfVehicle = "HybridV";
		this.typeOfHybrid = typeOfHybrid;
		this.typeOfBattery = typeOfBattery;
		this.combinedPowerConsumption = combinedPowerConsumption;
		this.isPlug = isPlug;
		
		this.travellingDistance = travellingDistance;
		this.refillingTime = refillingTime;
	}
	
	public void ShowCharacteristics() {
		super.ShowCharacteristics();
		System.out.println("\tType of Hybrid: " + this.typeOfHybrid);
		System.out.println("\tCombined Power Consumption: " + this.combinedPowerConsumption + " kW");
		System.out.println("\tBattery type: " + this.typeOfBattery);
		manufacture.printCharacteristics();
		engine.printEngineInfo();
	}
}
