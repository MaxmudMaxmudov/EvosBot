package com.company;

import com.company.util.AllButtonUtil;
import com.company.util.InlineButtonUtil;
import com.company.util.KeyButtonUtil;
import com.company.util.MessageUtil;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class EvosTelegramBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().getText() != null) {
            Message message = update.getMessage();
            String text = message.getText();

            User user = update.getMessage().getFrom();
            log(user.getFirstName(),user.getLastName(),user.getId(),text);
            if (text.equals("/start")) {
                SendMessage sendMessage = sendMessage("Welcom my bot", message.getChatId(), AllButtonUtil.languagesMenu());
                sendMsg(sendMessage);
                return;

            } else if(text.contains("Choose English language")){
                SendMessage sendMessage = sendMessage("Welcom my bot", message.getChatId(),AllButtonUtil.keyBoardMenu());
                sendMsg(sendMessage);
                return;

            }
            else if (text.contains("Menu")) {
                SendMessage sendMessage = sendMessage("Send Location or your address", message.getChatId(), AllButtonUtil.LocationMenu());
                sendMsg(sendMessage);
                return;
            } else if (text.contains("Send Location")) {
                SendMessage sendMessage = sendMessage("choose NO/YES", message.getChatId(), AllButtonUtil.Location());
                sendMsg(sendMessage);
                return;
            } else if (text.equals("Yes")) {
                SendMessage sendMessage = sendMessage("All meals", message.getChatId(), AllButtonUtil.mealMenu());
                sendMsg(sendMessage);
                return;
            } else if (text.contains("No")|| text.contains("Back to location menu") ) {    //
                SendMessage sendMessage = sendMessage("Send Location or your address", message.getChatId(), AllButtonUtil.LocationMenu());
                sendMsg(sendMessage);
            } else if (text.equals("Lavash")) {
                SendPhoto sendPhoto = sendImageLavashMenu(AllButtonUtil.lavashMenu(), message.getChatId().toString());
                sendMsg(sendPhoto);
                return;

            }else if(text.equals("Combo+pepsi")){
                SendPhoto sendPhoto = sendImageComboMenu(AllButtonUtil.comboPepsiMenu(), message.getChatId().toString());
                sendMsg(sendPhoto);
                return;

            } else if(text.equals("Shawarma")){
                SendPhoto sendPhoto = sendImageShawarmaMenu(AllButtonUtil.shawarmaMenu(), message.getChatId().toString());
                sendMsg(sendPhoto);
                return;
            }else if(text.equals("Danar")){
                SendPhoto sendPhoto = sendImageDanarmaMenu(AllButtonUtil.donarMenu(), message.getChatId().toString());
                sendMsg(sendPhoto);


            }else if(text.contains("Back to all meals menu")){
                SendMessage sendMessage = sendMessage("All meals", message.getChatId(), AllButtonUtil.mealMenu());
                sendMsg(sendMessage);
                return;
            }
            else if (text.contains("Back to menu")) {
                SendMessage sendMessage = sendMessage("Menu", message.getChatId(), AllButtonUtil.keyBoardMenu());
                sendMsg(sendMessage);
                return;


            } else {
                MessageUtil.notFoundMessage(message.getChatId());
            }
        } else if (update.hasMessage() && update.getMessage().getText() == null) {
            if (update.getMessage().hasLocation() || update.getMessage().hasContact()) {
                SendMessage sendMessage = sendMessage("choose NO/YES", update.getMessage().getChatId(), AllButtonUtil.Location());
                sendMsg(sendMessage);
            }
        }

    }








//    public ReplyKeyboardMarkup fitterPrice() {
//        KeyboardButton button1 = InlineButtonUtil.button( ":heavy_minus_sign:");
//        KeyboardButton button2 = KeyButtonUtil.keyButton(":heavy_pkus_sign:");
//        KeyboardButton button3 = KeyButtonUtil.keyButton("Add to basket", ":inbox_try:");
//
//        KeyboardRow keyboardRow1 = KeyButtonUtil.keyRow(button1, button2);
//        KeyboardRow keyboardRow2 = KeyButtonUtil.keyRow(button3);
//
//
//        List<KeyboardRow> keyboardRowList = KeyButtonUtil.keyboardRowList(keyboardRow1, keyboardRow2);
//
//        return KeyButtonUtil.replyKeyboardMarkup(keyboardRowList);
//
//
//    }






    public void sendMsg(SendMessage sendMessage) {
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(SendPhoto sendPhoto) {
        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public SendPhoto sendImageLavashMenu(ReplyKeyboardMarkup replyKeyboardMarkup, String chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
//        sendPhoto.setCaption("Lavash Menu");
        sendPhoto.setParseMode("Markdown");
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);
//        sendPhoto.setCaption("15000");
        InputFile inputFile = new InputFile(new File("src/main/resources/lavash_menu.jpg"));
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;

    }

    public SendPhoto sendImageComboMenu(ReplyKeyboardMarkup replyKeyboardMarkup, String chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);

        sendPhoto.setParseMode("Markdown");
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);
//        sendPhoto.setCaption("15000");
        InputFile inputFile = new InputFile(new File("src/main/resources/combo_menu.jpg"));
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;

    }

    public SendPhoto sendImageShawarmaMenu(ReplyKeyboardMarkup replyKeyboardMarkup, String chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);

        sendPhoto.setParseMode("Markdown");
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);
//        sendPhoto.setCaption("15000");
        InputFile inputFile = new InputFile(new File("src/main/resources/shawarma_menu.jpg"));
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;

    }



    public SendPhoto sendImageDanarmaMenu(ReplyKeyboardMarkup replyKeyboardMarkup, String chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);

        sendPhoto.setParseMode("Markdown");
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);
//        sendPhoto.setCaption("15000");
        InputFile inputFile = new InputFile(new File("src/main/resources/donar_menu.jpg"));
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;

    }

    public SendMessage sendMessage(String text, Long chatId, ReplyKeyboardMarkup replyKeyboardMarkup) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(text);
        sendMessage.setChatId(chatId.toString());
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        sendMessage.setParseMode("Markdown");
        return sendMessage;
    }

    private void log(String first_name, String last_name, Long user_id, String txt) {
        try {
            System.out.println("\n --------------------------------------------------------");
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.out.println(dateFormat.format(LocalDateTime.now()));
            System.out.println("Message from " + first_name + " " + last_name + ". (id = " + user_id + ") \n Text - " + txt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "maxmud_evos_bot";
    }

    @Override
    public String getBotToken() {
        return "5051077594:AAGR3w5cCDkQ9ABYWoVuSd87bqV_v9YchWM";
    }
}
