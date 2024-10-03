package org.example.service;

import org.example.config.BotConfig;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class TelegramBotService extends TelegramBotsApi {

    private final BotConfig config;




}
