package pl.sdacademy.controller;

import org.springframework.web.bind.annotation.*;
import pl.sdacademy.entity.Category;
import pl.sdacademy.repository.UserRepository;
import pl.sdacademy.entity.User;

import java.util.Map;

@RestController
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
    @GetMapping("/add")
    public String addForm(@ModelAttribute("user") User user) {
        return "user/register_form";
    }

    @PostMapping("/add")
    public String save(User user) {
        userRepository.save(user);
        return "redirect:/user";
    }
}