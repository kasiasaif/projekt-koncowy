package pl.sdacademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sdacademy.User;
import pl.sdacademy.repository.UserRepository;

import java.util.Map;
@Controller
@RequestMapping("/user")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/new")
    public String addNewUser(Map<String, Object> model) {
        User user = new User();
        model.put("user", user);
        return "register_form";
    }
}
