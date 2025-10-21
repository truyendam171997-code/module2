public class BankAccount {

    private String accountNumber;
    private String accountHolder ;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public BankAccount(){}


//- deposit(double amount): tang so du tai khoan
//- withdraw(double amount): giam so du tai khoan neu du duoc
//- getBalance(): tra ve so du hien tai
//
    public void deposit(double amount){
        this.balance += amount;
    }
    public double withdraw(double amount){
         if (this.balance < amount){
             System.out.println("Not enough money");
             return 0;
         }
         else {
             return  this.balance -= amount;
         }
    }
    public double getBalance(){
        return this.balance;
    }
    public String getinfo(){
        return "Account Number: " + accountNumber + "\n" + "Account Holder: " + accountHolder + "\n" + "Balance: " + balance;
    }

}
