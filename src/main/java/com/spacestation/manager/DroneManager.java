package main.java.com.spacestation.manager;

import java.util.HashMap;
import java.util.Map;

import main.java.com.spacestation.model.Drone;

public class DroneManager {

    private Map<String, Drone> drones;
    
    public DroneManager() {
        this.drones = new HashMap<>();
    }

    public String registerDrone(String id, String location) {

        if (drones.containsKey(id)) {
            return "ERROR: This drone " + id + " already exists!";
        }
        
        // Create new drone with IDLE status
        Drone newDrone = new Drone(id, "IDLE", location);
        drones.put(id, newDrone);
        return "SUCCESS: Drone " + id + " registered at " + location;
    }
    
    // Moves a drone to a new location
    public String moveDrone(String id, String newLocation) {
        
        Drone drone = drones.get(id);// Finds the drone
        
        // Checks if drone exists
        if (drone == null) {
            return "ERROR: Drone " + id + " not found!";
        }
        
        // Check if drone is idle
        if (!drone.getStatus().equals("IDLE")) {
            return "ERROR: Drone " + id + " is " + drone.getStatus() + " and cannot move!";
        }
        
        // Moves the drone:
        drone.setStatus("MOVING");
        drone.setLocation(newLocation);
        drone.setStatus("IDLE");
        
        return "SUCCESS: Drone " + id + " moved to " + newLocation;
    }
    
    // Get drone status
    public String getDroneStatus(String id) {
        Drone drone = drones.get(id);
        if (drone == null) {
            return "ERROR: Drone " + id + " not found!";
        }
        return "Drone " + id + " | Location: " + drone.getLocation() + " | Status: " + drone.getStatus();
    }
    
    // List all drones
    public String listAllDrones() {
        if (drones.isEmpty()) {
            return "No drones registered.";
        }
        
        StringBuilder result = new StringBuilder("Registered Drones:\n");
        for (Drone drone : drones.values()) {
            result.append("  - ").append(drone.getId())
                  .append(" at ").append(drone.getLocation())
                  .append(" (").append(drone.getStatus()).append(")\n");
        }
        return result.toString();
    }
    
    // Get all drones (for future use)
    public Map<String, Drone> getAllDrones() {
        return drones;
    }
    
   
}

