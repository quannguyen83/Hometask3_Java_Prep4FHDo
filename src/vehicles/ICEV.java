package vehicles;
import engines.*;

public class ICEV extends Vehicle{
	public Manufacture manufacture;
	public CombustionEngine engine;
	
	String typeOfFuel;
	double fuelConsumption; 
	double CO2EmissionWeight;
	
	public ICEV (String typeOfFuel, double fuelConsumption, double CO2EmissionWeight,
			int travellingDistance, int refillingTime) {
		this.typeOfVehicle = "ICEV";
		this.typeOfFuel = typeOfFuel;
		this.fuelConsumption = fuelConsumption;
		this.CO2EmissionWeight = CO2EmissionWeight;
		
		this.travellingDistance = travellingDistance;
		this.refillingTime = refillingTime;
	}
	
	public void ShowCharacteristics() {
		super.ShowCharacteristics();
		System.out.println("\tFuel: " + "\n\t\tType: " + this.typeOfFuel
				+ "\n\t\tConsumption: " + this.fuelConsumption + " L/100km");
		System.out.println("\tCO2 emission weight: " + this.CO2EmissionWeight + " g/km");
		manufacture.printManufactureAttributes();
		engine.printEngineInfo();
	}
}
