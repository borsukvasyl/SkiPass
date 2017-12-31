package skipass;

import skipass.modes.DayModes;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LimitedDaysCard extends CardData {
    private Date date;

    public LimitedDaysCard(DayModes dayModes) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, dayModes.days);

        this.date = cal.getTime();
    }

    public Date getDate() {
        return date;
    }

    public int getUsages() {
        return 1;
    }

    public void decreaseUsage() {
    }
}
