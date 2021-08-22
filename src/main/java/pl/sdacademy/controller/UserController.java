package pl.sdacademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sdacademy.entity.User;
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
        return "user/register_form";
    }

    @GetMapping("/sign_up")
    public String signUp() {
        return "user/sign_up";

    }
    @GetMapping("/register_conformation")
    public String register() {
        return "user/register_conformation";

    }
}