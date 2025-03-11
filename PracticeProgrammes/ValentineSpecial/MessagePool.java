package ValentineSpecial;

import java.util.ArrayList;

public class MessagePool {

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
