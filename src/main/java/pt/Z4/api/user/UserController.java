package pt.Z4.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity createUser(@RequestBody UserModel user) {
        var username = this.userRepository.findByName(user.getName());
        if(username != null) {
            return ResponseEntity.badRequest().body("User already exists");
        }
        this.userRepository.save(user);
        return ResponseEntity.ok().body("User created");
    }
}
