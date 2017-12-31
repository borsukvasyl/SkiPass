package tourniquet;

import skipass.SkiPass;

import java.util.Date;

public class CardValidator {
    public boolean isValid(SkiPass card) {
        return !card.getCardData().isBlocked() &&
                (card.getCardData().getDate().after(new Date()) || card.getCardData().getDate().equals(new Date())) &&
                card.getCardData().getUsages() > 0;
    }
}
