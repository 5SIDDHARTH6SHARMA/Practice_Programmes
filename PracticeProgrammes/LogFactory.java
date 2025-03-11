import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class LogFactory {

  LogFactory() {
    RandomLogGenerator logGenerator = number -> {
      for (int i = 0; i < number; i++) {
        String date = "[" + java.time.LocalDateTime.now().toString() + "]";
        String logLabel = RandomLogGenerator.label.get(RandomLogGenerator.random.nextInt(3));
        String logEntry = RandomLogGenerator.LogEntries.get(RandomLogGenerator.random.nextInt(6));

        RandomLogGenerator.log.append(date).append(" ").append(logLabel).append(" ").append(logEntry).append("\n");
      }

      try {
        Files.write(RandomLogGenerator.path, RandomLogGenerator.log.toString().getBytes(StandardCharsets.UTF_8));
      } catch (IOException e) {
        e.printStackTrace();
      }
      System.out.println("Log file generated.");
    };
    logGenerator.logGenerator(10000);
    LogAnalyzer.logSummary();

  }

}
