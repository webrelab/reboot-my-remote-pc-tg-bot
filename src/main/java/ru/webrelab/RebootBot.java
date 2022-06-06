package ru.webrelab;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.bot.AbilityBot;

@Component
public class RebootBot extends AbilityBot {

    protected RebootBot(BotConfig config) {
        super(config.getBotToken(), config.getBotName());
    }

    @Override
    public long creatorId() {
        return 0;
    }
}
