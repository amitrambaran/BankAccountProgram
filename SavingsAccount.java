public class SavingsAccount extends BankAccount //for use of superclass methods such as withdraw and deposit
{  
   private double interestRate; //interest rate for savings, eg. 5% = "5"
	

   public SavingsAccount(double rate) //setting interest rate with constructor
   {  
      interestRate = rate;
   }
   
   public SavingsAccount(double balance, double rate) //setting interest rate with constructor as well as setting initial balance
   {  
	  super(balance); 
      interestRate = rate;
   }
   

   public void addInterest() //adding interest to savings account
   {  
      double interest = getBalance() * interestRate / 100;
      deposit(interest); 
   }
   

}

