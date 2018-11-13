import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomCalendar implements Calendar {

    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

    public String dateToString() {
        Date date = new Date();
        return sdf.format(date);
    }
}
