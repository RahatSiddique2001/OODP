public class AirTrafficControlTowerDemo {
    
    public static void main(String[] args) {
        AirTrafficControlTower tower = new ControlTower();

        Airplane passengerPlane1 = new PassengerPlane("Passenger plane-1", tower);
        Airplane passengerPlane2 = new PassengerPlane("Passenger plane-2", tower);
        Airplane cargoPlane1 = new CargoPlane("Cargo-1", tower);
        Airplane cargoPlane2 = new CargoPlane("Cargo-2", tower);

        // Simulate communication between planes
        passengerPlane1.sendMessage("Requesting takeoff.");
        System.out.println("-------");
        cargoPlane1.sendMessage("Cargo plane ready for landing.");
    }
}
