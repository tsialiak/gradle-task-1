package ru.clevertec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void testIsPositiveNumber() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("17"));
        Assertions.assertTrue(StringUtils.isPositiveNumber("17.55"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("-44"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("0"));
        Assertions.assertFalse(StringUtils.isPositiveNumber(null));
    }
}
