import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/* Name of the class has to be "Main" only if the class is public. */
public class test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
         DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("EEE, dd MMM yyyy HH:mm:ss zzz");
        LocalDateTime dateTime = LocalDateTime.parse("Wed, 16 Mar 2016 15:38:00 GMT", formatter);
//        LocalDateTime dateTime = LocalDateTime.now();
//         Thread.sleep(1000);
//         Thread.sleep(3000);
        // System.out.println(LocalDateTime.now(zone)now());
        System.out.println(dateTime.getChronology());
         long m = Duration.between(dateTime,LocalDateTime.now()).toMillis();
         System.out.println(m);
         
      
         
         
    }
}