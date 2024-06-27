package co.develhope.controller_con_get_completa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class HelloAndProvinceController {

    @GetMapping(path = "/ciao" + "/Lombardia")
    public Name name(@RequestParam String nome) {
        return new Name(nome, "Lombardia");
    }

}
