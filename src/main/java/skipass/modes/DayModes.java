package skipass.modes;

public enum DayModes {
    ONE_DAY(1),
    TWO_DAYS(2),
    FIVE_DAYS(5),
    SEVEN_DAYS(7),
    UNLIMITED(-1);

    public int days;

    DayModes(int days) {
        this.days = days;
    }
}
