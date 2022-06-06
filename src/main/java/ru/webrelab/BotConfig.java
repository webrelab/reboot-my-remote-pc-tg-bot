package ru.webrelab;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class BotConfig {

    @Value("${botToken}")
    private String botToken;

    @Value("${botName}")
    private String botName;
}
