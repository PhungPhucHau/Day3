
package day3;

public class Kia extends Car{
    private final String model;

    public Kia(String model , int cylinders) {
        super(cylinders, "Kia");
        this.model = model;
    }

    @Override
    public String brake() {
        return "Kia-" + this.model + "stopped"; 
    }

    @Override
    public String accelarate() {
        return "Kia-" + this.model + "is accelarate"; 
    }

    @Override
    public String startEngine() {
        return "Kia-" + this.model + "is started"; 
    }
    
    
}
