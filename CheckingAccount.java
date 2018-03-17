public class CheckingAccount extends BankAccount //for use of superclass methods such as withdraw and deposit
{  

static int numOfCheckingAccounts = 0; //count of how many CheckingAccount objects are created

   public CheckingAccount(int initialBalance) //checking account constructor with initial balance
   {  

      super(initialBalance); //using superclass constructor
      numOfCheckingAccounts++; //incrementing count of checking accounts
      
   }

   public void deposit(double amount) 
   {  
  

      super.deposit(amount); 
   }
   
   public void withdraw(double amount) 
   {  
    

      super.withdraw(amount); 
   }

}

