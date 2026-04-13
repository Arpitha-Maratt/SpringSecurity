package comarpitha;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String sayHello(){
        return " hello";
    }

    //when you dependency it automatically navigates to login page when i hit the endpoints
    // where I can credential : in console - default security chain
    // password will change everytime
    // logout :localhost:8080/logout
    //default authentication is form based
   //inbuilt - login and logout
    // dis adv = won't support for rest Api because it uses postman  so ----> basic Authentication


    @PreAuthorize("hasRole('USER')")  // use to check authorization  before executing  a method  . You need to specify the condition that need to be true.   roles or setting in security config file
    @GetMapping("/user")
    public String userEndpoint(){
        return "Hello user";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminEndpoints(){
        return "Hello Admin";
    }

    //@PostAuthorize = which is enforce security after a method has executed that allows you to take decision based on the result of the method




}
