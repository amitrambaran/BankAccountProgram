public class BankAccount
{  
   protected double balance; //initial balance
	
	
   public BankAccount()
   {  
      balance = 0; //balance to 0
   }


   public BankAccount(double initialBalance) //constructor with initial balance
   {  
      balance = initialBalance; 
   }
 
 
   public void deposit(double amount) //deposit method
   {  
	  balance = balance + amount;
   }

 
   public void withdraw(double amount) //withdraw method
   { 
	  balance = balance - amount;
   }

 
   public double getBalance() //returns balance of account
   {  
      return balance; 
   }

}

