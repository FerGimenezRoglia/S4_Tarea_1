package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld")
public class HelloWorldController {

    @GetMapping
    public String hello(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
        return String.format("Hola %s!. Estás ejecutando un proyecto Maven", name);

    }

}