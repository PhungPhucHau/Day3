
package day3;

public class Mitsubishi extends Car{
    private final String model;

    public Mitsubishi(String model , int cylinders) {
        super(cylinders, "Mitsubishi");
        this.model = model;
    }

    @Override
    public String brake() {
        return "Mitsubishi-" + this.model + "stopped"; 
    }

    @Override
    public String accelarate() {
        return "Mitsubishi-" + this.model + "is accelarate"; 
    }

    @Override
    public String startEngine() {
        return "Mitsubishi-" + this.model + "is started"; 
    }
    
    
}
