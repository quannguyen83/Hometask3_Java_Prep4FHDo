package engines;

public class HybridEngine extends Engine{
	String typeHybridEngine;
	public HybridEngine(String typeHybridEngine, int rotationSpeed, int maxPower, int maxTorque) {
		this.typeOfEngine = "Hybrid";
		this.typeHybridEngine = typeHybridEngine;
		this.rotationSpeed = rotationSpeed;
		this.maxPower = maxPower; 
		this.maxTorque = maxTorque;
	}
	
	public void printEngineInfo() {
		super.printEngineInfo();
		System.out.println("\t\tHybrid engine type: " + this.typeHybridEngine);
		System.out.println("\t\tMax Power: " + this.maxPower + " kW");
		System.out.println("\t\tMax Torque: " + this.maxTorque + " Nm");
	}
}
