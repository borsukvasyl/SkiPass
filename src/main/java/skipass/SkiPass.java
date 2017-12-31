package skipass;

public class SkiPass {
    private static int idCounter = 0;

    private final int id;
    private final CardData cardData;

    public SkiPass(CardData cardData) {
        id = idCounter++;
        this.cardData = cardData;
    }

    public int getId() {
        return id;
    }

    public CardData getCardData() {
        return cardData;
    }
}
