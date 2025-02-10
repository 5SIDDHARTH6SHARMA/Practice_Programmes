public class Main {

    public static void main(String args[]) {

        // FindIndex object1 = new FindIndex("abcdeafbc");

        // System.out.println(object1.getIndex());

        // CountSetBits object2 = new CountSetBits();
        // object2.countSetBits(5654);

        // PowerOfTwo object3 = new PowerOfTwo();
        // System.out.println(object3.isPowerOfTwo(255));

        // Factorial fact = new Factorial();
        // System.out.println("Factorial of the number is: " + fact.factorial(8));

        // MergeSort merge = new MergeSort();
        // merge.printSortedArray();

        // SelectionSort sorting = new SelectionSort();

        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(1, "Send Email");
        scheduler.addTask(2, "Generate Report");
        scheduler.addTask(3, "Backup Database");

        scheduler.executeNext(); // Executes: Send Email
        scheduler.executeNext(); // Executes: Generate Report
        scheduler.executeNext(); // Executes: Backup Database
        scheduler.executeNext(); // Executes: Send Email (loops back)

        scheduler.removeTask(2); // Removes "Generate Report"
        scheduler.executeNext(); // Executes: Backup Database

    }
}
