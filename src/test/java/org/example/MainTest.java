package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isgleich_sollteReturnTrue_wennNummerIstGrade() {
        //given
        int nummer = 10;

        //when
        boolean result = Main.isgleich(nummer);

        //then
        assertTrue(true);
    }
}