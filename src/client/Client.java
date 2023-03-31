package client;

import java.util.HashMap;

public class Client {

    public static HashMap<String, Double> cardBalance = new HashMap<>();



    public String[] surname = {"Kambarov", "Bulavkin", "Zoldick", "Lobyshev", "Bebyakin", "Borodin", "Ermakov",
            "Leon", "Volkov", "Muserskiy"};

    public String[] billNumber = {"05309617", "62098548", "03651057", "16027658", "14939463", "53091558", "62538164",
            "74863289", "95283654", "82543567"};

    public String[] cardNumber = {"2202518913652617", "2202540171140548", "2202599492924057", "2202924783622658",
            "2202784628070463", "2202893368729558", "2202367176351164", "2202348325451289", "2202500733038654",
            "2202072036905567"};

    public String[] code = {"2617", "0548", "4057", "4058", "2658", "0463", "9558", "1164", "1289", "8654", "5567"};


    public void connectCard() {

        cardBalance.put(cardNumber[0], (double) 12420);
        cardBalance.put(cardNumber[1], (double) 0);
        cardBalance.put(cardNumber[2], (double) 0);
        cardBalance.put(cardNumber[3], (double) 0);
        cardBalance.put(cardNumber[4], (double) 0);
        cardBalance.put(cardNumber[5], (double) 0);
        cardBalance.put(cardNumber[6], (double) 0);
        cardBalance.put(cardNumber[7], (double) 0);
        cardBalance.put(cardNumber[8], (double) 0);
        cardBalance.put(cardNumber[9], (double) 0);

        System.out.println(cardBalance);

    }
}