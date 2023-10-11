package pt.Z4.api.User;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/")
    public String index() {
        return "Hello World1!";
    }

    @GetMapping("/test1")
    public String test() {
        return "Hello World!";
    }
}
