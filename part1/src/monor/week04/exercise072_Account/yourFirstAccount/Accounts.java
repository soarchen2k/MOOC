package monor.week04.exercise072_Account.yourFirstAccount;

public class Accounts {
    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        // Creat chong's account
        Account chongsAccount = new Account("Chong 's account", 100);

        // deposit 20 to account
        chongsAccount.deposit(20);

        // print account balance
        System.out.println("The balance is : " + chongsAccount.balance());

        // print account info
        System.out.println(chongsAccount);
    }
}
