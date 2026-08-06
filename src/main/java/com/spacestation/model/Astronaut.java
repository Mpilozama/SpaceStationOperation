package main.java.com.spacestation.model;

public class Astronaut {
    private String id;
    private String name;
    private String currentModule;

public class Astronaut {
    // These are the things we track about an astronaut
    private String id;        // Unique identifier like "ASTRO-1"
    private String name;      // Their name like "Sarah"
    private String location;  // Where they are like "HABITATION"
    private String status;    // What they're doing like "ACTIVE"
    
    // Constructor: This runs when we create a new astronaut
    // We MUST provide id, name, and location when creating one
    public Astronaut(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.status = "ACTIVE"; // All astronauts start as ACTIVE
    }
    
    // Getters: Allow other classes to READ these values
    public String getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public String getStatus() { return status; }
    
    // Setters: Allow other classes to CHANGE these values
    public void setLocation(String location) { this.location = location; }
    public void setStatus(String status) { this.status = status; }
}