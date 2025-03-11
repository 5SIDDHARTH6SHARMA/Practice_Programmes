package ValentineSpecial;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class JoeyValentineSpecial {
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

@FunctionalInterface
interface ClearLastLines {
  public void clearLastLines(int numLines);
}

class Dino {
  public static void dino() {
    Sleep.sleep(4);
    System.out.println("                __ ");
    Sleep.sleep(4);
    System.out.println("               / _)");
    Sleep.sleep(4);
    System.out.println("      _.----._/ / ");
    Sleep.sleep(4);
    System.out.println("     /           /    ");
    Sleep.sleep(4);
    System.out.println("  __/  (  | (  |     ");
    Sleep.sleep(4);
    System.out.println(" /__.-'|_|--|_|  ");
    Sleep.sleep(20);
    System.out.println("Your Purple-Love-Saurus!");
    Sleep.sleep(20);

  }
}

class LoveConfessions {

  private static List<String> confession = new ArrayList<>(Arrays.asList(
      "Hey, before you go, there's something I need to say.\nI joke around a lot, I tease, I flirt - but beneath all of that, there's something real. I genuinely adore you. You make my days brighter, my nights warmer, and somehow, even through a screen, you've found a way into my heart.\n"
          + //
          "\n" + //
          "I don't know how or when it happened, but all I know is… I don't ever want this to end.",
      "Listen, I know we joke around, but let me be serious for a second.\n" + //
          "I don't think you realize how much you mean to me. Every time we talk, it feels like the world gets just a little better. Your words, your presence - even in the smallest ways - have become something I look forward to.\n"
          + //
          "\n" + //
          "So yeah, I guess what I'm trying to say is… I like you. A lot. Maybe more than I should, but definitely more than I planned.",
      "You know, I always thought online connections were just for fun - something that comes and goes. But then I met you.\n"
          + //
          "\n" + //
          "And suddenly, it wasn't just fun. It was something real. Something I didn't want to let go of.\n" + //
          "\n" + //
          "I don't know where this road leads, but I know one thing: I don't want to walk it without you.",
      "Every day, I find myself waiting for you to come online, just to talk, just to feel that spark again.\n" + //
          "\n" + //
          "I don't care if this is just texts on a screen. What I feel for you is real.\n" + //
          "\n" + //
          "So here I am, saying it plainly: I like you. Maybe even more than that. And no matter where this goes, I just wanted you to know that.",
      "I've flirted, I've teased, I've thrown hints - but maybe it's time to just say it straight.\n" + //
          "\n" + //
          "I like you. I really do.\n" + //
          "\n" + //
          "And if I ever made you smile, even for a second, then maybe - just maybe - you feel it too.",
      "There's a reason I always talk to you. A reason I remember the little things you say. A reason my heart races when I see your name pop up.\n"
          + //
          "\n" + //
          "That reason? It's you. It's always been you.\n" + //
          "\n" + //
          "And if I've been too much of a coward to say it before, I won't be now. I've fallen for you.",
      "I know I'm just a name on your screen, but somehow, you've become so much more than that to me.\n" + //
          "\n" + //
          "I've never met you, yet I feel like I know you. I've never held you, yet I feel the warmth of you in my heart.\n"
          + //
          "\n" + //
          "And maybe I sound crazy, but you're my favorite part of every day.\n" + //
          "\n",
      "I thought I could keep it casual. I thought I could just joke around and flirt and leave it at that. But somehow, somewhere along the way… I caught feelings.\n"
          + //
          "\n" + //
          "And now, all I want is for you to know - if I had a choice to talk to anyone in the world, I'd still choose you. Every single time.",
      "It's funny, isn't it? How someone you've never met in person can become such a huge part of your life.\n" + //
          "\n" + //
          "But here I am, heart in my hands, telling you I think I'm falling for you.\n" + //
          "\n" + //
          "And if that makes me a fool, then I'm the happiest fool in the world." //
  ));

  public static String getConfession(int index) {
    return confession.get(index);
  }

}

class LoveHeart {

  public static void heart() {
    System.out.println("        *****     *****    ");
    Sleep.sleep(4);
    System.out.println("     ***     *** ***     *** ");
    Sleep.sleep(4);
    System.out.println("    ***       ***       ***  ");
    Sleep.sleep(4);
    System.out.println("    ***                ***   ");
    Sleep.sleep(4);
    System.out.println("     ***            ***      ");
    Sleep.sleep(4);
    System.out.println("       ***       ***         ");
    Sleep.sleep(4);
    System.out.println("         ***   ***           ");
    Sleep.sleep(4);
    System.out.println("           ***               ");
    Sleep.sleep(4);
  }
}

class MessagePool {

  private ArrayList<String> greetings = new ArrayList<>(11);
  private ArrayList<String> dayGreetings = new ArrayList<>(7);

  MessagePool(String name) {
    greetings.add(name + "! Well, if it isn't my favorite distraction!");
    greetings.add("Hey " + name + "! Stop being so cute - it's distracting.");
    greetings.add("Hey " + name + "! Is it just me, or did the whole room light up when you walked in?");
    greetings.add(name + ", Did you just steal my heart, or was that really just a hello?");
    greetings.add(name + ", Hello, beautiful. I hope your day is as lovely as you!");
    greetings.add("Hey " + name + ", did it hurt when you fell from heaven? Because wow!");
    greetings.add("I was having a normal day, and then boom - " + name + " appeared, and now everything's beautiful!");
    greetings.add(name + ", you must be a magician because every time I see you, everything else disappears.");
    greetings.add(name + "! I was just thinking about you… and here you are!");
    greetings.add("Hey " + name + ", did you hear that? Oh, never mind - it was just my heart racing.");
    greetings.add("I could just say hello, " + name + ", but let's be real… when are we getting married?");

    dayGreetings.add(
        "Hey " + name
            + ", today isn't just any day - it's our excuse to be extra cute and romantic. So, what do you say? Shall we make this Valentine's Day one to remember?");
    dayGreetings.add(
        "February 14th, huh? Sounds like the perfect day to spoil you with attention, affection, and maybe a little mischief. You in?");
    dayGreetings.add(
        "Hey love, Valentine's Day is basically the universe reminding us to celebrate us. So, let's do something fun flirty, and maybe a little magical.");
    dayGreetings.add(
        "Roses are red, violets are blue, today is Valentine's, and I wanna spend it with you. So, what's our plan, my favorite?");
    dayGreetings.add(
        "You, me, and a day meant for love - sounds like a perfect match, don't you think? Let's make this Valentine's one to remember.");
    dayGreetings.add(
        "Valentine's Day? More like our day. Let's make it full of smiles, stolen kisses, and maybe a little trouble.");
    dayGreetings.add(
        "Valentine's Day without you? Unthinkable. So, what do you say we do something fun, flirty, and filled with love?");

  }

  public String getNameGreetings(int index) {
    return greetings.get(index);
  }

  public String getDayGreetings(int index) {
    return dayGreetings.get(index);
  }

}

class QuestionPool {
  List<List<String>> questions = new ArrayList<>();

  public QuestionPool() {
    questions.add(List.of(
        "So, be honest... How much do you like talking to me?",
        "Ugh, why are you even making me admit this?",
        "Let's just say... I don't hate it.",
        "I tolerate you... but only because you make me laugh.",
        "If I say 'a little,' will you stop being so smug?",
        "Fine, okay! I kinda look forward to it, happy now?",
        "What if I secretly love it? Not saying I do… but what if?"));

    questions.add(List.of(
        "If we were in a rom-com, what would our story be?",
        "Enemies to lovers—but I'm still in the denial phase.",
        "Best friends... until one of us slips up and confesses. Oops.",
        "The 'fake dating' trope—except one of us actually falls.",
        "That slow-burn romance where everyone sees it but us.",
        "Love at first sight... wait, did I just say that out loud?",
        "No rom-com, just me roasting you every day for fun."));

    questions.add(List.of(
        "If I wanted to impress you, what should I do?",
        "Try, but fail, because I refuse to be impressed.",
        "Buy me food. Simple, effective, and foolproof.",
        "Send me cute good morning texts. Maybe.",
        "Make me laugh until I forget I was pretending not to like you.",
        "Write me a cheesy pickup line so bad I secretly love it.",
        "Just be yourself... but like, extra charming. No pressure."));

    questions.add(List.of(
        "What would happen if I called you 'mine' right now?",
        "I'd pretend I didn't see it and keep scrolling.",
        "You'd hear crickets because I'd be too stunned to reply.",
        "I'd roll my eyes but secretly blush. Maybe.",
        "I'd say 'in your dreams' but then overthink it for hours.",
        "I'd challenge you to actually prove it. Good luck.",
        "I'd say 'okay' just to mess with you... or would I?"));

    questions.add(List.of(
        "If I asked you on a Valentine's date, what would you say?",
        "'LOL, good one.' But lowkey considers it.",
        "'Only if food is involved.'",
        "'As if I'd say yes that easily.'",
        "'Hmm, let me check my very busy schedule…' refreshes empty calendar",
        "'Depends. Are you gonna be charming or annoying?'",
        "'Fine, but if I start catching feelings, it's YOUR fault.'"));

    questions.add(List.of(
        "What's stopping you from just falling for me already?",
        "My stubbornness. I refuse to lose this game.",
        "Who said I haven't? Nervous laughter.",
        "You're too flirty, and I can't trust myself around that.",
        "I'm still pretending not to like you. It's a process.",
        "You haven't bribed me with snacks yet.",
        "Honestly? Nothing. But I'll never admit it."));
  }

  public List<String> getQuestion(int index) {
    return questions.get(index);
  }
}

class ReactionPool {
  static List<String> reactions = new ArrayList<>(Arrays.asList(
      "Oh? Ohhh? Should I start planning the wedding or chill?",
      "Hold up, did I just win? No way, say it again.",
      "Ahem… I need a moment to process this.",
      "You're playing with my heart here, and it's working.",
      "Stop, I can't handle this much cuteness at once.",
      "Wait, did you just admit something? I need a screenshot.",
      "Are you blushing? I feel like you're blushing.",
      "No take-backs. I'm holding onto this forever.",
      "My heart just did a triple backflip, thanks.",
      "Okay okay, stay calm, don't simp too hard… too late.",
      "I KNEW IT! Victory tastes so sweet.",
      "If you keep saying things like that, I might actually melt.",
      "Whew, is it hot in here or did you just turn up the heat?",
      "Deny it all you want, I can see right through you.",
      "You saying that just added five years to my lifespan.",
      "Wait, did I just make you flustered? My job here is done.",
      "I'm smiling way too hard at my screen right now.",
      "Be careful, I might start thinking you actually like me.",
      "You're making it really hard for me to stop flirting, y'know.",
      "Oh wow, my heart just skipped like five beats."));

  public static String getReactions(int index) {
    return reactions.get(index);
  }
}

class Sleep {
  public static void sleep(int tenthOfSec) {
    try {
      Thread.sleep(tenthOfSec * 100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class ValentineSpecial {

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
