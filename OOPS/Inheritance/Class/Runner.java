package OOPS.Inheritance.Class;

public class Runner {
    public static void main(String[] args) {

        // Dog to Dog
        Dog dog = new Dog();
        dog.name = "Fido";
        dog.color = "Black";
        dog.age = "2";
        System.out.println(dog.name + " is " + dog.age + " years old and is " + dog.color + ".");
        dog.sound();

        // Animal to Animal
        Animal animal = new Animal();
        animal.name = "Spot";
        animal.color = "Brown";        
        System.out.println(animal.name + " is " + animal.color + ".");
        animal.sound();

        // Dog to Animal
        Animal dog2 = new Dog();
        dog2.name = "Jake";
        dog2.color = "Black";        
        System.out.println(dog2.name+" is " + dog2.color + ".");
        dog2.sound();


    }
}
