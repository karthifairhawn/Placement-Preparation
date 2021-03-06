package API.ApiCallExample;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetCall {
    public static void main(String[] args) throws IOException, InterruptedException {        
      

      HttpRequest req = HttpRequest.newBuilder()
              .uri(URI.create("https://api.github.com/users/octocat"))
              .GET()                
              .build();
      
      HttpClient client = HttpClient.newHttpClient();

      HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());     
                               
      System.out.println(response.body());
            
    }
}


