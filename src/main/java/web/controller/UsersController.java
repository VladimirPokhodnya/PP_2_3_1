package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserService;


@Controller
public class UsersController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public String printCars(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("users", userService.getUsers(count));
        return "users";
    }
}
