package com.song.config;

import com.song.test.TestApplication;
import com.song.test.TestApplicationBuilder;
import com.song.test.test.test.user.UserManager;
import com.speedment.runtime.core.Speedment;
import com.speedment.runtime.core.exception.SpeedmentException;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.manager.ManagerConfigurator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class UserConfig {

    @Bean
    public UserManager userManager(){
        Speedment speedment = new TestApplicationBuilder()
                .withPassword("123456")
                .build();
        return speedment.getOrThrow(UserManager.class);
    }

}
