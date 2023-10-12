package engines;

public class Engine {
	protected String typeOfEngine;
	protected int rotationSpeed;
	protected int maxPower;
	protected int maxTorque;
	
	public void printEngineInfo() {
		System.out.println("\tEngine information: " + "\n\t\tType: " + this.typeOfEngine);
		System.out.println("\t\tRotation speed: " + this.rotationSpeed + " rpm");
	}
}
