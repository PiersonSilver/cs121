package weekFifteen.dateFormatActivity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TotalCalories {
    DateFormat date = new SimpleDateFormat("MM/dd/yyyy");
    public int dietTotal(int cal, String startDate, String endDate){
        int days = 0;
        try {
            Date start = date.parse(startDate);
            //System.out.println(start);
            Date end = date.parse(endDate);
            //System.out.println(end);
            long dif = end.getTime() - start.getTime();
            //System.out.println(dif);
            days = (int) (TimeUnit.DAYS.convert(dif,TimeUnit.MILLISECONDS));
            //System.out.println(days);
        } catch (ParseException e){
            e.printStackTrace();
        }
        return cal * days;
    }
}
