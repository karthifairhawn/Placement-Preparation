package API.GSON.ObjectToGson;

import com.google.gson.Gson;

public class GsonRunner {
    
    public static void main(String[] args) {
        Gson gson = new Gson();

        Dog dog1 = new Dog();   
        dog1.name = "Dog1";
        dog1.age = 1;

        House house1 = new House();
        house1.city = "London";
        house1.country = "NY";
        house1.safeGuard = dog1;

        System.out.println(gson.toJson(house1));
        

    }

}
