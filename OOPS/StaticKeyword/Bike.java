package OOPS.StaticKeyword;

public interface Bike {
    
    public void start();
    public void stop();

    public static void printRating(int mileage,int price){
        System.out.println("Rating is " + mileage*price);
    }
}
