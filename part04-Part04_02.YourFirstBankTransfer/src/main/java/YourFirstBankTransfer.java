
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account first = new Account("Matthews account", 1000);
        Account second = new Account("My account", 0);

        first.withdrawal(100.0);
        second.deposit(100.0);

        System.out.println(first.toString());
        System.out.println(second.toString());
    }
}
