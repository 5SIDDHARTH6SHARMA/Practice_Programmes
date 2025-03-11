import java.util.Scanner;

public class TaskSchedulerFactory {
  public void start() {
    System.out.printf(
        "This is a task scheduler. Made with love for Tomate 💖");

    Scanner scan = new Scanner(System.in);
    TaskScheduler scheduler = new TaskScheduler();
    Boolean toContinue = true;
    String input;
    do {
      System.out.printf(
          "\nPress 1 to add new task(s).\nPress 2 to remove a task. \nPress 3 to execute the next task in your tasks list. \nPress 4 to display all the tasks you have in your tasks list. \nPress any other key to exit.\n...\n");

      input = scan.nextLine();
      switch (input) {
        case "1" -> scheduler.addTask();
        case "2" -> scheduler.removeTask();
        case "3" -> scheduler.executeNext();
        case "4" -> scheduler.displayTasks();
        default -> toContinue = false;
      }

      Boolean innerContinue = true;
      while (innerContinue) {
        System.out.println("Do you wish to continue? (Yes/No)");
        input = scan.nextLine();

        switch (input) {
          case "No", "no" -> {
            toContinue = false;
            innerContinue = false;
          }
          case "yes", "Yes" -> {
            toContinue = true;
            innerContinue = false;
          }
          default -> System.out.println("Invalid Input!!");
        }
      }
    } while (toContinue);

    System.out.println("Thank you for using Task Scheduler. Have a very beautiful day ahead.");

    scan.close();

  }
}
