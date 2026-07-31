package main.java.com.spacestation.manager;

import java.util.HashMap;
import java.util.Map;

import main.java.com.spacestation.model.Drone;

public class DroneManager {

    private Map<String, Drone> drones;
    
    public DroneManager() {
        this.drones = new HashMap<>();
    }
    
   
}