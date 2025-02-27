package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String hello(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
        return String.format("Hola %s!. Estás ejecutando un proyecto Maven", name);

    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nombre}"})
    public String hello2(@PathVariable(required = false) String name2) {
        if (name2 == null) {
            name2 = "UNKNOWN";
        }
        return String.format("Hola, %s!. Estás ejecutando un proyecto Maven", name2);
    }

}
