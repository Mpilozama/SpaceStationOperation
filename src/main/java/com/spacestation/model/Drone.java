package main.java.com.spacestation.model;

public class Drone {
    private String id;//to identify drone
    private String status;// checking availability of drone
    private String location;// to track current drone location

    public Drone(String id, String status, String location) {
        this.id = id;
        this.status = status;
        this.location = location;
    }

    public String getId(){
         return id; 
        }

    public void setId(String id){
         this.id = id; 
        }

    public String getStatus(){ 
        return status; 
    }

    public void setStatus(String status){ 
        this.status = status; 
    }
    public String getLocation(){ 
        return location; 
    }
    public void setLocation(String location){
         this.location = location; 
        
        }
}