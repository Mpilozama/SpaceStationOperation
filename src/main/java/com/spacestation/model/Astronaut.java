package main.java.com.spacestation.model;

public class Astronaut {
    private String id;
    private String name;
    private String currentModule;

    public Astronaut(String id, String name, String currentModule){
        this.id = id;
        this.name = name;
        this.currentModule = currentModule;
    }
    
    public String getId() { return id; }
    public void setId(String id){ 
        this.id = id; 
    }
    
    public String getName() {
         return name; 
        }
    public void setName(String name){ 
        this.name = name; 
    }
    
    public String getCurrentModule() { 
        return currentModule;
     }
    public void setCurrentModule(String currentModule) {
         this.currentModule = currentModule; 
        }
}