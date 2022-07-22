package Absract;

public class Dog extends Animal{
    String age;

    public void sound(){
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }
}
