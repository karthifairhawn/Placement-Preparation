package OOPS.StaticKeyword;

public class Honda implements Bike {

    String name;
    int mileage;
    int price;

    @Override
    public void start() {
        System.out.println("Honda is started "+name);
        
    }

    @Override
    public void stop() {
        System.out.println("Honda is stopped" + name);             
    }
}
