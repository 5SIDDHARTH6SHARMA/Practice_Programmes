package ValentineSpecial;

import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ClearLastLines clearLastLines = (numLines) -> {
      for (int i = 0; i < numLines; i++) {
        System.out.print("\033[A");
        System.out.print("\033[2K");
      }
    };
    Boolean toContinue = true, askAgain = true;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    heading();
    Sleep.sleep(20);
    System.out.println("\nHey! May I know your name, pwease..? \n...\n");

    ValentineSpecial myValentineSpecial = new ValentineSpecial(scanner.nextLine());
    myValentineSpecial.greet();
    System.out.println("\n~ >.< ~  I have a question for you dear, may I ask? (Yes/No)  ~ >.< ~\n ");
    if (scanner.nextLine().toLowerCase().equals("no")) {
      Sleep.sleep(10);
      System.out.println("\nT.T  P W E A S E   T.T\n");
    } else {
      System.out.println("\n THANK YOU...\n");
      askAgain = false;
    }
    if (askAgain)
      if (scanner.nextLine().toLowerCase().equals("no")) {
        Sleep.sleep(10);
        System.out.println("\n-.-  WELL, IT'S MY PROGRAM, I WILL ASK AND YOU HAVE TO ANSWER, huh... \n \n");
      }

    while (toContinue) {
      myValentineSpecial.questionTime();
      scanner.nextLine();
      Sleep.sleep(10);
      System.out.println(ReactionPool.getReactions(random.nextInt(20)));
      Sleep.sleep(40);
      System.out.println("\n~O.O~ <3 ALRIGHT DEAR, MAY I ASK ONE MORE QUESTION? (Yes/No) ~O.O~");
      if (scanner.nextLine().toLowerCase().equals("no")) {
        Sleep.sleep(10);
        if (askAgain)
          System.out.println("\n^.^ ALRIGHT HUN.. I WON'T FORCE YOU THIS TIME.. ^.\n");
        else
          System.out.println("\nALRIGHT HUN!!\n");
        Sleep.sleep(20);
        toContinue = false;
      } else
        System.out.println("\n~O///O~ Heheheee... THANK YOU ~O///O~\n");
      Sleep.sleep(25);

      clearLastLines.clearLastLines(21);
    }

    System.out.println("\n\n ....\n\n Heyy... I am scared, but I do want to say something...\n");
    Sleep.sleep(20);
    System.out.println(LoveConfessions.getConfession(random.nextInt(9)));
    System.out.println("\n...\n\n");
    Sleep.sleep(50);
    LoveHeart.heart();
    scanner.close();
  }

  private static void heading() {

    System.out.println("**************************************************");
    System.out.println("*         W E L C O M E   T O   T H E            *");
    System.out.println("*      V A L E N T I N E - S P E C I A L         *");
    System.out.println("*                                                *");
    System.out.println("*           ~ >.< LET'S BEGIN! >.< ~             *");
    System.out.println("**************************************************\n\n");
  }

}
