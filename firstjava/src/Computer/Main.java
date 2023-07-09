package Computer;

public class Main {

  public static void main(String[] args) {
    Dimensions dimensions = new Dimensions(20, 20, 5);
    Case theCase = new Case("2243", "Dell", "250", dimensions);

    Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));

    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v-11");

    PC thePC = new PC(theCase, theMonitor, theMotherboard);
    thePC.PowerUp();

  }
}