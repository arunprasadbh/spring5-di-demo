package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi, I am injected by Getter";
    }
}
