package mapler.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DesenvolvimentoController {

    @GetMapping("/desenvolvimento")
    public String contato() {
        return "desenvolvimento";
    }

}
