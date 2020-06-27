package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void should() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 600;
        int actual = cashbackHackService.remain(1400);
        assertEquals(actual, expected);
    }
}