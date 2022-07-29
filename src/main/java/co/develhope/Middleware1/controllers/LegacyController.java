package co.develhope.Middleware1.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tania Ielpo
 */

@RestController
@RequestMapping("/legacy")
public class LegacyController {

    @GetMapping
    public String getLegacy(){
        return "This is just old code";
    }
}
