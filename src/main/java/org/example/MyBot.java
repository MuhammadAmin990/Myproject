package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {


        if (update.hasMessage());
        Message message = update.getMessage();


        if (message.hasText());
        String text = message.getText();

        if (text.equals("/Start"));
        System.out.println("Добро пожаловать");



        SendMessage sendMessage = new SendMessage();
    sendMessage.setText("Assalomu alaykum!!!");
    sendMessage.setParseMode(ParseMode.MARKDOWN);
    sendMessage.setChatId(message.getChatId());





    }

    @Override
    public String getBotToken() {
        return "6980175267:AAGETf_4lp-GbGBf_KVDnZbqhVKahTvsJvc";
    }

    @Override
    public String getBotUsername() {
        return "BeatStarsuzbot";



    }
}
