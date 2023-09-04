package project;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyEchoBot extends TelegramLongPollingBot {

    private static String BOT_USERNAME;
    private static String BOT_TOKEN;

    static {
        try (InputStream input = MyEchoBot.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            BOT_USERNAME = prop.getProperty("TELEGRAM_BOTUSERNAME");
            BOT_TOKEN = prop.getProperty("TELEGRAM_BOTTOKEN");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void onUpdateReceived(Update update) {
//        if (update.hasMessage() && update.getMessage().hasText()) {
//            SendMessage message = new SendMessage();
//            message.setChatId(update.getMessage().getChatId().toString());
//            message.setText(update.getMessage().getText());
//
//            try {
//                execute(message);
//            } catch (TelegramApiException e) {
//                e.printStackTrace();
//            }
//        }
    }

    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }
}


