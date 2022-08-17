package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackGameTest {
    @Test
   public void runBlackJack_totalThan21Burst_True() {
        BlackJackGame   testBlackJack = new BlackJackGame();
        assertEquals(true, testBlackJack.runBlackJack());
    }
}