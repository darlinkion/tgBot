package org.example.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
@NoArgsConstructor
@Setter
@Getter
public class BotConfig {
    @Value(value = "${bot.name}")
    String botName;
    @Value(value = "${bot.key}")
    String token;
}
