package com.example.api.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final RestClientConfig restClientConfig;

    public UserController(RestClientConfig restClientConfig) {
        this.restClientConfig = restClientConfig;
    }

    @GetMapping("/test")
    public String getUser() {
        return restClientConfig.getExampleData();
    }


    @GetMapping("/user")
    public User getUserDetails() {
        return restClientConfig.getUser();

}
}
