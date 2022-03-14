import java.util.stream.IntStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        IntStream stream = IntStream.range(1, 10000);
        stream.forEach(text -> System.out.println(dateFormat.format(LocalDateTime.now()) + " " + text));

       
    }
}

