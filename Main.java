
public class Main {

    public static void main(String[] args) {

        
        BankAccount account1 = new BankAccount(
            101, "Rohit", 5000
        );

       
        BankAccount account2 = new BankAccount(
            102, "Rahul", 10000
        );

        System.out.println("\nAccount 1 : ");

        account1.displayDetails();

        account1.deposit(2000);

        account1.withdraw(1000);

        account1.checkBalance();

     
        System.out.println("\nACCOUNT 2 : ");

        account2.displayDetails();

        account2.deposit(3000);

        account2.withdraw(2000);

        account2.checkBalance();

  
        System.out.println("\nFINAL : ");

        System.out.println("\nAccount 1:");
        account1.displayDetails();

        System.out.println("\nAccount 2:");
        account2.displayDetails();
    }
}
