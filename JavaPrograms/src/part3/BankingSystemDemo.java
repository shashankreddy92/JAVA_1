package part3;

//---------------------- Main Class ----------------------
public class BankingSystemDemo {
public static void main(String[] args) {
   // Class & Object + Encapsulation
	BankAccount acc1 = new BankAccount("Alice", 5000);

   acc1.deposit(1000);
   acc1.withdraw(2000);

   // Inheritance
   SavingsAccount acc2 = new SavingsAccount("Bob", 8000, 5);
   acc2.addInterest();

   // Polymorphism - Overriding
   Payment payment1 = new CardPayment();
   Payment payment2 = new UpiPayment();
   payment1.makePayment(1000);
   payment2.makePayment(2000);

   // Polymorphism - Overloading
   Loan loan = new Loan();
   loan.applyLoan(50000);
   loan.applyLoan(100000, 5);

   // Abstraction
   BankService service = new NetBankingService();
   service.serviceDetails();

   // Association/Aggregation
   Customer customer1 = new Customer("Charlie", acc1);
   customer1.showDetails();
}
}
