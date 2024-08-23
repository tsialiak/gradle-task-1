package ru.clevertec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void testIsPositiveNumber() {
        boolean result = StringUtils.isPositiveNumber("17");
        Assertions.assertTrue(result);
    }
}
