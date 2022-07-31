package co.develhope.Middleware1.controllers;

import co.develhope.Middleware1.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 * @author Tania Ielpo
 */

@RestController
@RequestMapping("/time")
public class BasicController {

    @Autowired
    private TimeService timeService;
    @GetMapping("")
    public String getTime(){
        return LocalDateTime.now().toString();
     //   return timeService.getTime();
    }
}
