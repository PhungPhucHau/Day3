
package day3;

public class Audi extends Car{
    private final String model;

    public Audi(String model , int cylinders) {
        super(cylinders, "Audi");
        this.model = model;
    }

    @Override
    public String brake() {
        return "Audi-" + this.model + "stopped"; 
    }

    @Override
    public String accelarate() {
        return "Audi-" + this.model + "is accelarate"; 
    }

    @Override
    public String startEngine() {
        return "Audi-" + this.model + "is started"; 
    }
    
    
}
