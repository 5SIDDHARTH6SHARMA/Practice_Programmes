package ValentineSpecial;

public class Sleep {
  public static void sleep(int tenthOfSec) {
    try {
      Thread.sleep(tenthOfSec * 100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
