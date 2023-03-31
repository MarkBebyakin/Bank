package bank;

import client.Client;

import java.util.Scanner;

public class Bank implements Nothing {
    Client client = new Client();
    double balance = 10000;
    double[] rates = {75.45, 80.15, 10.34};


    @Override
    public void checkExchangeRates() {

        for (int i = 0; i <= rates.length; i++) {

            rates[i] = Math.random() * 10;
            System.out.println(rates[i]);

            double usd = rates[0];
            double euro = rates[1];
            double yuan = rates[2];
        }

    }

    public void checkAvailableClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер карты");
        String available = scanner.nextLine();

        for (int i = 0; i < client.billNumber.length; i++) {
            if (available.charAt(13) + available.charAt(14) + available.charAt(15) ==
                    client.billNumber[i].charAt(5) + client.billNumber[i].charAt(6) + client.billNumber[i].charAt(7)) {
                System.out.println("Клиент существует");

                bank.ATM atm = new bank.ATM();
                bank.ATM.DataClient dataClient = atm.new DataClient();
                dataClient.enterCard();

                break;
            }
        }
        System.out.println("Клиент не существует");
        checkAvailableClient();
    }

    public void createBill() {
        class Bill {

            public Bill() {
                double bill = balance;
            }
        }
    }
}
