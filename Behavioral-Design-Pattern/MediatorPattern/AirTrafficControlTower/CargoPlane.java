// package MediatorPattern.AirTrafficControlTower;

public class CargoPlane extends Airplane{

    public CargoPlane(String id, AirTrafficControlTower tower) {
        super(id, tower);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Cargo Plane " + id + " sending message: " + message);
        tower.notifyOtherPlanes(this, message);
    }

    @Override
    public void receiveMessage(Airplane sender, String message) {
        System.out.println("Cargo Plane " + id + " received message from " + sender.id + ": " + message);
    }
}
