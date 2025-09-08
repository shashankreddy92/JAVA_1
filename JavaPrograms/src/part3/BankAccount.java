package part3;

//---------------------- 1. Class & Object ----------------------
public class BankAccount {
 // ------------------ 2. Encapsulation ------------------
 private String accountHolder;
 private double balance;

 // Constructor
 public BankAccount(String accountHolder, double balance) {
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // Getters and Setters (Controlled Access)
 public String getAccountHolder() {
     return accountHolder;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: " + amount + " | Balance: " + balance);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
     } else {
         System.out.println("Insufficient balance!");
     }
 }
}

//---------------------- 3. Inheritance ----------------------
class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(String holder, double balance, double interestRate) {
     super(holder, balance);
     this.interestRate = interestRate;
 }

 public void addInterest() {
     double interest = getBalance() * interestRate / 100;
     deposit(interest);
     System.out.println("Interest added: " + interest);
 }
}

//---------------------- 4. Polymorphism ----------------------

//Base Class
class Payment {
 public void makePayment(double amount) {
     System.out.println("Processing generic payment of: " + amount);
 }
}

//Overriding (Runtime Polymorphism)
class CardPayment extends Payment {
 @Override
 public void makePayment(double amount) {
     System.out.println("Payment of " + amount + " done using Card.");
 }
}

class UpiPayment extends Payment {
 @Override
 public void makePayment(double amount) {
     System.out.println("Payment of " + amount + " done using UPI.");
 }
}

//Overloading (Compile-time Polymorphism)
class Loan {
 public void applyLoan(double amount) {
     System.out.println("Loan applied for amount: " + amount);
 }

 public void applyLoan(double amount, int duration) {
     System.out.println("Loan applied for amount: " + amount + " | Duration: " + duration + " years");
 }
}

//---------------------- 5. Abstraction ----------------------
abstract class BankService {
 abstract void serviceDetails();
}

class NetBankingService extends BankService {
 @Override
 void serviceDetails() {
     System.out.println("Net Banking allows fund transfers, bill payments, etc.");
 }
}

//---------------------- 6. Association, Aggregation, Composition ----------------------
class Customer {
 private String name;
 private BankAccount account; // Aggregation (Customer HAS-A BankAccount)

 public Customer(String name, BankAccount account) {
     this.name = name;
     this.account = account;
 }

 public void showDetails() {
     System.out.println("Customer: " + name + " | Balance: " + account.getBalance());
 }
}

