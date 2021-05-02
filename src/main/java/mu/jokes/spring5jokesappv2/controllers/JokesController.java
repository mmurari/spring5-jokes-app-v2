package mu.jokes.spring5jokesappv2.controllers;

import mu.jokes.spring5jokesappv2.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokesController {

    private final JokesService service;

    public JokesController(JokesService service) {
        this.service = service;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getJokes() {
        return service.getJoke();
    }
}
