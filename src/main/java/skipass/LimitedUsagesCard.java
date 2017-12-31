package skipass;

import skipass.modes.UsageModes;

import java.util.Date;

public class LimitedUsagesCard extends CardData {
    private int usages_left;

    public LimitedUsagesCard(UsageModes usages) {
        this.usages_left = usages.usages;
    }

    public Date getDate() {
        return new Date();
    }

    public int getUsages() {
        return usages_left;
    }

    public void decreaseUsage() {
        usages_left--;
    }
}
