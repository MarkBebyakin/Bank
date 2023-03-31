package bank;


import client.Client;

import java.util.HashMap;
import java.util.Scanner;

public class ATM implements ATMfunction {


    Scanner scanner = new Scanner(System.in);

    Bank bank = new Bank();

    Client client = new Client();

    //choose ATM functions
    private void workATM() {
        System.out.println("Выберите действие" + "\n" + "посмотреть баланс - 1" + "\n"
                + "снять наличные - 2 " + "\n" + "пополнить баланс - 3" +
                "\n" + "выйти - 4");

        String inputAct = scanner.nextLine();

        if (inputAct.equals("1")) {
            checkBalance();
        }
        if (inputAct.equals("2")) {
            cashWithdrawal();
        }
        if (inputAct.equals("3")) {
            refilling();
        }
    }

    @Override
    public void checkBalance() {
        //for (int i = 0; i < cardBalance.size(); i++)
        System.out.println("Ваш баланс - " + Client.cardBalance);
    }

    @Override
    public void refilling() {
        System.out.println("Введите сумму пополнения");

        double addMoney = scanner.nextDouble();
        double balancePlus = addMoney + bank.balance;

        System.out.println("Ваш баланс пополнен на - " + addMoney + " и составляет - " + balancePlus);
        workATM();


    }

    @Override
    public void cashWithdrawal() {
        System.out.println("Введите сумму для снятия");
        double outMoney = scanner.nextDouble();

        double balanceMinus = bank.balance - outMoney;

        System.out.println("Вы сняли - " + outMoney + " ваш баланс составляет - " + balanceMinus);
        workATM();

    }

    public class DataClient {
        public void enterCard() {

            System.out.println("Введите пин-код");

            String inputCode = scanner.nextLine();//input code in scanner

            for (int x = 0; x < client.code.length; x++) {


                if (inputCode.equals(client.code[x])) {
                    workATM();
                    break;
                }
            }
            System.out.println("Пинк-код неверен");
        }

        public void output() {
            bank.checkAvailableClient();
            enterCard();
            workATM();
        }
    }
}
