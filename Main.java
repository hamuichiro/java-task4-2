import java.util.stream.IntStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String formatNowDate = dateFormat.format(date);

        IntStream stream = IntStream.range(1, 10000);
        stream.forEach(text -> System.out.println(formatNowDate + " " + text));

       
    }
}

