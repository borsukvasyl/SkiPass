package skipass.modes;

public enum UsageModes {
    ONE_LIFT(1),
    TEN_LIFTS(10),
    TWENTY_LIFTS(20),
    FIFTY_LIFTS(50),
    HUNDRED_LIFTS(100),
    UNLIMITED(-1);

    public int usages;

    UsageModes(int usages) {
        this.usages = usages;
    }
}
