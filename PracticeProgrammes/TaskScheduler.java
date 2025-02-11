// Problem Statement:
// "Design a task scheduler that runs tasks in a circular order. Each task should be executed in sequence, and when the last task is reached, the scheduler should loop back to the first one. Implement operations to add a new task, remove a task, and execute the next task in order."

// ---

// Requirements:
// Create a Task class – Each task has an ID and a description.
// Implement a CircularDoublyLinkedList class – With the following methods:
// addTask(int id, String description): Adds a task at the end.
// removeTask(int id): Removes a task by its ID.
// executeNext(): Executes the next task in the circular list.
// displayTasks(): Prints all tasks in order.
// Write a TaskScheduler class – Uses your custom Circular Doubly Linked List to manage task execution.

// ---

// Expected Functionality:
// If executeNext() is called repeatedly, it will cycle through all tasks indefinitely.
// When a task is removed, the circular order remains intact.
// If all tasks are removed, executeNext() should print "No tasks to execute."

// ---

// Example Usage:
// TaskScheduler scheduler = new TaskScheduler();
// scheduler.addTask(1, "Send Email");
// scheduler.addTask(2, "Generate Report");
// scheduler.addTask(3, "Backup Database");

// scheduler.executeNext();  // Executes: Send Email
// scheduler.executeNext();  // Executes: Generate Report
// scheduler.executeNext();  // Executes: Backup Database
// scheduler.executeNext();  // Executes: Send Email (loops back)

// scheduler.removeTask(2);  // Removes "Generate Report"
// scheduler.executeNext();  // Executes: Backup Database

public class TaskScheduler {

  // Creating a Task class, having attributies ID, Task Description, and two
  // referrences, one to refer previous task, another to refer the next task
  private class Task {
    private int id;
    private String description;
    private Task next, previous;

    // Constructor call to assign ID and Description
    Task(int id, String description) {
      this.id = id;
      this.description = description;
    }

  }

  // Creating some reference variables of type Task for future use, like assigning
  // head to head task, tail to tail task, and temp to help in adding and/or
  // removing tasks
  Task head, tail, temp, index;
  Boolean isStarted = false;

  // addTask method adds a new task at the end of the tasks list
  public void addTask(int id, String description) {

    // Creating a new task with the given ID and description
    Task newTask = new Task(id, description);

    // If the tasks list is empty, making this new task as head and tail both
    if (head == null) {
      head = newTask;
      tail = newTask;
      head.previous = tail;
      tail.next = head;

    }

    // If there is already a task in the tasks list, using temp to add this task at
    // the end and making it tail.
    else {
      temp = tail;
      tail = newTask;
      temp.next = newTask;
      tail.previous = temp;
      tail.next = head;
      head.previous = tail;
      temp = null;
    }
  }

  // removeTask removes a task with the ID that matches with that of the given ID.
  public void removeTask(int id) {

    // if the tasks list is empty then printing error message
    if (head == null) {
      System.out.println("Error!! No task in the task list");
      return;
    }

    // if the tasks list is not empty, then with the help of temp, iterating over
    // all tasks to see which matches with the give ID
    temp = head;
    while (temp.id != id) {

      // if there is not task with the given ID, printing error message
      if (temp.next == head) {
        System.out.println("Error!! Couldn't find the task with given ID");
        return;
      }
      temp = temp.next;
    }

    // if only one task is in the list, then just make head, tail, and index refer
    // to null, all tasks will then be eligible for garbage collection
    if (head == tail) {
      head = null;
      tail = null;
      index = null;
      return;
    }

    // if the task is head task, then assigning the head position to the next task
    if (temp == head)
      head = temp.next;

    // if the task is tail task, then assigning the tail position to the previous
    // task
    if (temp == tail)
      tail = temp.previous;

    // using two new temp reference variables, removing the task with given ID, and
    // updating the index
    Task temp1 = temp.previous;
    Task temp2 = temp.next;
    temp1.next = temp2;
    temp2.previous = temp1;
    temp = null;
    temp1 = null;
    temp2 = null;
    if (index != null && index.next != null)
      index = index.next;
  }

  // executeNext() will execute tasks one after the another per call. Using index
  // reference variable to keep track.
  public void executeNext() {
    if (!isStarted || index == null) {
      index = head;
      isStarted = true;
    }
    System.out.println((index == null ? "No tasks to execute" : "Executes: " + index.description));
    if (index != null && index.next != null)
      index = index.next;

  }

  // simply display all the tasks using do-while loop, starting from head task
  // till head task encounters again
  public void displayTasks() {
    temp = head;
    if (temp == null) {
      System.out.println("No tasks to display");
      return;
    }
    System.out.println("Tasks:");
    do {
      System.out.println(temp.id + " " + temp.description);
      temp = temp.next;
    } while (temp != head);
  }

}