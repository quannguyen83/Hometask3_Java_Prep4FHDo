package engines;

public class ElectricEngine extends Engine{
	private String typeOfMotor;
	private int voltage;
	
	public ElectricEngine(String typeOfMotor, int rpm, int maxPower, int maxTorque, int voltage) {
		this.typeOfEngine = "Electric motors";
		this.typeOfMotor = typeOfMotor;
		this.rotationSpeed = rpm;
		this.maxPower = maxPower;
		this.maxTorque = maxTorque;
		this.voltage = voltage;
	}
	public void printEngineInfo() {
		super.printEngineInfo();
		System.out.println("\t\tMotor type: " + this.typeOfMotor);
		System.out.println("\t\tMax Power: " + this.maxPower + " kW");
		System.out.println("\t\tMax Torque: " + this.maxTorque + " N.m");
		System.out.println("\t\tVotage: " + this.voltage + " V");
	}
}
