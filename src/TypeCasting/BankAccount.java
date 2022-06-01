package TypeCasting;

public class BankAccount {
    static  String bankName="Bank of Gribo";
    String accountHoldersName;
    String AccountNumber;
    Double Balance;

    public static void main(String[] args) {
        System.out.println(BankAccount.bankName);

        BankAccount ba=new BankAccount();

        ba.accountHoldersName="Anup Panchal";
        ba.AccountNumber="123";
        ba.Balance=1345.5;

        System.out.println(ba.accountHoldersName);
        System.out.println(ba.AccountNumber);
        System.out.println(ba.Balance);
    }
}
