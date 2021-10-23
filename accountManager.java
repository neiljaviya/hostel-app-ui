public abstract class BankAccount
{
public String accountnumber;
public String ownername;
public double balance;
public double deposite(double amount)
{ return balance += amount; };
public double withdraw(double amount)
{ return balance -= amount; };

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public double getBalance() {
        return balance;
    }
 
}


public class SavingsAccount extends BankAccount
{ 
public void withdraw(double amount)
{ if(getBalance()-amount >= 0)
  { balance -= amount;
    System.out.println(amount + "Withdraw");}
  else 
  {System.out.println("Invalid Input");}
}

}

public class CheckingAccount extends BankAccout
{
public void withdraw(double amount)
{ if(getBalance()-amount >= 0)
  { balance -= amount;
    System.out.println(amount + "Withdraw");}
  else 
  {System.out.println("Invalid Input");}
}
}

public class Main
{ 
public static void main(String args[])
{ BankAccount b = new BankAccoutn();
b.balance = 25000;
System.out.println(b.withdraw = 1000);
System.out.println(b.deposite = 5000);
}
}
