package com.example.dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("TR")
@Service("i18nService")
public class I18nTurkishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Merhaba Dünya";
    }
}
