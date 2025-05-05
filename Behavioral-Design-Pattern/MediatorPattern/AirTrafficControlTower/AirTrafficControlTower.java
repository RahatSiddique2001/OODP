// package MediatorPattern.AirTrafficControlTower;

public interface AirTrafficControlTower {
    void registerAirplane(Airplane airplane);
    void notifyOtherPlanes(Airplane sender, String message);
}
