
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@FunctionalInterface
public interface RandomLogGenerator {
  public List<String> label = new ArrayList<>(Arrays.asList(
      "Warning",
      "Logging",
      "Error"));

  public List<String> LogEntries = new ArrayList<>(Arrays.asList(
      "User John logged in",
      "User Alice uploaded a file",
      "Failed to load resource",
      "High memory usage detected",
      "Database connection lost",
      "User Bob logged out"));

  public Random random = new Random();
  public StringBuilder log = new StringBuilder();
  public Path path = Paths.get("LogEntries.log");

  public void logGenerator(int number);

}
