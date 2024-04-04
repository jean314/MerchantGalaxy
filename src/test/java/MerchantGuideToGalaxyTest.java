import org.galaxy.MerchantGuideToGalaxy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MerchantGuideToGalaxyTest {

    @Test
    public void testRomanToArabic() {
        assertEquals("1", MerchantGuideToGalaxy.romanToIntergalactic("I"));
        assertEquals("No es un número romano válido", MerchantGuideToGalaxy.romanToIntergalactic("IIAI"));
        assertEquals("No es un número romano válido", MerchantGuideToGalaxy.romanToIntergalactic("IC"));
        assertEquals("9", MerchantGuideToGalaxy.romanToIntergalactic("IX"));
        assertEquals("58", MerchantGuideToGalaxy.romanToIntergalactic("LVIII"));
        assertEquals("1994", MerchantGuideToGalaxy.romanToIntergalactic("MCMXCIV"));
        assertEquals("3000", MerchantGuideToGalaxy.romanToIntergalactic("MMM"));
    }
}