import bank.ATM;
import bank.Bank;
import client.Client;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.checkAvailableClient();
    }
}