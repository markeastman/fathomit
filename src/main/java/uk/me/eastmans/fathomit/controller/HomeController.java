package uk.me.eastmans.fathomit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by markeastman on 26/09/2016.
 */
@Controller
public class HomeController {

    @GetMapping("/home")
    public String index() {
        return "home";
    }

}
