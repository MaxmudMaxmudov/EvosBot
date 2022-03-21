package com.company.util;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.List;

public class AllButtonUtil {
    public static ReplyKeyboardMarkup languagesMenu() {
        KeyboardButton button1 = KeyButtonUtil.keyButton("Choose English language", ":us:");
        KeyboardButton button2 = KeyButtonUtil.keyButton("Выберите русский язык ", ":ru:");
        KeyboardButton button3 = KeyButtonUtil.keyButton("O'zbek tilini tanlang", ":uz:");

        KeyboardRow keyboardRow1 = KeyButtonUtil.keyRow(button1);
        KeyboardRow keyboardRow2 = KeyButtonUtil.keyRow(button2);
        KeyboardRow keyboardRow3 = KeyButtonUtil.keyRow(button3);
        List<KeyboardRow> keyboardRowList = KeyButtonUtil.keyboardRowList(keyboardRow1, keyboardRow2, keyboardRow3);
        return KeyButtonUtil.replyKeyboardMarkup(keyboardRowList);
    }

    public static ReplyKeyboardMarkup keyBoardMenu() {
        KeyboardButton button1 = KeyButtonUtil.keyButton("Menu", ":fork_and_knife:");
        KeyboardButton button2 = KeyButtonUtil.keyButton("My booking", ":handbag:");
        KeyboardButton button3 = KeyButtonUtil.keyButton("Share feedback", ":writing_hand:");
        KeyboardButton button4 = KeyButtonUtil.keyButton("Setting", ":gear:");
        KeyboardRow keyboardRow1 = KeyButtonUtil.keyRow(button1);
        KeyboardRow keyboardRow2 = KeyButtonUtil.keyRow(button2);
        KeyboardRow keyboardRow3 = KeyButtonUtil.keyRow(button3, button4);
        List<KeyboardRow> keyboardRowList = KeyButtonUtil.keyboardRowList(keyboardRow1, keyboardRow2, keyboardRow3);
        return KeyButtonUtil.replyKeyboardMarkup(keyboardRowList);
    }

    public static ReplyKeyboardMarkup mealMenu() {
        KeyboardButton button1 = KeyButtonUtil.keyButton("Combo+pepsi");
        KeyboardButton button2 = KeyButtonUtil.keyButton("Lavash");
        KeyboardButton button3 = KeyButtonUtil.keyButton("Shawarma");
        KeyboardButton button4 = KeyButtonUtil.keyButton("Danar");
        KeyboardButton button5 = KeyButtonUtil.keyButton("Burger");
        KeyboardButton button6 = KeyButtonUtil.keyButton("Hot-Dog");
        KeyboardButton button7 = KeyButtonUtil.keyButton("Dessert");
        KeyboardButton button8 = KeyButtonUtil.keyButton("Beverages");
        KeyboardButton button9 = KeyButtonUtil.keyButton("Garnish");
        KeyboardButton button10 = KeyButtonUtil.keyButton("Back to location menu", ":arrow_left:");

        KeyboardRow keyboardRow1 = KeyButtonUtil.keyRow(button1, button2);
        KeyboardRow keyboardRow2 = KeyButtonUtil.keyRow(button3, button4);
        KeyboardRow keyboardRow3 = KeyButtonUtil.keyRow(button5, button6);
        KeyboardRow keyboardRow4 = KeyButtonUtil.keyRow(button7, button8);
        KeyboardRow keyboardRow5 = KeyButtonUtil.keyRow(button9);
        KeyboardRow keyboardRow6 = KeyButtonUtil.keyRow(button10);

        List<KeyboardRow> keyboardRowList = KeyButtonUtil.keyboardRowList(keyboardRow1, keyboardRow2, keyboardRow3, keyboardRow4, keyboardRow5, keyboardRow6);
        return KeyButtonUtil.replyKeyboardMarkup(keyboardRowList);
    }

    public static ReplyKeyboardMarkup lavashMenu() {
        KeyboardButton button1 = KeyButtonUtil.keyButton("Fitter");
        KeyboardButton button2 = KeyButtonUtil.keyButton("Beef kalampir lavash ");
        KeyboardButton button3 = KeyButtonUtil.keyButton("Chicken kalampir lavash");
        KeyboardButton button4 = KeyButtonUtil.keyButton("Beef pita");
        KeyboardButton button5 = KeyButtonUtil.keyButton("Chicken lavash");
        KeyboardButton button6 = KeyButtonUtil.keyButton("chicken lavash with cheese");
        KeyboardButton button7 = KeyButtonUtil.keyButton("Beef lavash with cheese");
        KeyboardButton button8 = KeyButtonUtil.keyButton("Back to all meals menu", ":arrow_left:");

        KeyboardRow keyboardRow1 = KeyButtonUtil.keyRow(button1, button2);
        KeyboardRow keyboardRow2 = KeyButtonUtil.keyRow(button3, button4);
        KeyboardRow keyboardRow3 = KeyButtonUtil.keyRow(button5, button6);
        KeyboardRow keyboardRow4 = KeyButtonUtil.keyRow(button7);
        KeyboardRow keyboardRow5 = KeyButtonUtil.keyRow(button8);

        List<KeyboardRow> keyboardRowList = KeyButtonUtil.keyboardRowList(keyboardRow1, keyboardRow2, keyboardRow3, keyboardRow4, keyboardRow5);

        return KeyButtonUtil.replyKeyboardMarkup(keyboardRowList);


    }

    public static ReplyKeyboardMarkup LocationMenu() {
        KeyboardButton button1 = KeyButtonUtil.keyButton("Send lacation", ":round_pushpin:");   //    ":round_pushpin:"
        button1.setRequestLocation(true);
        KeyboardButton button2 = KeyButtonUtil.keyButton("Send phone", ":telephone_receiver:");    // ":telephone_receiver:"
        button2.setRequestContact(true);
        KeyboardButton button3 = KeyButtonUtil.keyButton("Back to menu", ":arrow_left:");         //  ,":arrow_left:"
        KeyboardRow keyboardRow1 = KeyButtonUtil.keyRow(button1, button2);
        KeyboardRow keyboardRow2 = KeyButtonUtil.keyRow(button3);
        List<KeyboardRow> keyboardRowList = KeyButtonUtil.keyboardRowList(keyboardRow1, keyboardRow2);
        return KeyButtonUtil.replyKeyboardMarkup(keyboardRowList);
    }

    public static ReplyKeyboardMarkup Location() {
        KeyboardButton button1 = KeyButtonUtil.keyButton("No");
        KeyboardButton button2 = KeyButtonUtil.keyButton("Yes");
        KeyboardButton button3 = KeyButtonUtil.keyButton("Back to location menu", ":arrow_left:");
        KeyboardRow keyboardRow1 = KeyButtonUtil.keyRow(button1, button2);
        KeyboardRow keyboardRow2 = KeyButtonUtil.keyRow(button3);
        List<KeyboardRow> keyboardRowList = KeyButtonUtil.keyboardRowList(keyboardRow1, keyboardRow2);
        return KeyButtonUtil.replyKeyboardMarkup(keyboardRowList);
    }

    public static ReplyKeyboardMarkup comboPepsiMenu(){
        KeyboardButton button1 = KeyButtonUtil.keyButton("Kids COMBO");
        KeyboardButton button2 = KeyButtonUtil.keyButton("Back to all meals menu", ":arrow_left:");

        KeyboardRow keyboardRow1 = KeyButtonUtil.keyRow(button1);
        KeyboardRow keyboardRow2 = KeyButtonUtil.keyRow(button2);

        List<KeyboardRow> keyboardRowList= KeyButtonUtil.keyboardRowList(keyboardRow1,keyboardRow2);

        return KeyButtonUtil.replyKeyboardMarkup(keyboardRowList);

    }

    public static ReplyKeyboardMarkup shawarmaMenu() {
        KeyboardButton button1 = KeyButtonUtil.keyButton("Shawarma beef");
        KeyboardButton button2 = KeyButtonUtil.keyButton("Chicken shawarma ");
        KeyboardButton button3 = KeyButtonUtil.keyButton("Spicy chicken shawarma");
        KeyboardButton button4 = KeyButtonUtil.keyButton("Spicy beef shawarma");
        KeyboardButton button5 = KeyButtonUtil.keyButton("Back to all meals menu", ":arrow_left:");

        KeyboardRow keyboardRow1 = KeyButtonUtil.keyRow(button1, button2);
        KeyboardRow keyboardRow2 = KeyButtonUtil.keyRow(button3, button4);
        KeyboardRow keyboardRow3 = KeyButtonUtil.keyRow(button5);

        List<KeyboardRow> keyboardRowList = KeyButtonUtil.keyboardRowList(keyboardRow1, keyboardRow2, keyboardRow3);

        return KeyButtonUtil.replyKeyboardMarkup(keyboardRowList);


    }

    public static ReplyKeyboardMarkup donarMenu() {
        KeyboardButton button1 = KeyButtonUtil.keyButton("Donar beef");
        KeyboardButton button2 = KeyButtonUtil.keyButton("chicken donar");
        KeyboardButton button3 = KeyButtonUtil.keyButton("Back to all meals menu", ":arrow_left:");

        KeyboardRow keyboardRow1 = KeyButtonUtil.keyRow(button1, button2);
        KeyboardRow keyboardRow2 = KeyButtonUtil.keyRow(button3);


        List<KeyboardRow> keyboardRowList = KeyButtonUtil.keyboardRowList(keyboardRow1, keyboardRow2);

        return KeyButtonUtil.replyKeyboardMarkup(keyboardRowList);


    }






}
