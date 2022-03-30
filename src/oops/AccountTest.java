package oops;

public class AccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.bankAccountHolderName);
        System.out.println(account.bankAccountNumber);
        System.out.println(account.balance);
        System.out.println(BankAccount.bankName);

        float availableBalance = account.deposit(10000);
        System.out.println("Balance after deposit "+availableBalance);
        float updatedBalance = account.withdraw(730);
        System.out.println("Balance after withdraw "+updatedBalance);
    }

    void display(){
        int m1 = 100;
    }
}