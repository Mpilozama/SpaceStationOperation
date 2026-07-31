package main.java.com.spacestation.model;

public class Airlock {
    private String id;
    private boolean isLocked; // true = locked, false = unlocked
    
    public Airlock(String id) {
        this.id = id;
        this.isLocked = true; 
    }
    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public boolean isLocked() { return isLocked; }
    public void setLocked(boolean locked) { isLocked = locked; }
    
  
    public void lock() {
        this.isLocked = true;
    }
    
    public void unlock() {
        this.isLocked = false;
    }

    

}