package security.io.ldapauthentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/")
public class Controller {

    @GetMapping("/")
    public String home() {
        return "Welcome your are logged in!";
    }

}
