package skipass;

import skipass.modes.DayModes;
import skipass.modes.UsageModes;

public class SkiPassFactory {
    public SkiPass newSkiPass(DayModes dayModes, UsageModes usageModes) throws Exception {
        CardData cardData;

        if (dayModes.equals(DayModes.UNLIMITED) && usageModes.equals(UsageModes.UNLIMITED)) {
            cardData = new GodCard();
        }
        else if (usageModes.equals(UsageModes.UNLIMITED)) {
            cardData = new LimitedDaysCard(dayModes);
        }
        else if (dayModes.equals(DayModes.UNLIMITED)) {
            cardData = new LimitedUsagesCard(usageModes);
        }
        else {
            throw new Exception("Invalid modes");
        }

        return new SkiPass(cardData);
    }
}
