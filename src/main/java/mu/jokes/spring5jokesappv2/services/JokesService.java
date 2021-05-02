package mu.jokes.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private final ChuckNorrisQuotes quotes;

    public JokesService() {
        this.quotes = new ChuckNorrisQuotes();
    }

    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
