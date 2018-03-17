 public class AccountTester //various tests to check if program works
{  
   public static void main(String[] args)
   {  
     
	   CheckingAccount mycheck = new CheckingAccount(500);
	   SavingsAccount  mysave  = new SavingsAccount(1000,5);
	   
	   

	   
	   System.out.println("Balance in savings: " + mysave.getBalance());
	   System.out.println("Balance in checking: " + mycheck.getBalance());
	   
	   mycheck.withdraw(50);
	   mycheck.deposit(100);
	   
	   mysave.withdraw(500);
	   mysave.deposit(650.5);
	   
	   System.out.println("Balance in savings: " + mysave.getBalance());
	   System.out.println("Balance in checking: " + mycheck.getBalance());
	   
	   mysave.addInterest();
	   System.out.println("Balance in savings: " + mysave.getBalance());
	   
	   System.out.println("Number of checking accounts: " + CheckingAccount.numOfCheckingAccounts);
	   CheckingAccount mycheck2 = new CheckingAccount(500);
	   System.out.println("Number of checking accounts: " + CheckingAccount.numOfCheckingAccounts);
   }
}

