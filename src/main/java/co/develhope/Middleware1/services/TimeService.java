package co.develhope.Middleware1.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author Tania Ielpo
 */

@Service
public class TimeService {
    LocalDateTime localDateTime= LocalDateTime.now();

    public String getTime(){
        return localDateTime.toString();
    }
}
