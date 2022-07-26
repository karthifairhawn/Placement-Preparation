package OOPS.StaticKeyword;

public class TVS implements Bike {

    String name;
    int mileage;
    int price;

    @Override
    public void start() {
        System.out.println("TVS is started " + name);        
    }

    @Override
    public void stop() {        
        System.out.println("TVS is stopped " + name);        
    }

    
}
