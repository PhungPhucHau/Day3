
package day3;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }
    
    public String startEngine(){
        return "Car is started";
    }
    
    public String accelarate(){
        return "Car is accelarating";
    }
    
    public String brake(){
        return "Car stopped";
    }
    
}
