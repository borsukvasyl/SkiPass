import org.junit.*;
import skipass.SkiPass;
import skipass.SkiPassFactory;
import skipass.modes.DayModes;
import skipass.modes.UsageModes;
import tourniquet.Tourniquet;

import static org.junit.Assert.assertEquals;


public class SuperTest {
    private SkiPass skiPass1;
    private SkiPass skiPass2;
    private SkiPass skiPass3;
    private Tourniquet tourniquet;
    private SkiPassFactory skiPassFactory;

    @Before
    public void setUp() throws Exception {
        skiPassFactory = new SkiPassFactory();
        tourniquet = new Tourniquet();
        skiPass1 = skiPassFactory.newSkiPass(DayModes.UNLIMITED, UsageModes.UNLIMITED);
        skiPass2 = skiPassFactory.newSkiPass(DayModes.ONE_DAY, UsageModes.UNLIMITED);
        skiPass3 = skiPassFactory.newSkiPass(DayModes.UNLIMITED, UsageModes.ONE_LIFT);
    }

    @Test
    public void test() {
        assertEquals(1, skiPass1.getCardData().getUsages());
        assertEquals(true, tourniquet.validateCard(skiPass1));
        assertEquals(1, skiPass1.getCardData().getUsages());
        skiPass1.getCardData().block();
        assertEquals(false, tourniquet.validateCard(skiPass1));

        assertEquals(1, skiPass2.getCardData().getUsages());
        assertEquals(true, tourniquet.validateCard(skiPass2));
        assertEquals(1, skiPass2.getCardData().getUsages());
        skiPass2.getCardData().block();
        assertEquals(false, tourniquet.validateCard(skiPass2));

        assertEquals(1, skiPass3.getCardData().getUsages());
        assertEquals(true, tourniquet.validateCard(skiPass3));
        assertEquals(0, skiPass3.getCardData().getUsages());
        assertEquals(false, tourniquet.validateCard(skiPass1));
    }
}
