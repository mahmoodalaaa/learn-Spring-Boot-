package com.example.api.user;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class RestClientConfig {

    RestClient restClient =RestClient.create();

  
    public String getExampleData() {
        String url = "http://localhost:8080/";
        String res= restClient
                .get()
                .uri(url)
                .retrieve()
                .body(String.class);  // Or your custom DTO class

                return " this is the res: " + res;
    }
    
    public User getUser() {
        String url = "https://jsonplaceholder.typicode.com/todos/1";
        User user = restClient
                .get()
                .uri(url)
                .retrieve()
                .body(User.class);  // Or your custom DTO class

        return user;
}
}
