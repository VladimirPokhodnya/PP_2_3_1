package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserService;

@Controller
public class IndexController {

    //	@GetMapping(value = "/")
//	public String printWelcome(ModelMap model) {
//		List<String> messages = new ArrayList<>();
//		messages.add("Hello!");
//		messages.add("I'm GRUD application");
//		messages.add("1.0.0 version by apr'23 ");
//		model.addAttribute("messages", messages);
//		return "index";
//}
    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String printCars(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("users", userService.getUsers(count));
        return "index";
    }
}