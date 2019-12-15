package pl.aga.springwithgit.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.aga.springwithgit.Person;


@RestController
public class PersonController {
    @GetMapping("/person")
    public Person me(){
        return new Person("ala", "nan");

    }
}
