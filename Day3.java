
package day3;

public class Day3 {
    public static void main(String[] args) {
        
        Car Ducati = new Car(4, "V4S");
        System.out.println(Ducati.startEngine());
        System.out.println(Ducati.accelarate());
        System.out.println(Ducati.brake());
        
        Mitsubishi myCar = new Mitsubishi("Expander", 4);
        System.out.println(myCar.startEngine());
        System.out.println(myCar.accelarate());
        System.out.println(myCar.brake());
        
        Car aCar;
        aCar = getCar();
        System.out.println(myCar.startEngine());
        System.out.println(myCar.accelarate());
        System.out.println(myCar.brake());
        
    }
   
    public static Car getCar() {
        System.out.println("Randomly pick a car");
        int i = (int) (Math.random() * 4 + 1);
        switch(i){
            case 1: {
                return new Mitsubishi("Outlander", 4);
            }
            case 2: {
                return new Toyota("Crown", 6);
            }
            case 3: {
                return new Kia("Sorento", 6);
            } 
            case 4: {
                return new Audi("A4", 6);
            }
        }
        return null;
    }

}
