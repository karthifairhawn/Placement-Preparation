package API.GSON.JsonToObject;

import com.google.gson.Gson;

public class GsonRunner {
    
    public static void main(String[] args) {
        Gson gson = new Gson();

        String json = "{\"city\":\"London\",\"country\":\"UK\",\"safeGuard\":{\"name\":\"Max\",\"age\":2}}";

        House house1 = gson.fromJson(json, House.class);

        System.out.println(house1.city+" "+house1.country+" "+house1.safeGuard.name+" "+house1.safeGuard.age);

    }

}
