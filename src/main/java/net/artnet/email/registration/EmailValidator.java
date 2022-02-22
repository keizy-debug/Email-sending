package net.artnet.email.registration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component
public class EmailValidator implements Predicate<String> {

    public EmailValidator(){}
    @Override
    public boolean test(String s) {
        // TODO :Regex to validate mail
        return true;
    }
}
