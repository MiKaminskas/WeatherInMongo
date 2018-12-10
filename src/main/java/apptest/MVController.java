package apptest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class MVController {
    @GetMapping("/startpage")
    public String startpage( @RequestParam(name="name", required = false, defaultValue = "World") String name, Model model) throws Exception {
        model.addAttribute("name",name);

        // here the name of template
        return "testhtml";
    }
}
