import java.nio.channels.FileChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;

// This is a log analyzer program. Every log will be of one of the three types, viz. Error, Warning, Logging. This program segregates these logs into three files accordingly. 
// I have made all the methods static as it does only one thing and I will be using it only once, so I thought it would be better to just create everything as static, so no need to create object cuz it will then give warning for not using that object reference variable. 
public class LogAnalyzer {
  private static Path path = Paths.get("LogEntries.log");
  private static Path errorPath = Paths.get("ErrorRecords.log");
  private static Path warningPath = Paths.get("WarningRecords.log");
  private static Path loggingPath = Paths.get("LoggingRecords.log");
  static int byteRead;
  static String helper;

  private static void logSummaryGenerator() {
    // This is a buffer where I will be storing data after retrieving it from the
    // file. I will retrieve data in chunks so to use it efficiently and in a
    // structured way, I will just first store that in a buffer space.
    // This buffer can also be used to write data to the files. However, it will
    // have more data, so I need to segregate each log based on its label, right?
    // So, I created an assistantBuffer which will store only one log entry out from
    // this buffer. Depending on the label of that log entry, errorChannel.write()
    // will write it to the relevant file.
    ByteBuffer buffer = ByteBuffer.allocate(1024);
    ByteBuffer assistantBuffer = ByteBuffer.allocate(1024);

    // Here I am creating channels that will connect to the files. The ones that
    // have the parameter StandardOpenOption.CREATE are the ones that will write to
    // those three segregated files. The tag .CREATE will create these files if they
    // don't exist already. If you don't use this tag, and file is not there with
    // this name, it will throw exception.
    try (FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);
        FileChannel errorChannel = FileChannel.open(errorPath, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        FileChannel warningChannel = FileChannel.open(warningPath, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        FileChannel loggingChannel = FileChannel.open(loggingPath, StandardOpenOption.WRITE,
            StandardOpenOption.CREATE)) {

      // This loop will work till the buffer gets empty. So, if there is not more data
      // in buffer to distribute to those three files, then the loop will stop.
      do {

        // This reads data from the file and writes into the buffer memory.
        channel.read(buffer);

        // This will assign the returned String to the helper variable of type string,
        // one log at a time. More on this has discussed down where this method is
        // defined.
        helper = eachLogEntry(buffer);

        // These three if statements checks what tag that log entry contains, and based
        // on that it writes that log to the respective file
        if (helper.contains("Error")) {
          useAssistantBuffer(assistantBuffer);

          errorChannel.write(assistantBuffer);
        }
        if (helper.contains("Warning")) {
          useAssistantBuffer(assistantBuffer);

          warningChannel.write(assistantBuffer);
        }
        if (helper.contains("Logging")) {
          useAssistantBuffer(assistantBuffer);

          loggingChannel.write(assistantBuffer);
        }
      } while (buffer.position() != 0);
    } catch (IOException e) {

      // It can throw exception in case we couldn't even find the file from where we
      // want to read all these log entries.
      System.out.println("Well... I don't know, I think we couldn't get the file. pfff..!!");
      e.printStackTrace();
    }

  }

  // This is just a helper method. It just takes one log entry that the later
  // method (defined after this one) returns and assigns it to that
  // assistantBuffer. Makes it easier to write using channels, as we cannot pass
  // string to channels.
  private static void useAssistantBuffer(ByteBuffer assistantBuffer) {
    assistantBuffer.clear();
    assistantBuffer.put(helper.getBytes());
    assistantBuffer.flip();
  }

  // This method will take just one line—just one log entry, out from that chunk
  // that channel.read() has written to the buffer. This will then return that one
  // log entry in form of string.
  private static String eachLogEntry(ByteBuffer buffer) {
    Character i;
    StringBuilder log = new StringBuilder();
    log.setLength(0);
    buffer.flip();
    while ((i = ((char) buffer.get())) != '\n') {
      log.append(i);
    }
    if (buffer.hasRemaining())
      log.append((char) buffer.get());
    buffer.compact();
    return log.toString();
  }

  // I created all other methods private. I don't know, just for security reasons,
  // but I have no idea what security, it's just a habit of mine to create all
  // methods and fields private and to call them, I make these kind of caller,
  // getter, setter, and other utility methods and set them public.
  public static void logSummary() {
    logSummaryGenerator();
  }

}
