package skipass;

import java.util.Date;

public class GodCard extends CardData {
    public Date getDate() {
        return new Date();
    }

    public int getUsages() {
        return 1;
    }

    public void decreaseUsage() {
    }
}
