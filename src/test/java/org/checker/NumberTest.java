package org.checker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberTest {
    @Test
    @DisplayName("Evaluates true if the University number is valid")
    void testValidUniversityNumber() {
        Number universityNumber = new Number(1, 9, 4, 2, 0, 0, 2);
        assertTrue(universityNumber.isValid());
    }
}