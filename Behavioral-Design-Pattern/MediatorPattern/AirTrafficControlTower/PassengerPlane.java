// package MediatorPattern.AirTrafficControlTower;

public class PassengerPlane extends Airplane {
    
    public PassengerPlane(String id, AirTrafficControlTower tower) {
        super(id, tower);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Passenger Plane " + id + " sending message: " + message);
        tower.notifyOtherPlanes(this, message);
    }

    @Override
    public void receiveMessage(Airplane sender, String message) {
        System.out.println("Passenger Plane " + id + " received message from " + sender.id + ": " + message);
    } 
}
