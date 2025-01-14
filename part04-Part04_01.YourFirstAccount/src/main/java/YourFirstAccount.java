
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account accountOne = new Account("Temur Naimat", 100.0);
        accountOne.deposit(20.0);
        System.out.println(accountOne.toString());
    }
}
