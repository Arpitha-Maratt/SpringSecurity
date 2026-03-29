package comarpitha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration   // class provide configurarion to application
@EnableWebSecurity  //enable web security features in the spring boot application and giving liberatity for customize the security

public class SecurityConfig {
    @Bean // to marks as a bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws  Exception{
        http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());  // any request application will get authenticated by default
        http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));  // DISABLE FORM BASED = cookies will disable
//      http.formLogin(withDefaults()); // form based
        http.httpBasic(withDefaults());  // http basic with default and  this line config basic authentication
        return http.build();  // return security object type



        // Difference betwen basic and form
        // basic = not get access = login & log out(whitelable error) =(need to close for logout)
        // form = login and logout
        // cookies = jedessionId = managed
        // form = html form  ,no paylod tab in basic
        //in basic we can get form based  if we disable we need to some line of code

        // In postman = Get : http request  -send : 401  unauthorized: :  Authorizatiion: username and password  and
        //run 201 ok = here to check go to console -> authorization : authorization object : copy that google base decode : paste and decode : get username and password




    }

}
