package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/HelloWorld2")
public class HelloWorld2Controller {

    @GetMapping
    public String helloDefault() {
        return "Hola UNKNOWN!. Estás ejecutando un proyecto Maven";
    }

    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        return String.format("Hola %s!. Estás ejecutando un proyecto Maven", name);
    }
}