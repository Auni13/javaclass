import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class DateTimeExample {

    public static void main(String[] args){
    
        LocalDateTime nowDT = LocalDateTime.now();
        LocalDate nowD = LocalDate.now();
        LocalTime nowT = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        String forrmattedDT = formatter.format(nowDT);

        LocalDate birDate = LocalDate.of(2001, 9, 13);
        Period myAge = Period.between(nowD, birDate);

        System.out.println(nowDT);
        System.out.println(nowD);
        System.out.println(nowT);
        System.out.println(forrmattedDT);
        System.out.println(myAge);
    }
}
