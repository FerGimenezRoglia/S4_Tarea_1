package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/HelloWorld2")
public class HelloWorld2Controller {

    @GetMapping({"/","/{name}"})
    public String hello(@PathVariable(required = false) String name) {
        if (name == null){
            name = "UNKNOWN";
        }
        return String.format("Hola %s!. Estás ejecutando un proyecto Maven", name);
    }

}
