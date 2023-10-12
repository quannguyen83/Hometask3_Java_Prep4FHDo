import vehicles.*;
import java.util.*;
import engines.*;

public class Main {
	public static void main (String[] args) {
		
		BEV bev1 = new BEV(57.5, "Lithium-Iron-Phosphate", "Tesla", "Tesla", 267, 20);
		bev1.manufacture = new Manufacture("Tesla", "Model 3", 2018, 45667);
		bev1.motor = new ElectricEngine("3D1", 5000, 202, 404, 320);
		
		BEV bev2 = new BEV(59.9, "Lithium-Iron-Phosphate", "Type 2", "CCS2", 237, 25);
		bev2.manufacture = new Manufacture("Vinfast", "VF6 Plus", 2020, 42750);
		bev2.motor = new ElectricEngine(null, 3500, 150, 310, 320);
		
		ICEV icev1 = new ICEV("petrol", 6.2, 140, 870, 5);
		icev1.manufacture = new Manufacture("Mercedes", "GLA 200", 2015, 16490);
		icev1.engine = new CombustionEngine("M282", 1332, 5500, 120, 250);
		
		HybridV hybridV1 = new HybridV("Fullhybrid", 16.4, "Lithium-ion", false, 600, 5);
		hybridV1.manufacture = new Manufacture("Toyota", "Prius", 2023, 45290);
		hybridV1.engine = new HybridEngine("2ZR-FXE Petrol Engine", 5200, 72, 190);
		
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(bev1);
		vehicleList.add(bev2);
		vehicleList.add(icev1);
		vehicleList.add(hybridV1);
		
		for (Vehicle vehicle : vehicleList) {
			vehicle.ShowCharacteristics();
		}
	}
}