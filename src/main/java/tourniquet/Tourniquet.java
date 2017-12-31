package tourniquet;

import skipass.SkiPass;

public class Tourniquet {
    private static final CardValidator cardValidator = new CardValidator();

    public boolean validateCard(SkiPass card) {
        if (cardValidator.isValid(card)) {
            card.getCardData().decreaseUsage();
            return true;
        }
        return false;
    }

    public void block(SkiPass skiPass) {
        skiPass.getCardData().block();
    }

    public void open(SkiPass skiPass) {
        skiPass.getCardData().open();
    }
}
