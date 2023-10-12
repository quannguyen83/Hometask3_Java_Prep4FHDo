package engines;

public class CombustionEngine extends Engine{
	private String engineName;
	private int engineSize;
	
	public CombustionEngine (String engineName, int engineSize,
			int rotationSpeed, int maxPower, int maxTorque) {
		this.typeOfEngine = "Combustion";
		this.engineName = engineName;
		this.engineSize = engineSize;
		
		this.rotationSpeed = rotationSpeed;
		this.maxPower = maxPower;
		this.maxTorque = maxTorque;
	}
	
	public void printEngineInfo() {
		super.printEngineInfo();
		System.out.println("\t\tEngine name: " + this.engineName);
		System.out.println("\t\tEngine size: " + this.engineSize + " cc");
		System.out.println("\t\tMax Power: " + this.maxPower + " kW");
		System.out.println("\t\tMax Torque: " + this.maxTorque + " N.m");
	}
}
