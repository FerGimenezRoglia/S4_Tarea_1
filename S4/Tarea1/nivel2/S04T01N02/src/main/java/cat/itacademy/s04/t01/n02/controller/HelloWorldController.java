package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String hello(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
        return String.format("Hola %s!. Estás ejecutando un proyecto Maven", name);

    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String hello2(@PathVariable(required = false) String name) {
        if (name == null) {
            name = "UNKNOWN";
        }
        return String.format("Hola, %s!. Estás ejecutando un proyecto Maven", name);
    }

}
