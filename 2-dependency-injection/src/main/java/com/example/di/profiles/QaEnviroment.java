package com.example.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Qa")
public class QaEnviroment implements EnviromentService {

    @Override
    public String getEnviroment() {
        return "Qa";
    }
    
}
