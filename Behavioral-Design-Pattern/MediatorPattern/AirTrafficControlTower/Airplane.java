// package MediatorPattern.AirTrafficControlTower;

public abstract class Airplane {

    protected String id;
    protected AirTrafficControlTower tower;

    public Airplane(String id, AirTrafficControlTower tower) {
        this.id = id;
        this.tower = tower;
        tower.registerAirplane(this);
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(Airplane sender, String message);
    
}
