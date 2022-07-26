package OOPS.Inheritance.Train;

public class Runner {
    
    
    public static void main(String[] args) {
        Train t1 = new Train();        
        Train.seats--;
        System.out.println(t1.seats);
    }

}

class Train{
    public static int seats = 200;

    Train(){
        System.out.println("Train is Booked");
        
    }
}