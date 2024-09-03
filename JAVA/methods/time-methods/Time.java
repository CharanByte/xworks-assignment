import java.time.LocalTime;
public class Time {

    public static void main(String[] args) {
        LocalTime time1=LocalTime.now();
        System.out.println(time1);

         LocalTime time2=LocalTime.of(2,34,50,006546);
         System.out.println(time2);

      LocalTime  time3= time1.plusHours(2);
         System.out.println(time3);
         System.out.println(time3.plusMinutes(10));

         System.out.println(time3.minusHours(1));


    }
}