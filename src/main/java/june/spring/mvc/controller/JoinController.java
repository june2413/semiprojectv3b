package june.spring.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoinController {
    @GetMapping("/join/agree")
    public String agree()
    {
        return "join/agree.tiles";
    }
    @GetMapping("/join/chkme")
    public String chkme()
    {
        return "join/agree.tiles";
    }
}
