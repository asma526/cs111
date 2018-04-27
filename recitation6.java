public class Dog{
  private String DogName;
  public Dog(String name){
    DogName = name;
  }
}

//Exercise 1

public class BankAcc{
  private double balance;
  public String name;
  private String address;
  private String accountNumer;

  public BankAcc(String acctnum, String name, String addr){
    this.accountNumber = acctnum;
    this.name = name;
    this.address = addr;
    this.balance = 0;
  }
  public BankAcc(String acctnum, String name, String addr, double initialDeposit){
    this.accountNumber = acctnum;
    this.name = name;
    this.address = addr;
    this.balance = initialDeposit;
  }
  public double Withdraw(double withdrawAmount){
    return balance -= withdrawAmount;
  }
  public double Deposit(double depositAmount){
    return balance += depositAmount;
  }
}
