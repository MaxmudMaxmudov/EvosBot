package com.company.util;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class MessageUtil {
    public static SendMessage notFoundMessage(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Noto'g'ri bosildi");
        sendMessage.setChatId(chatId.toString());
        return sendMessage;

    }


}
