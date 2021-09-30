
package day3;

public class Toyota extends Car{
    private final String model;

    public Toyota(String model , int cylinders) {
        super(cylinders, "Toyota");
        this.model = model;
    }

    @Override
    public String brake() {
        return "Toyota-" + this.model + "stopped"; 
    }

    @Override
    public String accelarate() {
        return "Toyota-" + this.model + "is accelarate"; 
    }

    @Override
    public String startEngine() {
        return "Toyota-" + this.model + "is started"; 
    }
    
    
}
