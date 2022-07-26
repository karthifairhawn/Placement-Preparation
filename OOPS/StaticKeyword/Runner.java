package OOPS.StaticKeyword;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        
        Honda honda = new Honda();
        honda.name="CVR";
        honda.mileage=100;
        honda.price=20000;
        
        TVS tvs = new TVS();
        tvs.name="XL100";
        tvs.mileage=110;
        tvs.price=30000;

        List<Bike> bikes = new ArrayList<>();
        bikes.add(honda);
        bikes.add(tvs);

        for(Bike bike: bikes){
            bike.start();
            bike.stop();
        }
        
        
    }
}

