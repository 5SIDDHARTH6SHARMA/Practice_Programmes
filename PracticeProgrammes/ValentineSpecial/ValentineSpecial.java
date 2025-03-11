package ValentineSpecial;

//import java.util.Scanner;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.Date;
// import java.util.Set;
import java.util.Random;

public class ValentineSpecial {

  private String name, myName = "Joey: ";
  int firstCounter = 0, secondCounter = 1;

  // Scanner scanner = new Scanner(System.in);
  Random random = new Random();
  QuestionPool questionPool = new QuestionPool();

  ValentineSpecial(String name) {
    this.name = name;
    if (name.toLowerCase().equals("fazmila"))
      this.name = name + " Ji";
    if (name.toLowerCase().equals("tomate"))
      this.myName = "Tribbi: ";
  }

  ClearLastLines clear = (lines) -> {
    for (int i = 0; i < lines; i++) {
      System.out.print("\033[A"); // Move cursor up
      System.out.print("\033[2K"); // Clear entire line
    }
  };

  public void greet() {
    MessagePool pool = new MessagePool(name);
    Sleep.sleep(10);
    System.out.println("\n" + myName + pool.getNameGreetings(random.nextInt(11)));
    Sleep.sleep(50);
    System.out.println("\n" + myName + pool.getDayGreetings(random.nextInt(7)));
    Sleep.sleep(60);
    if (name.toLowerCase().contains("tomate")) {
      Dino.dino();
      System.out.println(myName + "Ich Liebe Dich!");
    }
    if (name.toLowerCase().contains("fazmila") || name.toLowerCase().contains("sneha")
        || name.toLowerCase().contains("mubthi"))
      System.out.println("\n" + myName + "Nan Unnai Katalikkiren.");
  }

  public void questionTime() {
    Sleep.sleep(20);
    System.out.println("...\n");

    questionPool.getQuestion(random.nextInt(6)).forEach(question -> {
      if (firstCounter == 0) {
        System.out.println("Q." + ((firstCounter++) + secondCounter) + " " + question);
        Sleep.sleep(40);
      } else {
        System.out.println("    " + (firstCounter++) + " " + question);
        Sleep.sleep(10);
      }

    });

    firstCounter = 0;
    secondCounter++;
    System.out.println("\n...\n\n");
    Sleep.sleep(50);
  }

}
