// package MediatorPattern.AirTrafficControlTower;

// Concrete mediator Class

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements AirTrafficControlTower {
    
    private List<Airplane> airplanes = new ArrayList<>();

    @Override
    public void registerAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    @Override
    public void notifyOtherPlanes(Airplane sender, String message) {
        for (Airplane airplane : airplanes) {
            if (airplane != sender) {
                airplane.receiveMessage(sender, message);
            }
        }
    }
    
}
