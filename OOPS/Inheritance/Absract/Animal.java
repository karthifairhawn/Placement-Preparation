package Absract;

public abstract class Animal {
    String name;
    String color;

    public abstract void sound();   
    
    public void eat() {
        System.out.println("Animal eats meat");
    }
}
