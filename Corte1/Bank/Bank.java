package Main;

public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank(){
        accountOne = new CheckingAccount("Zeus", 100, "1");
        accountTwo = new CheckingAccount("Hades", 200, "2");
    }
    public static void main(String[] args) {
        Bank BankOfGods = new Bank();
        System.out.println(BankOfGods.accountOne.getBalance());
        BankOfGods.accountOne.setBalance(5000);
        System.out.println(BankOfGods.accountOne.getBalance());
        System.out.println(BankOfGods.accountOne.getMonthlyInterest());
    }
    
}
