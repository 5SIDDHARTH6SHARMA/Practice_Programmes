package Banking;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Banking[] account = new Banking[10];

    Scanner scan = new Scanner(System.in);

    // infinite loop so that program don't get terminated and objects don't get
    // destroyed.
    while (true) {
its 9,35 
    
      System.out.print("Are you existing customer of SBI? Y/N\n");
      String response = scan.next();

      // checking the first character of the response.
      switch (response.substring(0, 1)) {
        case "Y", "y" -> {
          System.out.print("\nEnter your name: ");
          scan.nextLine();
          String name = scan.nextLine();
          System.out.print("\nEnter your account number: ");
          String accountNumber = scan.next();

          // in the array of object, checking for the account having the respective
          // accountNumber.
          for (int i = 0; i < 10; i++) {
            if (account != null) {
              if (accountNumber.equals(account[i].getAccountNumber())) {
                account[i].customer(name, accountNumber);
                break;
              }
            }

          }
        }

        case "N", "n" -> {
          System.out.print("\nEnter your name: ");
          scan.nextLine();
          String name = scan.nextLine();
          System.out.print("\nEnter your phone number: ");
          String phoneNumber = scan.next();
          for (int i = 0; i < 10; i++) {
            if (account[i] == null) {
              account[i] = new Banking(name, phoneNumber);
              break;
            }
          }
        }

        default -> {
          System.out.print("\nCheck your response.");
          scan.close();
          System.exit(0);
        }
      }
    }
  }
}