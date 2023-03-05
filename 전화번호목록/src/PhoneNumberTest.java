import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {
    @Test
    void isPrefix() {
        PhoneNumber phoneNumber1 = new PhoneNumber("119");
        PhoneNumber phoneNumber2 = new PhoneNumber("97674223");
        PhoneNumber phoneNumber3 = new PhoneNumber("1195524421");

        assertFalse(phoneNumber2.isPrefix(phoneNumber1));
        assertTrue(phoneNumber3.isPrefix(phoneNumber1));
    }
}
