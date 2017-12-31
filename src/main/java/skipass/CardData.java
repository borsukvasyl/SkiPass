package skipass;

import java.util.Date;

public abstract class CardData {
    private boolean isBlocked;

    public void block() {
        this.isBlocked = true;
    }

    public void open() {
        this.isBlocked = false;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public abstract Date getDate();
    public abstract int getUsages();
    public abstract void decreaseUsage();
}
