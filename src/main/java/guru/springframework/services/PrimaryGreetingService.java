package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*
 * Created by arunabhamidipati on 02/10/2019
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Primary Greeting Service";
    }
}
