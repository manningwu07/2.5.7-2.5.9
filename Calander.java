
/*
 * Activity 2.5.9
 * 
 * Modified By: Thaman Suggala & Manning Wu
 * A Calander class for the MediaLibrary program
 */
import java.util.Calendar;

public class Calander {

    public static String getDateTime() {
        Calendar cal = Calendar.getInstance();
        String dateTimeStr = cal.getTime().toString();

        return dateTimeStr;
    }
}
