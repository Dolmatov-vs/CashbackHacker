package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldAmountToSpend() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 600;
        int actual = cashbackHackService.remain(1400);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldMaxSpent() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        assertEquals(actual, expected);
    }
}