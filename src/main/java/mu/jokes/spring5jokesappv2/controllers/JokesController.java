package mu.jokes.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokesController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getJokes() {
        return null;
    }
}
