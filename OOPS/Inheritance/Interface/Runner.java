package Interface;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        
        Animal d = new Dog();
        d.sound();
        d.eat();

        Animal c = new Cat();
        c.sound();
        c.eat();

        List<Animal> l = new ArrayList<Animal>();

        for(Animal a : l) {
            a.sound();
            a.eat();
        }

    }
}
