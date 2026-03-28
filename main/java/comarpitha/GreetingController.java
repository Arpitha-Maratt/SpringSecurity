package comarpitha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String sayHello(){
        return " hello";
    }

    //when you dependency it automatically navigate to login page when i hit the endpoints
    // where i can credential : in console - default security chain
    // password will change everytime
    // logout :localhost:8080/logout
    //default authentication is form based
   //inbuilt - login and logout
    // dis adv = wont support for rest Api because it use postman  so ----> basic Authentication



    // Basic authentication


}
