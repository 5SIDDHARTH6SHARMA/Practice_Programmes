
/*
Create a Java class representing a bank account. The account should have attributes such as account number, account holder name, and balance. Implement methods to deposit, withdraw, and display the account details. Write a separate Java program to demonstrate the usage of this class by creating multiple accounts and performing transactions.
*/
package Banking;

import java.util.Random;
import java.util.Scanner;

public class Banking {

  // Generating random numbers for account number.
  Random random = new Random();
  int randomNumber = random.nextInt();

  Scanner scan = new Scanner(System.in);

  // Default constructor for those who are new to banking.
  Banking(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;

    // New account number generated.
    accountNumber = String.valueOf(Math.abs(randomNumber));
    System.out.println("Your account number is: " + accountNumber);

    // Regestration of new PIN number.
    System.out.print("Register new PIN: ");
    PIN = scan.next();
    System.out.println("PIN registered successfully.");

  }

  // Constructor to allocate values to underlying attributes.
  public void customer(String name, String accountNumber) {
    if (this.name.equals(name) && this.accountNumber.equals(accountNumber)) {
      while (true) {
        System.out.println("""
            Press 1 to deposit amount.
            Press 2 to withdraw amount.
            press 3 to see account details.
            press 4 to exit.
            """);
        int press = scan.nextInt();
        switch (press) {
          case 1 -> {
            System.out.println("Enter the amount to deposit: ");
            double amount = scan.nextDouble();
            deposit(amount);
          }

          case 2 -> {
            System.out.print("Enter the amount to withdraw: ");
            double amount = scan.nextDouble();
            System.out.print("\nEnter your PIN: ");
            String PIN = scan.next();
            withdraw(amount, PIN);
          }

          case 3 -> {
            System.out.print("\nEnter your PIN: ");
            String PIN = scan.next();
            details(PIN);
          }

          case 4 -> {
            return;
          }

          default -> {
            System.out.print("\nWrong Input.");
          }
        }
        ;
      }
    } else {
      System.out.print("\nCheck your credentials.");
      System.exit(0);
    }
  }

  // Attributes related to Banking system.
  private String name;
  private String accountNumber;
  private double balance;
  private String PIN;
  private String phoneNumber;

  // Deposite amount.
  private void deposit(double amount) {
    if (amount > 0)
      balance = balance + amount;
    System.out.println("Deposit successful.");
  }

  // Withdraw amount;
  private void withdraw(double amount, String PIN) {
    if ((amount > 0) && (this.PIN.equals(PIN))) {
      balance = balance - amount;
      System.out.println("Withdrawal successful.");
    } else
      System.out.println("Credential(s) entered is/are wrong. Try again later.");
  }

  // Extract details of account.
  private void details(String PIN) {
    if (this.PIN.equals(PIN))
      System.out.println("""
          Your Account details are:
          Account holder's name: %s
          Phone number         : %s
          Account balance      : %f
          """.formatted(name, phoneNumber, balance));
  }

  // Getter for accountNumber.
  public String getAccountNumber() {
    return accountNumber;
  }
}
