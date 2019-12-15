package pl.aga.springwithgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.aga.springwithgit.domain.Address;

@RestController
@RequestMapping("/address")
public class rest_AddressRestController {

    @GetMapping("/my")
    public Address getMyAddress(){
        return new Address("warsaw", "unknow", 9);
    }


}
